package main;
import java.util.List;
import java.util.ArrayList;

/**
 * Décrivez votre classe Barbie ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Barbie
{
    private String nom;
    private List<Robe> collection;

    public Barbie(String nom) {
        this.nom = nom;
        this.collection = new ArrayList<>();
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
