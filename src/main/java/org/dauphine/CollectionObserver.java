package org.dauphine;

import java.util.Observable;
import java.util.Observer;

public class CollectionObserver implements Observer{
	private String nom;

    public CollectionObserver(String nom) {
        this.nom = nom;
    }

    public void update(Observable o, Object arg) {
        System.out.println("Observateur " + nom + " : Collection de robes mise à jour :");
        System.out.println(arg);
    }

}
