package org.dauphine;

import java.util.ArrayList;
import java.util.List;


public class Barbie {
	 private String nom;
	    private List<Robe> collection;

	    public Barbie(String nom) {
	        this.nom = nom;
	        this.collection = new ArrayList<Robe>();
	    }

	    public void ajouterRobe(Robe robe) {
	        collection.add(robe);
	    }

	    public void afficherCollection() {
	        System.out.println("Collection de robes de " + nom + ":");
	        for (Robe robe : collection) {
	            System.out.println("- " + robe.getNom());
	        }}
}
