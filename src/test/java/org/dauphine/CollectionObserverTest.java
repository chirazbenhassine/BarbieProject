package org.dauphine;




import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Observable;
import java.util.Observer;

import org.junit.Test;


public class CollectionObserverTest {
	 @Test
	   public void testAjouterRobeNotifiesObservers() {
	        Barbie barbie = new Barbie("barbie");

	      TestObserver observer1 = new TestObserver();
	        TestObserver observer2 = new TestObserver();

	        barbie.addObserver(observer1);
	        barbie.addObserver(observer2);

	        Robe robe1 = new Robe("Robe de printemps");
	        Robe robe2 = new Robe("Robe de Mariage");

	        barbie.ajouterRobe(robe1);
	        barbie.ajouterRobe(robe2);

	        assertTrue(observer1.isNotified());
	        assertTrue(observer2.isNotified());
	    }

	    private static class TestObserver implements Observer {
	        private boolean notified = false;

	        public void update(Observable o, Object arg) {
	           notified = true;
	            
	        }

	        public boolean isNotified() {
	        	return notified;
	           
	        }
	    }
	  
}
