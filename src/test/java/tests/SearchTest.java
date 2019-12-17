package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageEmployeePage;

public class SearchTest extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageEmployeePage manageemployeepageobject;
  @Test
  public void searchcheck() {
	  homepageobject = new HomePage(driver);
	  homepageobject.adminNavigate();
	  adminpageobject = new AdminPage(driver);
	  adminpageobject.systemusersnavigate();
	  manageemployeepageobject = new ManageEmployeePage(driver);
	  manageemployeepageobject.searchforuser();
	  assertTrue(driver.findElement(By.xpath("//TD[text()='1988']/following-sibling::TD")).getText().contains("Searchtesting"));
  }
}
