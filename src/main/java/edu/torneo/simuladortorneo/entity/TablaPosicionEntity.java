package edu.torneo.simuladortorneo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="TablaPosicion")
public class TablaPosicionEntity {
    @Id
    @Column (name="TablaPosicion")
    private int codigoTablaPosicion;

    @JoinColumn(name = "equipos")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EquipoEntity> equipos;

    @Column(name="torneoFinalizado")
    private boolean torneoFinalizado;

    @Column(name = "ganador")
    private String ganador;


}
