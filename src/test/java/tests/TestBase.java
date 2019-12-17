package tests;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import pages.LoginPage;
import utilities.Helper;


public class TestBase {
	public static WebDriver driver;
	LoginPage loginobjects;

	@BeforeSuite
	public void StartDriver() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driveres\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://staging.tangramerp.com/staff/login");
		loginobjects = new LoginPage(driver);
		loginobjects.userLogin("Test", "test1234");
		for (String currentWindow: driver.getWindowHandles()) {
			driver.switchTo().window(currentWindow);
		}
		
		driver.findElement(By.cssSelector("#step-1 > footer > div > a")).sendKeys(Keys.ESCAPE);
		driver.navigate().refresh();		
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

	}

	@AfterTest
	public void StopDriver() {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//DIV[@class='top-menu']//A[@href='javascript:;']"))).moveToElement(driver.findElement(By.cssSelector("body > div.page-header.navbar.navbar-fixed-top > div > div.top-menu > ul > li.dropdown.dropdown-user > ul > li:nth-child(6) > a"))).click().build().perform();		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.quit();
	}
	@AfterMethod
	public void screenshotfail(ITestResult Result) {
		if (Result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failure...");
			System.out.println("Taking screenshot...");
			Helper.ScreenshotCapture(driver, Result.getName());

		} 
	}
}