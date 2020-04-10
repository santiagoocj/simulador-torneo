package edu.torneo.simuladortorneo.model;

import java.util.List;

public class Fecha {
    private List<Equipo> equipos;

    public static class FechaBuilder{
        private List<Equipo> equipos;

        public FechaBuilder setEquipos(List<Equipo> equipos) {
            this.equipos = equipos;
            return this;
        }

        public Fecha build(){
            Fecha fecha = new Fecha();
            fecha.equipos = this.equipos;
            return fecha;
        }
    }
}
