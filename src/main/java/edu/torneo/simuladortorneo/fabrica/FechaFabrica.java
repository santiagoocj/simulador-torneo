package edu.torneo.simuladortorneo.fabrica;

import edu.torneo.simuladortorneo.command.FechaCommand;
import edu.torneo.simuladortorneo.entity.FechaEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FechaFabrica {

    private FechaCommand entityToCommand(FechaEntity fechaEntity) {
        FechaCommand fechaCommand = new FechaCommand();
        fechaCommand.setEquipos(fechaEntity.getEquipos());
        return fechaCommand;
    }
}
