package org.dauphine.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.*;
import java.util.ArrayList;
import java.util.List;

import org.dauphine.Barbie;
import org.dauphine.Robe;
import org.junit.Assert;

public class AfficherStepdefs {
	
	private Barbie barbie;
    private List<Robe> robes;
    private List<String> collectionAffichee;
   

    @Given("Barbie nommé {string}")
    public void BarbieNommé(String nomBarbie) {
        barbie = new Barbie(nomBarbie);
    }

   /* @And("Une collection de robes de Barbie contient des robes {string}")
    public void CollectionDeRobes(List<String> robes) {
        for (String robe : robes) {
            barbie.ajouterRobe(new Robe(robe));
        }
    }*/

    @When("Le joueur demande à afficher la collection de robes de Barbie")
    public void DemandeAfficherLaCollection() {
        barbie.afficherCollection();
    }

    @Then("La liste affichée devrait contenir {string}")
    public void ListeAffichée(String expectedRobesList) {
        List<String> expectedRobes = new ArrayList<String>();
        for (String robe : expectedRobesList.split(", ")) {
            expectedRobes.add(robe);
        }

        Assert.assertEquals(expectedRobes, collectionAffichee);
    }
}
