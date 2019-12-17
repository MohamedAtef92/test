package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ManageCompaniesPage extends PageBase {

	public ManageCompaniesPage(WebDriver driver) {
		super(driver);
	}
@FindBy (xpath= "//A[@href='https://staging.tangramerp.com/admin/companies/add']")
WebElement AddCompanyBtn;
@FindBy (id="CompanyName")
WebElement CompanyName;
@FindBy (id="CompanyLocalName")
WebElement CompanyLocalName;
@FindBy (id="CompanyEmail")
WebElement CompanyEmail;
@FindBy (id="CompanyTelephone")
WebElement CompanyTelephone;
@FindBy (xpath="//BUTTON[@id='data[save]']")
WebElement SaveBtn;
public void addcompany(String companyname, String companylocalname , String companyemail , String companytelephone) {
	AddCompanyBtn.click();
	CompanyName.clear();
	CompanyName.sendKeys(companyname);
	CompanyLocalName.clear();
	CompanyLocalName.sendKeys(companylocalname);
	CompanyEmail.clear();
	CompanyEmail.sendKeys(companyemail);
	CompanyTelephone.clear();
	CompanyTelephone.sendKeys(companytelephone);
	SaveBtn.sendKeys(Keys.END);
	SaveBtn.click();
}
}
