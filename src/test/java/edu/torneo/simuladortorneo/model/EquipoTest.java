package edu.torneo.simuladortorneo.model;

import edu.torneo.simuladortorneo.model.businessexecption.BusinessExecption;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EquipoTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void registrarSinNombreDeEquipo() throws Exception {
        exception.expect(BusinessExecption.class);
        exception.expectMessage(Equipo.NOMBRE_EQUIPO_REQUERIDO);
        Equipo equipo = new Equipo.EquipoBuilder()
                .setCodigoEquipo(1)
                .build();
    }

    @Test
    public  void registroMinimoDeJugadores() throws Exception{
        exception.expect(BusinessExecption.class);
        exception.expectMessage(Equipo.NUMERO_MINIMO_DE_JUGADORES);
        Equipo equipo = new Equipo.EquipoBuilder()
                .setCodigoEquipo(1)
                .setNombreEquipo("Nacional")
                .setNumeroJugadores(10)
                .build();
    }

    @Test
    public void registroMaximoDeJugadores() throws BusinessExecption {
        exception.expect((BusinessExecption.class));
        exception.expectMessage(Equipo.NUMERO_MAXIMO_DE_JUGADORES);
        Equipo equipo = new Equipo.EquipoBuilder()
                .setCodigoEquipo(2)
                .setNombreEquipo("Nacional")
                .setNumeroJugadores(34)
                .build();
    }
}
