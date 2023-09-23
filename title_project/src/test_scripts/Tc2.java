package test_scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic.Excel;
import Generic.Launch;
import pom.Login_page;

public class Tc2 extends Launch
{
	@DataProvider(name="testing")
	String[][] dta()
	{
		String[][] arr= {{},{},{}};
		return arr;
	}

	@Test(dataProvider = "testing")
	void tc2(String un,String pwd) throws Exception 
	{
		 Login_page lg = new Login_page(driver);
		 lg.enterusername(un);
		 lg.enterpassword(pwd);
	}
}
