package edu.torneo.simuladortorneo.service.equipo.impl;

import edu.torneo.simuladortorneo.command.EquipoCommand;
import edu.torneo.simuladortorneo.entity.EquipoEntity;
import edu.torneo.simuladortorneo.fabrica.EquipoFabrica;
import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import edu.torneo.simuladortorneo.model.businessexecption.EquipoExistenteException;
import edu.torneo.simuladortorneo.model.businessexecption.NumeroJugadoresException;
import edu.torneo.simuladortorneo.model.util.Validator;
import edu.torneo.simuladortorneo.repository.EquipoRepository;
import edu.torneo.simuladortorneo.service.equipo.EquipoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("EquipoServiceImpl")
public class EquipoServiceImpl implements EquipoService {

    public static final String NUMERO_DE_JUGADORES = "se necesitan como maximo 25 jugadores, y mínimo 11 jugadores para poder ingresar";
    public static final String EQUIPO_REGISTRADO_EXITOSAMENTE = "Se a registrado Exitosamente el equipo";
    public static final String EQUIPOS_NO_REGISTRADOS = "No se encuentran equipos registrados para listar";

    @Autowired
    private EquipoRepository equipoRepository;

    @Autowired
    private EquipoFabrica equipoFabrica;

    @Override
    public String registrarEquipo(EquipoCommand equipoCommand) throws BusinessExecption {
        validarNumeroDeJugadores(equipoCommand.getNumeroJugadores());
        EquipoEntity equipoEntity = new EquipoEntity();
        equipoEntity.setNombreEquipo(equipoCommand.getNombreEquipo());
        equipoEntity.setNumeroJugadores(equipoCommand.getNumeroJugadores());
        equipoEntity.setPartidosJugados(0);
        equipoEntity.setPartidosGanados(0);
        equipoEntity.setPartidosPerdidos(0);
        equipoEntity.setPartidosEmpatados(0);
        equipoEntity.setGolesFavor(0);
        equipoEntity.setGolesContra(0);
        equipoEntity.setDiferenciaGol(0);
        equipoEntity.setPuntos(0);
        equipoRepository.save(equipoEntity);
        return EQUIPO_REGISTRADO_EXITOSAMENTE;
    }

    @Override
    public List<EquipoCommand> listAll() {
        List<EquipoCommand> listaEquipos = null;
        listaEquipos = equipoFabrica.entityToCommand(equipoRepository.findAll());
        validarequiposExistentes(listaEquipos);
        return listaEquipos;
    }

    private void validarequiposExistentes(List<EquipoCommand> listaEquipos) {
        if(listaEquipos.isEmpty()){
            throw new EquipoExistenteException(EQUIPOS_NO_REGISTRADOS);
        }
    }


    private void validarNumeroDeJugadores(int numeroJugadores) {
        if(numeroJugadores > 25 || numeroJugadores < 11){
            throw new NumeroJugadoresException(NUMERO_DE_JUGADORES);
        }
    }


}
