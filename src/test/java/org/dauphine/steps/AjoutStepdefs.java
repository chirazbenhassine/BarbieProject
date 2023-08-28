package org.dauphine.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.*;
import org.dauphine.Barbie;
import org.dauphine.Robe;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class AjoutStepdefs {
	
	private Barbie barbie;
	private Robe robe;
	
	
	@Given("Une barbie nommé {string}")
    public void BarbieNommé(String nomBarbie) {
        barbie = new Barbie(nomBarbie);
    }

    @Given("une robe nommée {string}")
    public void RobeNommée(String nomRobe) {
        robe = new Robe(nomRobe);
    }
	
	@When("Le joueur ajout une robe à la collection de Barbie")
	public void AjouterRobeCollection() {
		barbie.ajouterRobe(robe);
	}
	
	 @Then("la collection de la Barbie devrait contenir la robe {string}")
	    public void CollectionBarbie(String nomRobe) {
	        List<String> nomsRobes = new ArrayList<String>();
	        for (Robe robe : barbie.getCollection()) {
	            nomsRobes.add(robe.getNom());
	        }
	        assert nomsRobes.contains(nomRobe);
	    }
    }
	
	

