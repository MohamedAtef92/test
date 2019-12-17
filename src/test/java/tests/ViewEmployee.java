package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageEmployeePage;

public class ViewEmployee extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageEmployeePage manageemployeepageobject;
  @Test
  public void viewbtncheck() {
	  homepageobject = new HomePage(driver);
	  homepageobject.adminNavigate();
	  adminpageobject = new AdminPage(driver);
	  adminpageobject.systemusersnavigate();
	  manageemployeepageobject = new ManageEmployeePage(driver);
	  manageemployeepageobject.searchforuser();
	  manageemployeepageobject.viewemployeenavigate();
	  assertTrue(driver.findElement(By.xpath("//SPAN[text()='View Employee Details']/../../../..//H1[text()='View Employee Details']")).getText().contains("View"));
  }
}
