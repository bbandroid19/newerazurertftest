package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.Driver;

public class CustomerStepDefinition {
	private Driver driver = new Driver();
	
	@Given("^I create a new request with (.*) service$")
    public void createNewRequest(String serviceName) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.createURI(serviceName);
    }

    @Given("^I add the (.*) endpoint to the service$")
    public void addEndpoint(String endpoint) {
    	driver.addEndpoint(endpoint);
    }

    @When("^I send the (.*) request to the service$")
    public void sendRequest(String method) throws Throwable {
        driver.sendRequest(method);
    }
    
    @When("^I pass (.*) as content type$")
    public void setContentType(String contentType) throws Throwable {
        driver.setContentType(contentType);
    }
    @When("^I pass (.*) as x-correlation-id$")
    public void setcorrelationid(String correlationid) throws Throwable {
        driver.setContentType(correlationid);
    }
    @When("^I pass (.*) as client_secret$")
    public void setclient_secret(String client_secret) throws Throwable {
       driver.setContentType(client_secret);
    }
    @When("^I pass (.*) as client_id$")
    public void setclient_id(String client_id) throws Throwable {
       driver.setContentType(client_id);
    }

    @Then("^I get the (\\d+) response code$")
    public void responseCodeValidation(int responseCode) throws Throwable {
    	driver.expectedResponse(responseCode);
    }

    @Then("^I expect the values of (.*) in the response body$")
    public void responseAttributeValidation(String filePath) throws Throwable {
        driver.validateResponse(filePath);
  
    }
    
    @And("^I send the values of (.*) in the request body$")
    public void setRequestBody(String filePath) throws Throwable {
        driver.setRequestBody(filePath);
    }
}
