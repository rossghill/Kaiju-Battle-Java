import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KaijuTest {

    Godzilla godzilla;
    Mothra mothra;
    Tank tank;
    Copter copter;

    @Before
    public void before(){
        godzilla = new Godzilla("Steve", 200,120);
        mothra = new Mothra("Mothboy", 140, 90);
        tank = new Tank("Army Tank", 300);
        copter = new Copter("Military Chopper", 400);
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

    @Test
    public void kaijuHasHealthValue() {
        assertEquals("Health value: 200", godzilla.returnHealthValue(200));
        assertEquals("Health value: 140", mothra.returnHealthValue(140));
    }
//
    @Test
    public void kaijuHasAttackValue() {
        assertEquals("Attack value: 120", godzilla.returnAttackValue(120));
        assertEquals("Attack value: 90", mothra.returnAttackValue(90));
    }

    @Test
    public void kaijuHealthValueAsInt() {
        assertEquals(200, godzilla.returnHealthValueAsInt(200));
        assertEquals(140, mothra.returnHealthValueAsInt(140));
    }

    @Test
    public void attack() {
        assertEquals(180, godzilla.attack(godzilla, tank));
        assertEquals(310, mothra.attack(mothra, copter));
    }

}
