import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Tank tank;
    Copter copter;

    @Before
    public void before() {
        tank = new Tank("Army Tank", 300);
        copter = new Copter("Military Chopper", 400);
    }

    @Test
    public void vehicleHasType() {
        assertEquals("Army Tank", tank.returnType("Army Tank"));
        assertEquals("Military Chopper", copter.returnType("Military Chopper"));
    }

    @Test
    public void vehicleHasHealthValue() {
        assertEquals("Health value: 300", tank.returnHealthValue(300));
        assertEquals("Health value: 400", copter.returnHealthValue(400));
    }

    @Test
    public void vehicleHealthAsInt() {
        assertEquals(300, tank.returnHealthValueAsInt(300));
    }
}
