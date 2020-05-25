package edu.torneo.simuladortorneo.controller;

import edu.torneo.simuladortorneo.command.EquipoCommand;
import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import edu.torneo.simuladortorneo.service.equipo.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("EquipoController")
@RequestMapping("/equipo")
public class EquipoController {

    @Autowired
    private EquipoService equipoService;

    @PostMapping("/registro")
    public String registrarEquipo(@RequestBody EquipoCommand equipoCommand) throws BusinessExecption {
        return equipoService.registrarEquipo(equipoCommand);
    }

    @GetMapping("/listado")
    public List<EquipoCommand> listadoEquipos() throws BusinessExecption{
        return equipoService.listAll();
    }
}
