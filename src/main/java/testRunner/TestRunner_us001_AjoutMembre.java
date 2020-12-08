package testRunner;

import org.junit.runner.RunWith;

import Pinkfloyd2.Pinkfloyd2.Membre;


import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;  

@RunWith(Cucumber.class) 


public class TestRunner_us001_AjoutMembre {
	private Membre membre1 = new Membre();
	@given("^un membre$")
	private createMembre() {
		
	}
}
