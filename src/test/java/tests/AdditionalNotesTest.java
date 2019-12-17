package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.AttionalNotesPage;
import pages.HomePage;
import pages.RequestPage;
import pages.SalesManagerPage;


public class AdditionalNotesTest extends TestBase {
	HomePage homepageobject;
	SalesManagerPage salesamnagerobjects;
	RequestPage requestpageobject;
	AttionalNotesPage addionalnotesobject;
	public AdditionalNotesTest() {
	}
	@Test
	public void additionalnotescheck() {
		homepageobject = new HomePage(driver);
		homepageobject.mySalesManagerNavigate();
		salesamnagerobjects = new SalesManagerPage(driver);
		salesamnagerobjects.requestnavigate();
		requestpageobject = new RequestPage(driver);
		requestpageobject.additionalnotesnavigate();
		addionalnotesobject = new AttionalNotesPage(driver);
		driver.switchTo().frame(driver.findElement(By.tagName("iframe")));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("")));
		driver.findElement(By.xpath("")).sendKeys("test");
		//addionalnotesobject.addnotes();
	}
}
