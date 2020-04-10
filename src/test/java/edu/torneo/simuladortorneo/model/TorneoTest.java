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
public class TorneoTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();


    @Test
    public void registrarSinNombreTorneo() throws Exception {
        exception.expect(BusinessExecption.class);
        exception.expectMessage(Torneo.NOMBRE_TORNEO_REQUERIDO);
        Torneo torneo = new Torneo.TorneoBuilder()
                .build();
    }
}
