package com.baeldung;
import com.baeldung.dd.dices.Dices;
import com.baeldung.dd.dices.TwoDices;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class DiceTest {
    @Test
    public void testTwiceIsDifferentEachTime() {
        Dices d = new TwoDices();
        int jet1 = d.getResult();
        int jet2 = d.getResult();
        int jet3 = d.getResult();
        assertTrue( jet1 != jet2 && jet2 != jet3);
    }
}
