package tests;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SalesPage;
public class MySalesLeadsTest extends TestBase {
	HomePage homepageobject;
	SalesPage salesobject;
	@Test(priority = 1)
	public void navigateToSalesPage() {
		homepageobject = new HomePage(driver);
		salesobject = new SalesPage(driver);
		homepageobject.salesNavigate();
		assertEquals("Requests Inbox { All Active Requests }", salesobject.requestInbox.getText());	
	}
}
