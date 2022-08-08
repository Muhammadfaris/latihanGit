package org.example;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void testPerkalianKalkulator(){
        Kalkulator kalkulator = new Kalkulator(6,2);

        Assert.assertEquals(3, kalkulator.getHasilPembagian(),0);
    }
}
