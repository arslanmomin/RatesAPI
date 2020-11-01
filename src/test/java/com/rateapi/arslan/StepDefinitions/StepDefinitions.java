package com.rateapi.arslan.StepDefinitions;



import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

import org.springframework.http.HttpStatus;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitions extends SetAPI {

    @Given("^I set rates API endpoint$")
    public void i_set_rates_api_endpoint() throws Throwable {
        
        SetAPI.setNormalApi();
     
    }

    @Given("^I set rates API endpoint for Specific date$")
    public void i_set_rates_api_endpoint_for_specific_date() throws Throwable {
        
    	SetAPI.setDatedApi();
    
    }

    @When("^I set the request header$")
    public void i_set_the_request_header() throws Throwable {
       
    	SetAPI.setRequestHeader();
    }

    @When("^An incorrect url is provided$")
    public void an_incorrect_url_is_provided() throws Throwable {
        SetAPI.setIncorrectApi();
    }

    @When("^An incomplete url is provided$")
    public void an_incomplete_url_is_provided() throws Throwable {
        SetAPI.setIncompeteApi();
    }

    @When("^A future date is provided in the url$")
    public void a_future_date_is_provided_in_the_url() throws Throwable {
        SetAPI.setDatedApi();
    }

    @Then("^I receive valid Response code 200$")
    public void i_receive_valid_response_code_200() throws Throwable {
    	setNormalApi();
    	assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @Then("^I receive invalid response supplied by the call$")
    public void i_receive_invalid_response_supplied_by_the_call() throws Throwable {
        setIncorrectApi();
        assertThat(response.getStatusCode(), equalTo(HttpStatus.NOT_FOUND));
        
        setIncompeteApi();
        assertThat(response.getStatusCode(), equalTo(HttpStatus.NOT_FOUND));
    }
    
    @Then("^I receive valid Response$")
    public void i_receive_valid_response() throws Throwable {
       
    }

    @Then("^I receive valid response that matches for the current date$")
    public void i_eceive_valid_response_that_matches_for_the_current_date() throws Throwable {
        setDatedApi();
        assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
    }

    @And("^sent the POST Http request header$")
    public void sent_the_post_http_reuest_header() throws Throwable {
        setRequestHeader();
        
    }

}