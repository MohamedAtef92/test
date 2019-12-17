package tests;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageBranchesPage;
public class AddNewBranch extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageBranchesPage managebranchobject;
	@Test
	public void addbranch() {
		homepageobject = new HomePage(driver);
		homepageobject.adminNavigate();
		adminpageobject = new AdminPage(driver);
		adminpageobject.managebranchesnavigate();
		managebranchobject = new ManageBranchesPage(driver);
		managebranchobject.addbranchnavigate("test", "test@test.com");
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]")).getText().contains("has been added"));
	}}
