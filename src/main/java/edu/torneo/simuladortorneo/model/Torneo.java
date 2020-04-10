package edu.torneo.simuladortorneo.model;

import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import edu.torneo.simuladortorneo.model.util.Validator;

import java.util.List;

public class Torneo {

    public static final String NOMBRE_TORNEO_REQUERIDO = "el nombre del torneo es requerido";

    private int codigoTorneo;
    private String nombreTorneo;
    private int numeroEquipos;
    private List<Equipo> equipos;
    private int numeroPartidosJugar;
    private int partidosJugar;

    private Torneo(){
        super();
    }

    public static class TorneoBuilder{

        private int codigoTorneo;
        private String nombreTorneo;
        private int numeroEquipos;
        private List<Equipo> equipos;
        private int numeroPartidosJugar;
        private int partidosJugar;

        public TorneoBuilder setCodigoTorneo(int codigoTorneo) {
            this.codigoTorneo = codigoTorneo;
            return this;
        }

        public TorneoBuilder setNombreTorneo(String nombreTorneo) {
            this.nombreTorneo = nombreTorneo;
            return this;
        }

        public TorneoBuilder setNumeroEquipos(int numeroEquipos) {
            this.numeroEquipos = numeroEquipos;
            return this;
        }

        public TorneoBuilder setEquipos(List<Equipo> equipos) {
            this.equipos = equipos;
            return this;
        }

        public TorneoBuilder setNumeroPartidosJugar(int numeroPartidosJugar) {
            this.numeroPartidosJugar = numeroPartidosJugar;
            return this;
        }

        public TorneoBuilder setPartidosJugar(int partidosJugar) {
            this.partidosJugar = partidosJugar;
            return this;
        }

        public Torneo build() throws BusinessExecption {
            Torneo torneo = new Torneo();
            torneo.codigoTorneo = this.codigoTorneo;
            Validator.validarNombreNulo(nombreTorneo,NOMBRE_TORNEO_REQUERIDO);
            torneo.nombreTorneo = this.nombreTorneo;
            torneo.numeroEquipos = this.numeroEquipos;
            torneo.equipos = this.equipos;
            torneo.numeroPartidosJugar = this.numeroPartidosJugar;
            torneo.partidosJugar = this.partidosJugar;
            return torneo;
        }
    }

}
