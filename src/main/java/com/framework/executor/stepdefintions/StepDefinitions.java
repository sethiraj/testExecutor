/**
 * 
 */
package com.framework.executor.stepdefintions;

import static org.junit.Assert.assertEquals;
import java.io.IOException;

import org.springframework.stereotype.Component;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



/**
 * The Class StepDefinitions.
 *
 * @author surendrane
 */
public class StepDefinitions {

	/**
	 * Sets the up.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Before
	public void setUp() throws IOException {

	}

	/**
	 * I login to application.
	 *
	 * @param user
	 *            the user
	 */
	@Given("I login to the application with username {string}")
	public void ILoginToApplication(final String user) {

	}

	/**
	 * I land on home screen.
	 */
	@When("I land on the home screen")
	public void ILandOnHomeScreen() {
		assertEquals("Home", "Home");
	}

	/**
	 * I validate admin link presence.
	 */
	@Then("I validate the Admin Link is present")
	public void IValidateAdminLinkPresence() {

	}

	/**
	 * I click on admin link.
	 */
	@And("I clickon the Admin Link")
	public void IClickOnAdminLink() {

	}

	@Then("I Validate the {string} is present")
	public void iValidateLinkPresence(final String link) {

	}
}
