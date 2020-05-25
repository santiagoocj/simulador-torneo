package edu.torneo.simuladortorneo.model.businessexecption;

public class EquipoExistenteException extends RuntimeException {

    public EquipoExistenteException(String mensaje){
        super(mensaje);
    }
}
