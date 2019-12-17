package tests;

import static org.testng.Assert.assertFalse;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageEmployeePage;

public class ActiveEmployee extends TestBase {
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageEmployeePage manageemployeepageobject;
	@Test
	public void ActiveUserCheck () {
		homepageobject = new HomePage(driver);
		homepageobject.adminNavigate();
		adminpageobject = new AdminPage(driver);
		adminpageobject.systemusersnavigate();
		manageemployeepageobject = new ManageEmployeePage(driver);
		manageemployeepageobject.searchforuser();
		manageemployeepageobject.activeuser();
		manageemployeepageobject.edituser();
		WebElement id = driver.findElement(By.id("StaffActive")); 
		assertFalse(id.isSelected());
		id.click();
		driver.findElement(By.id("data[save]")).sendKeys(Keys.END);
		driver.findElement(By.id("data[save]")).click();
		}
}
