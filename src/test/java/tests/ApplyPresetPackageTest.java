package tests;
import static org.testng.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RequestPage;
import pages.SalesManagerPage;

public class ApplyPresetPackageTest extends TestBase {
	HomePage homepageobject;
	SalesManagerPage salesamnagerobjects;
	RequestPage requestpageobject;
	@Test
	public void checkPresetPackage ()  
	{
		@SuppressWarnings("deprecation")
		WebDriverWait wait=new WebDriverWait(driver, 10);
		homepageobject = new HomePage(driver);
		homepageobject.mySalesManagerNavigate();
		salesamnagerobjects = new SalesManagerPage(driver);
		salesamnagerobjects.requestnavigate();
		requestpageobject = new RequestPage(driver);
		requestpageobject.itemsnavigate();
		requestpageobject.applypresetpackage();
		WebElement frame= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='mfp-iframe']"))); 
		driver.switchTo().frame(frame);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requestpageobject.apply();
		requestpageobject.fillfields();
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.id("transfers10CarTypeId")));
		actions.perform();
		requestpageobject.fillfields2();
		actions.moveToElement(driver.findElement(By.id("data[apply]")));
		requestpageobject.applying();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertTrue(requestpageobject.suceesmsg.getText().contains("Package Assigned to Request Successfully"));
		driver.switchTo().defaultContent();
	}
	}
