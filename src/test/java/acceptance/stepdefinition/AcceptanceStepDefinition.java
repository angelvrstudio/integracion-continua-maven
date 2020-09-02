package acceptance.stepdefinition;

import org.junit.Assert;

import acceptanceclass.AcceptanceClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AcceptanceStepDefinition {

	public AcceptanceClass acceptanceClass;
	public String response;
	
	@Given("^Si creo un objeto de la clase AcceptanceClass$")
	public void abrirFrontSimulador() {
		this.acceptanceClass = new AcceptanceClass();
		this.response = null;
	}

	@When("^Imprimo su contenido$")
	public void seleccionarServicio() throws Exception {
		this.response = this.acceptanceClass.printMessage();
		System.out.println(this.response);
	}
	
	
	@Then("^La respuesta deberia ser \"([^\"]*)\"$")
	public void respuestaServicio(String respuesta) throws Exception {

		Assert.assertEquals(this.response.trim(), respuesta.trim());

	}
	
}
