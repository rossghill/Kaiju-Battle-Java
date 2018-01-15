import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Copter copter;

    @Before
    public void before() {
        tank = new Tank();
        copter = new Copter();
    }

    @Test
    public void vehicleHasType() {
        assertEquals("Army Tank", tank.returnType("Army Tank"));
        assertEquals("Military Chopper", copter.returnType("Military Chopper"));
    }
}
