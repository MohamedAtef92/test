package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class NewEmployeePage extends PageBase{
	public NewEmployeePage(WebDriver driver) {
		super(driver);
	}
@FindBy (id= "uniform-StaffIsAccessible")
WebElement AccessBtn;
@FindBy (id="StaffActive")
WebElement ActiveBtn;
@FindBy (id = "StaffName")
WebElement StaffName;
@FindBy (id= "StaffUsername")
WebElement StaffUsername;
@FindBy (id = "StaffPassword")
WebElement StaffPassword;
@FindBy (id = "StaffConfirmPassword")
WebElement StaffConfirmPassword;
@FindBy (id = "StaffCompanyId")
WebElement StaffCompany;
@FindBy (id="DepartmentDepartment")
WebElement Department;
@FindBy (id="JobTitleJobTitle")
WebElement JobTitle;
@FindBy (id="data[save]")
WebElement savebtn;
public void fillUserData (String staffname , String staffusername , String staffpassword , int departmentindex , int jobindex) {
	AccessBtn.click();
	ActiveBtn.click();
	StaffName.clear();
	StaffName.sendKeys(staffname);
	StaffUsername.clear();
	StaffUsername.sendKeys(staffusername);
	StaffPassword.clear();
	StaffPassword.sendKeys(staffpassword);
	StaffConfirmPassword.clear();
	StaffConfirmPassword.sendKeys(staffpassword);
	Select selectdep = new Select(Department);
	selectdep.selectByIndex(departmentindex);
	Select selectjob = new Select(JobTitle);
	selectjob.selectByIndex(jobindex);
	savebtn.sendKeys(Keys.END);
	savebtn.click();
	
}
}
