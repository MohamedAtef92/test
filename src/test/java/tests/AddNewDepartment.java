package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import pages.AdminPage;
import pages.HomePage;
import pages.ManageDepartmentPage;

public class AddNewDepartment extends TestBase{
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageDepartmentPage managedepartmentpageobject;
	@Test
	public void adddepartment() {
		homepageobject = new HomePage(driver);
		homepageobject.adminNavigate();
		adminpageobject = new AdminPage(driver);
		adminpageobject.managedepartmentsnavigate();
		managedepartmentpageobject = new ManageDepartmentPage(driver);
		managedepartmentpageobject.addnewdepartmentnavigate("test2");
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]")).getText().contains("Has Been Added"));
	}
}
