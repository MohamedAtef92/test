package utilities;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
public static void ScreenshotCapture (WebDriver driver , String screenshotname) {
	Path dest = Paths.get("./screenshots",screenshotname  + (new Date(System.currentTimeMillis())) + ".png");
try {
	Files.createDirectories(dest.getParent());
	FileOutputStream out = new FileOutputStream(dest.toString());
	out.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
	out.close();
} catch (IOException e) {
	e.printStackTrace();
	System.out.print("Exception while taking a screenshot..");
}	
}
}
