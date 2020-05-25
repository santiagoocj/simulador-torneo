package edu.torneo.simuladortorneo.model;

import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import edu.torneo.simuladortorneo.model.util.Validator;

import java.awt.*;

public class Equipo {

    public static final String NOMBRE_EQUIPO_REQUERIDO = "El nombre del equipo es requerido";
    public static final String NUMERO_MINIMO_DE_JUGADORES = "se necesitan como minimo 11 jugadores para poder ingresar";
    public static final String NUMERO_MAXIMO_DE_JUGADORES = "se necesitan como maximo 25 jugadores para poder ingresar";

    private int codigoEquipo;
    private String nombreEquipo;
    //private Image logo;
    private int numeroJugadores;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGol;
    private int puntos;

    private Equipo(){
        super();
    }

    public static class EquipoBuilder{


        private int codigoEquipo;
        private String nombreEquipo;
        //private Image logo;
        private int numeroJugadores;
        private int partidosJugados;
        private int partidosGanados;
        private int partidosPerdidos;
        private int partidosEmpatados;
        private int golesFavor;
        private int golesContra;
        private int diferenciaGol;
        private int puntos;

        public EquipoBuilder setCodigoEquipo(int codigoEquipo) {
            this.codigoEquipo = codigoEquipo;
            return this;
        }

        public EquipoBuilder setNombreEquipo(String nombreEquipo) {
            this.nombreEquipo = nombreEquipo;
            return this;
        }

        /*public EquipoBuilder setLogo(Image logo) {
            this.logo = logo;
            return this;
        }*/

        public EquipoBuilder setNumeroJugadores(int numeroJugadores) {
            this.numeroJugadores = numeroJugadores;
            return this;
        }

        public EquipoBuilder setPartidosJugados(int partidosJugados) {
            this.partidosJugados = partidosJugados;
            return this;
        }

        public EquipoBuilder setPartidosGanados(int partidosGanados) {
            this.partidosGanados = partidosGanados;
            return this;
        }

        public EquipoBuilder setPartidosPerdidos(int partidosPerdidos) {
            this.partidosPerdidos = partidosPerdidos;
            return this;
        }

        public EquipoBuilder setPartidosEmpatados(int partidosEmpatados) {
            this.partidosEmpatados = partidosEmpatados;
            return this;
        }

        public EquipoBuilder setGolesFavor(int golesFavor) {
            this.golesFavor = golesFavor;
            return this;
        }

        public EquipoBuilder setGolesContra(int golesContra) {
            this.golesContra = golesContra;
            return this;
        }

        public EquipoBuilder setDiferenciaGol(int diferenciaGol) {
            this.diferenciaGol = diferenciaGol;
            return this;
        }

        public EquipoBuilder setPuntos(int puntos) {
            this.puntos = puntos;
            return this;
        }

        public Equipo build() throws BusinessExecption {
            Equipo equipo = new Equipo();
            equipo.codigoEquipo = this.codigoEquipo;
            Validator.validarNombreNulo(nombreEquipo, NOMBRE_EQUIPO_REQUERIDO);
            equipo.nombreEquipo = this.nombreEquipo;
            //equipo.logo = this.logo;
            Validator.ValidarNumeroMinimoDeJugadores(numeroJugadores, NUMERO_MINIMO_DE_JUGADORES);
            Validator.validarNumeroMaximoDeJugadores(numeroJugadores,NUMERO_MAXIMO_DE_JUGADORES);
            equipo.numeroJugadores = this.numeroJugadores;
            equipo.partidosJugados = this.partidosJugados;
            equipo.partidosGanados = this.partidosGanados;
            equipo.partidosPerdidos = this.partidosPerdidos;
            equipo.partidosEmpatados = this.partidosEmpatados;
            equipo.golesFavor = this.golesFavor;
            equipo.golesContra = this.golesContra;
            equipo.diferenciaGol = this.diferenciaGol;
            equipo.puntos = this.puntos;
            return equipo;
        }

    }
}
