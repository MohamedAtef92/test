package tests;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.HomePage;
import pages.ManageEmployeePage;
import pages.NewEmployeePage;
public class AddNewEmployee extends TestBase{
	HomePage homepageobject;
	AdminPage adminpageobject;
	ManageEmployeePage manageemployeeobject;
	NewEmployeePage newemployeepageobject;
	@Test
	public void addnewemployee() {
		homepageobject = new HomePage(driver);
		homepageobject.adminNavigate();
		adminpageobject = new AdminPage(driver);
		adminpageobject.systemusersnavigate();
		manageemployeeobject = new ManageEmployeePage(driver);
		manageemployeeobject.addnewemployeenavigate();
		newemployeepageobject = new NewEmployeePage(driver);
		newemployeepageobject.fillUserData("test3000", "testtesttest3", "1234", 1, 1);
		assertTrue(driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[3]")).getText().contains("Has Been Added Successfully"));
	}
	}
