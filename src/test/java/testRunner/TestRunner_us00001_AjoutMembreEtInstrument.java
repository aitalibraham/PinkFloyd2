package testRunner;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

import Pinkfloyd2.Pinkfloyd2.*;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;

public class TestRunner_us00001_AjoutMembreEtInstrument {
  Membre membre1;
  String name;
  int age;
  
  @Given("^nouveau membre$")
  public void creation_membre() throws Throwable {
	  membre1 = new Membre(); 
  }
  
  @When("^doit s'appeler {String} $")
  public void recup_nom(String nom) throws Throwable {
	  name = nom;
  }
  
  @When("^doit avoir {int}")
  public void recup_age(int age) {
	  this.age = age;
  }

  @Then("verifier nom")
  public void verif_nom() throws Throwable {
	  assertEquals(name, membre1.getName());
  }
  
  @then("verifier age")
  public void verif_age() {
	  assertEquals(age, membre1.getAge());
  }
  

}
