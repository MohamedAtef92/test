package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AttionalNotesPage extends PageBase {
  
  public AttionalNotesPage(WebDriver driver) {
		super(driver);
	}
@FindBy (id="cke_additional_notes")
WebElement form;
@FindBy (id="data[save]")
WebElement savebtn;
public void addnotes() {
	form.click();
	form.sendKeys("Hi");
	savebtn.click();
}
}
