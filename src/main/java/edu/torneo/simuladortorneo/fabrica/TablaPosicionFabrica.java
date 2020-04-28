package edu.torneo.simuladortorneo.fabrica;

import edu.torneo.simuladortorneo.command.TablaPosicionCommand;
import edu.torneo.simuladortorneo.command.TorneoCommand;
import edu.torneo.simuladortorneo.entity.TablaPosicionEntity;
import edu.torneo.simuladortorneo.entity.TorneoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TablaPosicionFabrica {

    public List<TablaPosicionCommand> entityToComand(List<TablaPosicionEntity> listaTablaPosicionEntity){
        List<TablaPosicionCommand> listaTablaPosicionCommand = new ArrayList<>();
        listaTablaPosicionEntity.forEach(e-> listaTablaPosicionCommand.add(entityToComand(e)) );
        return listaTablaPosicionCommand;
    }

    private TablaPosicionCommand entityToComand(TablaPosicionEntity tablaPosicionEntity) {
        TablaPosicionCommand tablaPosicionCommand = new TablaPosicionCommand();
        tablaPosicionCommand.setEquipos(tablaPosicionEntity.getEquipos());
        tablaPosicionCommand.setGanador(tablaPosicionEntity.getGanador());
        tablaPosicionCommand.setNumeroEquipos(tablaPosicionEntity.getNumeroEquipos());
        tablaPosicionCommand.setTorneoFinalizado(tablaPosicionEntity.isTorneoFinalizado());
        return tablaPosicionCommand;
    }
}
