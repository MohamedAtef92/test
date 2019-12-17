package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesManagerPage extends PageBase {

	public SalesManagerPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath = "/html/body/div[3]/div[2]/div/div[4]")
	public WebElement salesManagerTxt;
	@FindBy(css = "#trow_631853 > td.m-heading-1.border-blue > a")
	WebElement request;
	
	public void requestnavigate () {
	request.click();	
	}
}
