package edu.torneo.simuladortorneo.fabrica;

import edu.torneo.simuladortorneo.command.PartidoCommand;
import edu.torneo.simuladortorneo.entity.PartidoEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PartidoFabrica {

    public List<PartidoCommand> entityToCommand(List<PartidoEntity> listaPartidoEntity){
        List<PartidoCommand> listaPartidoCommand = new ArrayList<>();
        listaPartidoEntity.forEach(e -> listaPartidoCommand.add(entityToCommand(e)));
        return listaPartidoCommand;
    }

    private PartidoCommand entityToCommand(PartidoEntity partidoEntity) {
        PartidoCommand partidoCommand = new PartidoCommand();
        partidoCommand.setCodigopartido(partidoEntity.getCodigoPartido());
        partidoCommand.setEquipo1(partidoEntity.getEquipo1());
        partidoCommand.setEquipo2(partidoEntity.getEquipo2());
        partidoCommand.setGolesEquipo1(partidoEntity.getGolesEquipo1());
        partidoCommand.setGolesEquipo2(partidoEntity.getGolesEquipo2());
        partidoCommand.setResultado(partidoEntity.getResultado());

        return partidoCommand;
    }
}
