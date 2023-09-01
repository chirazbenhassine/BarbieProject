package org.dauphine.steps;

import java.util.ArrayList;
import java.util.List;

import org.dauphine.Barbie;
import org.dauphine.Robe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AjoutStepsDef {
    private Barbie barbie;
	private Robe robe;

	@Given("User nommee barbie1")
    public void user_nommee_barbie1() {
    barbie = new Barbie("barbie");
    robe = new Robe("robeRouge");
    }

    @When("user ajout robeRouge dans collection")
    public void user_ajout_robeRouge_dans_collection() {
       
        barbie.ajouterRobe(robe);
    }

    @Then("collection contient la robeRouge")
    public void collection_contient_la_robeRouge() {
        
        List<String> nomsRobes = new ArrayList<String>();
        for (Robe robe : barbie.getCollection()) {
            nomsRobes.add(robe.getNom());
        }
        assert nomsRobes.contains("robeRouge");
    }
    }


