package pom;

import java.security.PrivateKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
 @FindBy(xpath = "//input[@id='user_name']")
     private WebElement username;
 @FindBy(xpath = "//input[@id='user_password']")
     private WebElement password;
 @FindBy(xpath = "//button[@type='submit']")
     private WebElement submit;
 
  public Login_page(WebDriver d)
 {
	 PageFactory.initElements(d,this);
 }
 
 
 
public void enterusername(String s)
 {
	 username.sendKeys(s);
 }
 public void enterpassword(String s)
 {
	 password.sendKeys(s);
 }
 public void clicksubmit()
 {
	 submit.click();
 }
}
