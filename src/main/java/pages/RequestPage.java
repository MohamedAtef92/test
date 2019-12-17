package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class RequestPage extends PageBase {

	public RequestPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Items")
	WebElement items;
	@FindBy (xpath = "//*[@id=\"items\"]/div/div/div[1]/div/a")
	WebElement ApplyPresetPackageBtn;
	@FindBy (xpath  = "(//TD[contains(text(),'Cairo ')][contains(text(),'Cairo ')])[1]/..//A[@href='/travel/packages/apply_to_request/1/631853']")
	WebElement Applybtn;
	/* for future use .. The right absoulte xpath for applybtn is 
	td[contains(.,'Cairo & The Oberoi Philae Nile Cruise')]/ancestor::tr//a[contains(@href,'apply_to_request')] */
	@FindBy(id = "hotels10RoomInfo1NumOfRooms")
	WebElement room;
	@FindBy(id= "hotels10RoomInfo1RoomTypeId")
	WebElement roomtype;
	@FindBy (id= "transfers10CarTypeId")
	WebElement cartype;
	@FindBy (id = "data[apply]")
	WebElement finalapplybtn;
	@FindBy (id="successMsg")
	public WebElement suceesmsg;
	@FindBy (xpath = "(//A[@data-toggle='tab'][text()='Log']/../..//A[@data-toggle='tab'])[7]")
	WebElement additionalNotesBtn;
	public void itemsnavigate() {
		items.click();
	}
	public void applypresetpackage() {
		ApplyPresetPackageBtn.click();
	}
	public void apply() {
		Applybtn.click();
	}
	public void fillfields() {
		room.click();
		Select selectroom = new Select(room);
		selectroom.selectByValue("2");
		roomtype.click();
		Select selectroomtype= new Select(roomtype);
		selectroomtype.selectByValue("-1");	
	}
	public void fillfields2() {
		cartype.click();
		Select selectcartype= new Select(cartype);
		selectcartype.selectByValue("1");
	}
	public void applying() {
		
		finalapplybtn.click();
	}
	public void additionalnotesnavigate () {
		additionalNotesBtn.click();
	}

}
