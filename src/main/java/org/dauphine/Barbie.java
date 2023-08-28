package org.dauphine;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;


public class Barbie extends Observable{
	
	 private String nom;
	 private List<Robe> collection;
	    
	    public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public List<Robe> getCollection() {
			return collection;
		}

		public void setCollection(List<Robe> collection) {
			this.collection = collection;
		}
		
		public Barbie(String nom) {
	        this.nom = nom;
	        this.collection = new ArrayList<Robe>();
	    }

	    public void ajouterRobe(Robe robe) {
	        collection.add(robe);
	        setChanged();  // Indique que l'état a changé
	        notifyObservers(robesToString());  // Notifier les observateurs 
	    }

	    public String robesToString() {
	        StringBuilder builder = new StringBuilder();
	        for (Robe robe : collection) {
	            builder.append("- ").append(robe.getNom()).append("\n");
	        }
	        return builder.toString();
	    }

		public void afficherCollection() {
	        System.out.println("Collection de robes de " + nom + ":");
	        for (Robe robe : collection) {
	            System.out.print(" - " + robe.getNom());
	        }}
}
