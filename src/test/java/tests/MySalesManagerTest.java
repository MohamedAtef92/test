package tests;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import pages.HomePage;
import pages.SalesManagerPage;

public class MySalesManagerTest extends TestBase{
	HomePage homepageobject;
	SalesManagerPage salesamnagerobjects;

	@Test (priority = 1)
	public void navigateToSalesManagerPage () {
		homepageobject = new HomePage(driver);
		homepageobject.mySalesManagerNavigate();
		salesamnagerobjects = new SalesManagerPage(driver);
		assertEquals("Sales Leads Manager { All Active Requests }", salesamnagerobjects.salesManagerTxt.getText());	
	}
}
