package org.dauphine;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BarbieTest {
	 protected double fValeur1;
	    protected double fValeur2;

	    /**
	     * Constructeur de la classe-test BarbieTest
	     */
	    public BarbieTest()
	    {
	    }

	    /**
	     * Met en place les engagements.
	     *
	     * Méthode appelée avant chaque appel de méthode de test.
	     */
	    @Before
	    public void setUp() // throws java.lang.Exception
	    {
	        // Initialisez ici vos engagements
	        fValeur1= 2.0;
	        fValeur2= 3.0;
	    }

	    /**
	     * Supprime les engagements
	     *
	     * Méthode appelée après chaque appel de méthode de test.
	     */
	    @After
	    public void tearDown() // throws java.lang.Exception
	    {
	        //Libérez ici les ressources engagées par setUp()
	    }

	    @Test
	    public void AjoutRobeTest()
	    {
	        Barbie barbie1 = new Barbie("princesse");
	        Robe robe1 = new Robe("robe de mariage");
	        Robe robe2 = new Robe("robe d'hiver");
	        barbie1.ajouterRobe(robe1);
	        barbie1.ajouterRobe(robe2);
	    }

	    @Test
	    public void AfficherCollectionTest()
	    {
	        Barbie barbie1 = new Barbie("princesse");
	        Robe robe1 = new Robe("robe de mariage");
	        Robe robe2 = new Robe("robe d'hiver");
	        barbie1.afficherCollection();
	        barbie1.ajouterRobe(robe1);
	        barbie1.ajouterRobe(robe2);
	        barbie1.afficherCollection();
	    }
}
