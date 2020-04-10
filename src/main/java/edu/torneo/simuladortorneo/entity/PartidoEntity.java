package edu.torneo.simuladortorneo.entity;

import edu.torneo.simuladortorneo.model.Equipo;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "partido")
public class PartidoEntity {

    @Id
    @Column(name = "codigoPartido")
    private int codigoPartido;

    @JoinColumn(name = "equipo1")
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EquipoEntity equipo1;

    @JoinColumn(name = "equipo2")
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private EquipoEntity equipo2;

    @Column(name = "golesEquipo1")
    private int golesEquipo1;

    @Column(name = "golesEquipo2")
    private int golesEquipo2;

    @Column(name = "resultado")
    private String resultado;
}
