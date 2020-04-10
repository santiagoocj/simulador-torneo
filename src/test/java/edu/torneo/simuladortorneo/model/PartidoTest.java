package edu.torneo.simuladortorneo.model;

import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PartidoTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void registrarGolesNegativosEquipo1() throws Exception {
        exception.expect(BusinessExecption.class);
        exception.expectMessage(Partido.GOLES_NEGATIVOS);
        Partido partido = new Partido.PartidoBuilder()
                .setEquipo1(new Equipo.EquipoBuilder()
                        .setNombreEquipo("Nacional")
                        .setNumeroJugadores(15)
                        .build())
                .setEquipo2(new Equipo.EquipoBuilder()
                        .setNombreEquipo("Medellin")
                        .setNumeroJugadores(15)
                        .build())
                .setGolesEquipo1(-5)
                .build();
    }

    @Test
    public void registrarGolesNegativosEquipo2() throws Exception {
        exception.expect(BusinessExecption.class);
        exception.expectMessage(Partido.GOLES_NEGATIVOS);
        Partido partido = new Partido.PartidoBuilder()
                .setEquipo1(new Equipo.EquipoBuilder()
                        .setNombreEquipo("Nacional")
                        .setNumeroJugadores(15)
                        .build())
                .setEquipo2(new Equipo.EquipoBuilder()
                        .setNombreEquipo("Medellin")
                        .setNumeroJugadores(15)
                        .build())
                .setGolesEquipo2(5)
                .setGolesEquipo1(-3)
                .build();
    }
}
