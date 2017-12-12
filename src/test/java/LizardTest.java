import Kaijus.Lizards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LizardTest {
    Lizards lizard1;
    Lizards lizard2;

    @Before
    public void before(){
        lizard1 = new Lizards("Leatherback", 10, 20);
        lizard2 = new Lizards("Axehead", 10, 20);
    }

    @Test
    public void canGetName(){
        assertEquals("Leatherback", lizard1.getName());
    }

    @Test
    public void canGetHealthValue(){
        assertEquals(10, lizard1.getHealthValue());
    }

    @Test
    public void canGetAttackValue(){
        assertEquals(20, lizard1.getAttackValue());
    }

    @Test
    public void canRoar(){
        assertEquals("Rooooar", lizard1.roar("Rooooar"));
    }

    @Test
    public void canAttacj(){
        assertEquals("Sonic BOOM", lizard1.attack());
    }
}
