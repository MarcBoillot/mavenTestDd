package com.baeldung;
import com.baeldung.dd.dices.Dices;
import com.baeldung.dd.dices.Dice;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class OneDiceTest {
    @Test
    public void testRateOneDice() {
            Dices d = new Dice();
            int[] counts = new int[6];
            boolean jen = true;
            for (int i = 0; i < 100; i++) {
                int jet = d.getResult();
                counts[jet-1]++;
                System.out.println("Jet " + (i + 1) + ": " + jet);
            }

            for (int i = 0; i < 6; i++) {
                if (counts[i]>20){
                    jen = false;
                }
                System.out.println("Résultat " + (i + 1) + ": " + counts[i] + " fois");
            }
            assertTrue(jen);
    }
}
