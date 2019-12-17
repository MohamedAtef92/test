package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageCompaniesPage;

public class AddNewCompany extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageCompaniesPage managecompaniespageobject;
	@Test
	public void addnewecompany()
	{

		homepageobject = new HomePage(driver);
		homepageobject.adminNavigate();
		adminpageobject = new AdminPage(driver);
		adminpageobject.managecompaniesnavigate();
		managecompaniespageobject = new ManageCompaniesPage(driver);
		managecompaniespageobject.addcompany("test2", "test", "test@test.com", "0111");
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]")).getText().contains("The Company has been saved"));
	}
}
