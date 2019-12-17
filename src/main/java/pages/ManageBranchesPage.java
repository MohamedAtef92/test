package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ManageBranchesPage extends PageBase{

	public ManageBranchesPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath="//A[@href='https://staging.tangramerp.com/admin/branches/add']")
	WebElement AddBranchBtn;
	@FindBy (id="BranchName")
	WebElement BranchName;
	@FindBy (id="BranchEmail")
	WebElement BranchEmail;
	@FindBy (id="BranchCompanyId")
	WebElement BranchCompanyId;
	@FindBy (id="select2-chosen-4")
	WebElement Manager;
	@FindBy(id= "s2id_autogen4_search")
	WebElement search;
	@FindBy (id="data[save]")
	WebElement SaveBtn;
	public void addbranchnavigate(String branchname,String branchemail) {
		AddBranchBtn.click();
		BranchName.clear();
		BranchName.sendKeys(branchname);
		BranchEmail.clear();
		BranchEmail.sendKeys(branchemail);
		Select BranchComapnySelect = new Select(BranchCompanyId);
		BranchComapnySelect.selectByIndex(0);
		Manager.click();
		search.sendKeys("searchtesting");
		search.sendKeys(Keys.ENTER);		
		SaveBtn.sendKeys(Keys.END);
		SaveBtn.click();
	}
	
}
