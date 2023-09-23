package Generic;

import java.io.IOException;
import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch implements Framework_constant
{
public WebDriver driver;
 @BeforeMethod
 public void openApp()
 {
	 System.setProperty(gk,gv);
	 driver=new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get(url);
	 }
 @AfterMethod
 public void closeApp() throws IOException
 {
	 Photo.capture(driver);
	 driver.quit();
 }
}
