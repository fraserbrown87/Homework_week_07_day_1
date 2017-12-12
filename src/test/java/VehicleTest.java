import Army.Vehicles;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicles vehicle1;
    Vehicles vehicle2;

    @Before
    public void before(){
        vehicle1 = new Vehicles("Tank", 100);
        vehicle2 = new Vehicles("Jet", 200);
    }

    @Test
    public void canGetType(){
        assertEquals("Tank", vehicle1.getType());
    }

    @Test
    public void canGetDamageValue(){
        assertEquals(100, vehicle1.getDamageValue());
    }
}
