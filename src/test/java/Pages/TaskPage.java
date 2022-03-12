package Pages;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;

public class TaskPage {
	
	protected AppiumDriver<WebElement> driver;
	
	String newTaskBtnXPath = "//XCUIElementTypeImage[@name=\"plus.circle.fill\"]";
	
	String taskTextboxXPath = "//XCUIElementTypeApplication[@name=\"dodo\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField";
	
	String colorTagGreenXPath = "(//XCUIElementTypeImage[@name=\"smallcircle.fill.circle.fill\"])[2]";
	
	String applyBtnXPath = "//XCUIElementTypeButton[@name=\"Apply\"]";
	
	public TaskPage(AppiumDriver<WebElement> driver) {
		this.driver = driver;
	}
	
	public void clickAdd() {
		driver.findElementByXPath(newTaskBtnXPath).click();
	}
	
	public void inputTask(String input) {
		WebElement newTaskTextbox = driver.findElementByXPath(taskTextboxXPath);
		newTaskTextbox.click();
		newTaskTextbox.sendKeys(input);
	}
	
	public void clickGreenColorTag() {
		driver.findElementByXPath(colorTagGreenXPath).click();
	}
	
	
	public void clickApply() {
		driver.findElementByXPath(applyBtnXPath).click();
	}
}
