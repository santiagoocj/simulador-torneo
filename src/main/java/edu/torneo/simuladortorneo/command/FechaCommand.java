package edu.torneo.simuladortorneo.command;

import edu.torneo.simuladortorneo.entity.EquipoEntity;
import edu.torneo.simuladortorneo.model.Equipo;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@NoArgsConstructor
public class FechaCommand {

    private List<EquipoEntity> equipos;
}
