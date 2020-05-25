package edu.torneo.simuladortorneo.model.businessexecption;

public class NumeroJugadoresException extends RuntimeException {

    public  NumeroJugadoresException (String mensaje){
        super(mensaje);
    }
}
