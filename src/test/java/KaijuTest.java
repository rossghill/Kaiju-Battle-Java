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
        assertEquals("ROOOOOOOAAAAR", mothra.roar("ROOOOOOOAAAAR"));
    }

    @Test
    public void kaijuHasName() {
        assertEquals("Giant Dino Thing", godzilla.returnName("Giant Dino Thing"));
        assertEquals("Creepy Moth Thing", mothra.returnName("Creepy Moth Thing"));
    }
//
    @Test
    public void kaijuHasHealthValue() {
        assertEquals("Attack value: 140", godzilla.returnAttackValue(140));
        assertEquals("Attack value: 90", mothra.returnAttackValue(90));
    }

//    @Test
//    public void kaijuHasAttackValue() {
//        assertEquals();
//    }
}
