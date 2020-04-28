package edu.torneo.simuladortorneo.fabrica;

import edu.torneo.simuladortorneo.command.TorneoCommand;
import edu.torneo.simuladortorneo.entity.TorneoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TorneoFabrica {

    public List<TorneoCommand> entityToComand(List<TorneoEntity> listaTorneoEntity){
        List<TorneoCommand> listaTorneoCommand = new ArrayList<>();
        listaTorneoEntity.forEach(e-> listaTorneoCommand.add(entityToComand(e)) );
        return listaTorneoCommand;
    }

    private TorneoCommand entityToComand(TorneoEntity torneoEntity) {
        TorneoCommand torneoCommand= new TorneoCommand();
        torneoCommand.setCodigoTorneo(torneoEntity.getCodigoTorneo());
        torneoCommand.setEquipos(torneoEntity.getEquipos());
        torneoCommand.setNombreTorneo(torneoEntity.getNombreTorneo());
        torneoCommand.setNumeroEquipos(torneoEntity.getNumeroEquipos());
        torneoCommand.setNumeroPartidosJugar(torneoEntity.getNumeroPartidosJugar());
        torneoCommand.setPartidosJugar(torneoEntity.getPartidosJugar());
        return torneoCommand;
    }
}
