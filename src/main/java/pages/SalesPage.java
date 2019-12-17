package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPage extends PageBase {

	public SalesPage(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath = "/html/body/div[3]/div[1]/div/div[1]/ul/li[1]/ul/li[3]/a")
	WebElement salesManager;
	@FindBy (xpath  = "//*[@id=\"page_title\"]")
	public WebElement requestInbox;
	public void salesManagerNavigate() {
		salesManager.click();
		}
}
