package Generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Photo 
{
   
   public static void capture(WebDriver driver) throws IOException 
 
   {
	   Date dt = new Date();
	   String st = dt.toString();
	   String s = st.replace(":","-");
	   TakesScreenshot tss= (TakesScreenshot) driver;
	   File temp = tss.getScreenshotAs(OutputType.FILE);
	   File per = new File("./Photos/"+s+".jpg");
	   FileHandler.copy(temp, per);
   }
   
}
