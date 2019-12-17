package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends PageBase{

	public AdminPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath= "((//DIV[@class='icon-btn '])[3]/../..//DIV[@class='icon-btn '])[4]")
	WebElement SystemUsersBtn;
	@FindBy (xpath="(//DIV[@class='icon-btn '])[6]")
	WebElement ManageCompaniesBtn;
	@FindBy (xpath="(//DIV[@class='icon-btn '])[7]")
	WebElement ManageBranches;
	@FindBy (xpath="(//DIV[@class='icon-btn '])[8]")
	WebElement ManageDepartment;
	public void systemusersnavigate () {
		SystemUsersBtn.click();
	}
	public void managecompaniesnavigate() {
		ManageCompaniesBtn.click();
	}
	public void managebranchesnavigate() {
		ManageBranches.click();
	}
	public void managedepartmentsnavigate() {
		ManageDepartment.click();
	}
}
