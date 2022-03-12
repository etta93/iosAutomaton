package StepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;

import Pages.TaskPage;
import Utility.Hook;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class TaskStep {
	
	AppiumDriver<WebElement> driver = Hook.getDriver();
	TaskPage taskPage;
	String generatedTaskName;
	
	@Given("User in to do homepage")
	public void user_in_to_do_homepage() throws InterruptedException {
		assertEquals(driver.findElementsByXPath("//XCUIElementTypeStaticText[@name=\"Todo\"]").size(),1);
	}
	
	@When("User create new task {string}")
	public void user_create_new_task(String taskName) {
		taskPage = new TaskPage(driver);
		taskPage.clickAdd();
		int randomNumber = (int)(Math.random()*1000);
		generatedTaskName  = taskName + Integer.toString(randomNumber);
		taskPage.inputTask(generatedTaskName);
		taskPage.clickGreenColorTag();
	}
	
	@When("User tap submit button")
	public void user_tap_submit_button() {
		taskPage.clickApply();
	}
	
	@Then("User see new task added")
	public void user_see_new_task_added() {
		assertEquals(driver.findElementsByXPath("//XCUIElementTypeApplication[@name=\"dodo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell/XCUIElementTypeOther[1]").size(),1);
	}
}
