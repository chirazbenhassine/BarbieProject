package org.dauphine;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BarbieTest {
	
	 @Test
	    public void testConstructeurBarbie() {
	        Barbie barbie = new Barbie("BarbieTest");
	        assertEquals("BarbieTest", barbie.getNom());
	    }
   
	    @Test
	    public void testAjoutRobe()
	    {
	        Barbie barbie1 = new Barbie("Anne");
	        Robe robe1 = new Robe("robe de mariage");
	        Robe robe2 = new Robe("robe d'hiver");
	        barbie1.ajouterRobe(robe1);
	        barbie1.ajouterRobe(robe2);
 
	        assertEquals(2, barbie1.getCollection().size()); // 2 robes sont bien ajoutées
	        assertTrue(barbie1.getCollection().contains(robe1));
	        assertTrue(barbie1.getCollection().contains(robe2));
	        
	    }

	    @Test
	    public void testafficherCollection()
	    {
	        Barbie barbie1 = new Barbie("princesse");
	        Robe robe1 = new Robe("robe de mariage");
	        Robe robe2 = new Robe("robe d'hiver");
	        barbie1.ajouterRobe(robe1);
	        barbie1.ajouterRobe(robe2);
	        
	        String expectedOutput = "Collection de robes de " + barbie1.getNom() + ":\n" + "- robe de mariage\n" + "- robe d'hiver";
	        assertEquals(expectedOutput, getConsoleOutput(() -> barbie1.afficherCollection()));
	    }
	    
        // method pour voir le output dans le console
		private String getConsoleOutput(Runnable action) {
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
	        PrintStream originalOut = System.out;
	        System.setOut(new PrintStream(outputStream));
	        action.run();
	        System.setOut(originalOut);
	        return outputStream.toString().trim();
		}
}
