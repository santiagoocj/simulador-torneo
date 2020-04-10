package edu.torneo.simuladortorneo.model;

import java.util.List;

public class TablaPosicion {
    private int numeroEquipos;
    private List<Equipo> equipos;
    private boolean torneoFinalizado;
    private Equipo ganador;

    public static class TablaPosicionBuilder{

        private int numeroEquipos;
        private List<Equipo> equipos;
        private boolean torneoFinalizado;
        private Equipo ganador;


        public TablaPosicionBuilder setNumeroEquipos(int numeroEquipos) {
            this.numeroEquipos = numeroEquipos;
            return this;
        }

        public TablaPosicionBuilder setEquipos(List<Equipo> equipos) {
            this.equipos = equipos;
            return this;
        }

        public TablaPosicionBuilder setTorneoFinalizado(boolean torneoFinalizado) {
            this.torneoFinalizado = torneoFinalizado;
            return this;
        }

        public TablaPosicionBuilder setGanador(Equipo ganador) {
            this.ganador = ganador;
            return this;
        }

        public TablaPosicion build(){
            TablaPosicion tablaPosicion = new TablaPosicion();
            tablaPosicion.numeroEquipos = this.numeroEquipos;
            tablaPosicion.equipos = this.equipos;
            tablaPosicion.torneoFinalizado = this.torneoFinalizado;
            tablaPosicion.ganador = this.ganador;
            return tablaPosicion;
        }
    }
}
