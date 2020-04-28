package edu.torneo.simuladortorneo.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.*;

@Data
@Component
@NoArgsConstructor
public class EquipoCommand {

    private int codigoEquipo;
    private String nombreEquipo;
    private Image logo;
    private int numeroJugadores;
    private int partidosJugados;
    private int partidosGanados;
    private int partidosPerdidos;
    private int partidosEmpatados;
    private int golesFavor;
    private int golesContra;
    private int diferenciaGol;
    private int puntos;

}
