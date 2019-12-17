package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}
	@FindBy (xpath = "/html/body/div[1]/div/div[2]/ul/li[1]/a")
	WebElement sales;
	@FindBy (css = "body > div.page-header.navbar.navbar-fixed-top > div > div.hor-menu.hidden-sm.hidden-xs > ul > li:nth-child(1) > ul > li:nth-child(2) > a > i")
	WebElement mySalesMangaer;
	@FindBy(linkText ="Memphis Tours")
	public WebElement txt;
	@FindBy (xpath = "(//A[@href='/tasks/SysTasks/'])[1]/../..//A[@href='javascript:;']")
	WebElement usernameBtn;
	@FindBy(xpath = "//A[@href='/admin/index']")
	WebElement adminBtn;
	public void salesNavigate() {
		sales.click();
	}
	public void mySalesManagerNavigate() {
		action.moveToElement(sales).moveToElement(mySalesMangaer).click().build().perform();
	}
	public void adminNavigate() {
		action.moveToElement(usernameBtn).moveToElement(adminBtn).click().build().perform();
	}
}
