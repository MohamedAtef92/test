package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageEmployeePage extends PageBase {

	public ManageEmployeePage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath= "(//DIV[@class='portlet-title pointer'])[1]/../../../..//A[@href='https://staging.tangramerp.com/admin/staff/add']")
	WebElement AddEmployeeBtn;
	@FindBy (xpath = "//A[@href='/admin/staff/view/1988']")
	WebElement viewbtn;
	@FindBy (xpath = "(//A[@href='https://staging.tangramerp.com/admin/staff/add']/../../..//DIV[@class='portlet-title pointer'])[1]")
	WebElement filterbtn;
	@FindBy (id="staff_search")
	WebElement staffsearch;
	@FindBy (id="submitFilters")
	WebElement submitbtn;
	@FindBy (xpath="//TD[text()='Searchtesting']/..//A[@href='/admin/staff/edit/1988']")
	WebElement editbtn;
	@FindBy (id = "StaffWorkPhoneExt")
	WebElement workphone;
	@FindBy (id = "data[save]")
	WebElement savebtn;
	@FindBy (id="deny_button_1988")
	WebElement activebtn;
	public void addnewemployeenavigate() {
	AddEmployeeBtn.click();
	}
	public void viewemployeenavigate() {
		viewbtn.click();
	}
	public void searchforuser() {
		filterbtn.click();
		staffsearch.clear();
		staffsearch.sendKeys("searchtesting");
		submitbtn.click();
	}
	public void edituser( ) {
		editbtn.click();
	}
	public void editphone() {
		workphone.clear();
		workphone.sendKeys("012");
		savebtn.sendKeys(Keys.END);
		savebtn.click();
	}
	public void activeuser() {
		activebtn.click();
	}
}
