package tests;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
public class UserLoginTest extends TestBase {
	LoginPage loginobjects;
	HomePage homepageobjects;
	@Test
	public void usercanlogin () {
		homepageobjects = new HomePage (driver);
		assertEquals("Memphis Tours", homepageobjects.txt.getText());
	}	
}
