package edu.torneo.simuladortorneo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table (name="Fecha")
public class FechaEntity {
    @Id
    @Column(name = "codigoFecha")
    private int codigoFecha;

    @JoinColumn(name = "equipos")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<EquipoEntity> equipos;







}