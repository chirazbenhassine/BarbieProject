package org.dauphine.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.dauphine.*;
import org.junit.Assert;

public class AfficherStepsDef {
	

	private Barbie barbie;
	private Robe robe;

	@Given("User nommee barbie2")
	public void user_nommee_barbie2() {
		barbie = new Barbie("barbie");
		robe = new Robe("robeRouge");
		barbie.ajouterRobe(robe);
	}

	@When("user veut afficher la collection")
	public void user_veut_afficher_la_collection() {
		barbie.afficherCollection();
	}

	@Then("collection contient la robe ajoutee")
	public void collection_contient_la_robe_ajoutee() {
		String expectedRobesList = "robeRouge";
		List<String> expectedRobes = new ArrayList<String>();
		for (String robe : expectedRobesList.split(", ")) {
            expectedRobes.add(robe);
		}
        //assertEquals(1, barbie1.getCollection().size()); expectedRobes
        assertEquals(1, expectedRobes.size());
        assertEquals(1, barbie.getCollection().size());
	
}
}
