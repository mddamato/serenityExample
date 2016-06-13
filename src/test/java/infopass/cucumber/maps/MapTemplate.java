package infopass.cucumber.maps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import infopass.cucumber.stepLibraries.TemplateForUser;
import net.thucydides.core.annotations.Steps;

public class MapTemplate {
	@Steps TemplateForUser stepLibrary;

	@Given("giventemplate")
	public void givenTemplateMethod(String someVariable) {
		stepLibrary.userAction1();

	}

	@When("whentemplate")
	public void whenTemplateMethod() {

	}

	@Then("thentemplate")
	public void thenTemplateMethod() {

	}

}