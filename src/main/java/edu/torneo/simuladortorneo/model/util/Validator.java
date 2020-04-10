package edu.torneo.simuladortorneo.model.util;

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
}
