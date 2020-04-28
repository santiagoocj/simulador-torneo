package edu.torneo.simuladortorneo.model;

import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import edu.torneo.simuladortorneo.model.util.Validator;

public class Partido {

    public final static String GOLES_NEGATIVOS = "El equipo no puede tener goles negativos";
    public static final String EQUIPO1_GANADOR = "el ganador es el equipo 1";
    public static final String EQUIPO2_GANADOR = "el ganador es el equipo 2";

    private int codigopartido;
    private Equipo equipo1;
    private Equipo equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private String resultado;

    private Partido(){
        super();
    }

    public static class PartidoBuilder{

        private int codigopartido;
        private Equipo equipo1;
        private Equipo equipo2;
        private int golesEquipo1;
        private int golesEquipo2;
        private String resultado;

        public PartidoBuilder setCodigopartido(int codigopartido) {
            this.codigopartido = codigopartido;
            return this;
        }

        public PartidoBuilder setEquipo1(Equipo equipo1) {
            this.equipo1 = equipo1;
            return this;
        }

        public PartidoBuilder setEquipo2(Equipo equipo2) {
            this.equipo2 = equipo2;
            return this;
        }

        public PartidoBuilder setGolesEquipo1(int golesEquipo1) {
            this.golesEquipo1 = golesEquipo1;
            return this;
        }

        public PartidoBuilder setGolesEquipo2(int golesEquipo2) {
            this.golesEquipo2 = golesEquipo2;
            return this;
        }

        public PartidoBuilder setResultado(String resultado) {
            this.resultado = resultado;
            return this;
        }

        public Partido build() throws BusinessExecption {
            Partido partido = new Partido();
            partido.codigopartido = this.codigopartido;
            partido.equipo1 = this.equipo1;
            partido.equipo2 = this.equipo2;
            Validator.validarGolesNegativos(golesEquipo1,GOLES_NEGATIVOS);
            partido.golesEquipo1 = this.golesEquipo1;
            Validator.validarGolesNegativos(golesEquipo2, GOLES_NEGATIVOS);
            partido.golesEquipo2 = this.golesEquipo2;
            Validator.equipo1Ganador(golesEquipo1,golesEquipo2,resultado,EQUIPO1_GANADOR);
            Validator.equipo2Ganador(golesEquipo1,golesEquipo2,resultado,EQUIPO2_GANADOR);
            partido.resultado = this.resultado;
            return partido;
        }
    }
}
