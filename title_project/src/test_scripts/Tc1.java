package test_scripts;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic.Excel;
import Generic.Launch;
import pom.Login_page;

public class Tc1 extends Launch
{
 @Test
 void tc1() throws EncryptedDocumentException, IOException
 {
	 Login_page login = new Login_page(driver);
	 String a = Excel.fetchdata(1,0);
	 login.enterusername(a);
	 String b = Excel.fetchdata(1,1);
	 login.enterpassword(b);
	 login.clicksubmit();
	 WebDriverWait wait=new WebDriverWait(driver, 10);
	 wait.until(ExpectedConditions.titleContains("Dashboard"));
	 String act = driver.getTitle();
	 String exp = Excel.fetchdata(1,2);
	 assertEquals(act, exp);
 }
 
}
