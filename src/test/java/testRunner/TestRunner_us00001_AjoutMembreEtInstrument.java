package testRunner;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;

import Pinkfloyd2.Pinkfloyd2.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


@RunWith(Cucumber.class)  

@CucumberOptions(strict = true) 

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
  
  @Then("verifier age")
  public void verif_age() {
	  assertEquals(age, membre1.getAge());
  }
  

}
