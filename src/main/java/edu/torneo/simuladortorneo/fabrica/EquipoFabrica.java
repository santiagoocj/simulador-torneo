package edu.torneo.simuladortorneo.fabrica;

import edu.torneo.simuladortorneo.command.EquipoCommand;
import edu.torneo.simuladortorneo.entity.EquipoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EquipoFabrica {

    public List<EquipoCommand> entityToCommand(List<EquipoEntity> listaEquipoEntity){
        List<EquipoCommand> listaEquipoCommand = new ArrayList<>();
        listaEquipoEntity.forEach(e -> listaEquipoCommand.add(entityToCommand(e)));
        return listaEquipoCommand;
    }

    private EquipoCommand entityToCommand(EquipoEntity equipoEntity) {
        EquipoCommand equipoCommand = new EquipoCommand();
        equipoCommand.setCodigoEquipo(equipoEntity.getCodigoEquipo());
        equipoCommand.setNombreEquipo(equipoEntity.getNombreEquipo());
        //falta hacerle al logo
        equipoCommand.setNumeroJugadores(equipoEntity.getNumeroJugadores());
        equipoCommand.setPartidosJugados(equipoEntity.getPartidosJugados());
        equipoCommand.setPartidosGanados(equipoEntity.getPartidosGanados());
        equipoCommand.setPartidosPerdidos(equipoEntity.getPartidosPerdidos());
        equipoCommand.setPartidosEmpatados(equipoEntity.getPartidosEmpatados());
        equipoCommand.setGolesFavor(equipoEntity.getGolesFavor());
        equipoCommand.setGolesContra(equipoEntity.getGolesContra());
        equipoCommand.setDiferenciaGol(equipoEntity.getDiferenciaGol());
        equipoCommand.setPuntos(equipoEntity.getPuntos());
        return equipoCommand;
    }

}
