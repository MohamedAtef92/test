package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="data[Staff][username]")
    WebElement username;
	@FindBy(name="data[Staff][password]")
	WebElement password;
	@FindBy(id="loginBtn")
	WebElement lgnbtn;
	
	public void userLogin (String Username , String Password ) {
	username.clear();
	username.sendKeys(Username);
	password.clear();
	password.sendKeys(Password);
	lgnbtn.click();
	}
}
