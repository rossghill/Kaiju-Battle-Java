import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Godzilla godzilla;
    Mothra mothra;

    @Before
    public void before(){
        godzilla = new Godzilla();
        mothra = new Mothra();
    }

    @Test
    public void kaijuCanRoar() {
        assertEquals("ROOOOOOOAAAAR", godzilla.roar("ROOOOOOOAAAAR"));
    }
}
