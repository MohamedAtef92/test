package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageEmployeePage;

public class EditEmployee extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageEmployeePage manageemployeepageobject;
  @Test
  public void editemployeecheck() {
	  homepageobject = new HomePage(driver);
	  homepageobject.adminNavigate();
	  adminpageobject = new AdminPage(driver);
	  adminpageobject.systemusersnavigate();
	  manageemployeepageobject = new ManageEmployeePage(driver);
	  manageemployeepageobject.searchforuser();
	  manageemployeepageobject.edituser();
	  manageemployeepageobject.editphone();
	  assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]")).getText().contains("Data Updated"));
  }
}
