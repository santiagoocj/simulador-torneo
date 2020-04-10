package edu.torneo.simuladortorneo.entity;

import lombok.Data;

import javax.persistence.*;
import java.awt.*;

@Data
@Entity
@Table(name = "Equipo")
public class EquipoEntity {

    @Id
    @GeneratedValue
    @Column(name = "codigoEquipo")
    private int codigoEquipo;

    @Column(name = "nombreEquipo")
    private String nombreEquipo;

    /*@Column(name = "logo")
    private Image logo; -->jpa no admite datos de tipo Image*/

    @Column(name = "numeroJugadores")
    private int numeroJugadores;

    @Column(name = "partidosJugados")
    private int partidosJugados;

    @Column(name = "partidosGanados")
    private int partidosGanados;

    @Column(name = "partidosPerdidos")
    private int partidosPerdidos;

    @Column(name = "partidosEmpatados")
    private int partidosEmpatados;

    @Column(name = "golesFavor")
    private int golesFavor;

    @Column(name = "golesContra")
    private int golesContra;

    @Column(name = "diferenciaGol")
    private int diferenciaGol;

    @Column(name = "puntos")
    private int puntos;


}
