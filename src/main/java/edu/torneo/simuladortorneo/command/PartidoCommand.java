package edu.torneo.simuladortorneo.command;

import edu.torneo.simuladortorneo.entity.EquipoEntity;
import edu.torneo.simuladortorneo.model.Equipo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class PartidoCommand {

    private int codigopartido;
    private EquipoEntity equipo1;
    private EquipoEntity equipo2;
    private int golesEquipo1;
    private int golesEquipo2;
    private String resultado;
}
