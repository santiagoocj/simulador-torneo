package edu.torneo.simuladortorneo.entity;

import edu.torneo.simuladortorneo.model.Equipo;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Data
@Entity
@Table(name = "torneo")
public class TorneoEntity {

    @Id
    @Column(name = "codigoTorneo")
    private int codigoTorneo;

    @Column(name = "nombreTorneo")
    private String nombreTorneo;

    @Column(name = "numeroEquipos")
    private int numeroEquipos;

    @JoinColumn(name = "equipos")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EquipoEntity> equipos;

    @Column(name = "numeroPartidosJugar")
    private int numeroPartidosJugar;

    @Column(name = "partidosJugar")
    private int partidosJugar;
}
