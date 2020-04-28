package edu.torneo.simuladortorneo.model.util;

import edu.torneo.simuladortorneo.model.Equipo;
import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;

public class Validator {
    public static void validarNombreNulo(String nombre, String mensaje) throws BusinessExecption {
        if(nombre == null){
            throw new BusinessExecption(mensaje);
        }
    }
    public static void ValidarNumeroMinimoDeJugadores(int nroJugadores, String mensaje) throws BusinessExecption {
        int minimoJugadores = 11;
        if(nroJugadores < minimoJugadores){
            throw new BusinessExecption(mensaje);
        }
    }

    public static void validarNumeroMaximoDeJugadores(int nroJugadores, String mensaje) throws BusinessExecption {
        int maximoJugadores = 25;
        if(nroJugadores > maximoJugadores){
            throw new BusinessExecption(mensaje);
        }
    }

    public static void validarGolesNegativos(int goles, String mensaje) throws BusinessExecption {
        if(goles < 0){
            throw new BusinessExecption(mensaje);
        }
    }

    public static  void equipo1Ganador(int golesEquipo1, int golesEquipo2, String resultado, String mensaje) throws BusinessExecption {
        if((golesEquipo1 > golesEquipo2) && resultado.equalsIgnoreCase("el ganador es el equipo 2")){
            throw new BusinessExecption(mensaje);
        }
    }

    public static  void equipo2Ganador(int golesEquipo1, int golesEquipo2, String resultado, String mensaje) throws BusinessExecption {
        if((golesEquipo2 > golesEquipo1) && resultado.equalsIgnoreCase("el ganador es el equipo 1")){
            throw new BusinessExecption(mensaje);
        }
    }
}
