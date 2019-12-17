package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ManageDepartmentPage extends PageBase{

	public ManageDepartmentPage(WebDriver driver) {
		super(driver);
	}
@FindBy (xpath="//A[@href='https://staging.tangramerp.com/admin/departments/add']")
WebElement AddNewDepartmentBtn;
@FindBy (id="DepartmentName")
WebElement DepartmentName;
@FindBy (id="DepartmentCompanyId")
WebElement DepartmentCompanyId;
@FindBy (id="DepartmentManagerStaffId")
WebElement DepartmentManagerStaffId;
@FindBy (id="data[save]")
WebElement SaveBtn;
public void addnewdepartmentnavigate(String departmentname) {
	AddNewDepartmentBtn.click();
	DepartmentName.clear();
	DepartmentName.sendKeys(departmentname);
	DepartmentManagerStaffId.sendKeys("1988");
	Select select = new Select(DepartmentCompanyId);
	select.selectByIndex(0);
	SaveBtn.sendKeys(Keys.END);
	SaveBtn.click();
}
}
