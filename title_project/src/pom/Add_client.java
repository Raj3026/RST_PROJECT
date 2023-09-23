package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Add_client
{
 @FindBy(xpath = "//input[@id='company_name']")
 private WebElement clientname;
 @FindBy(xpath = "//input[@id='client_zip']")
 private WebElement zip;
 @FindBy(xpath = "//select[@id='client_status']")
 private WebElement clientstatus;
 @FindBy(xpath = "//button[@id='create_pass']")
 private WebElement createpass;
 @FindBy(xpath = "//input[@id='client_password']")
 private WebElement clientpass;
 @FindBy(xpath = "//input[@id='confirm_password']")
 private WebElement cnfpass;
 @FindBy(xpath = "//select[@id='client_agent']")
 private WebElement selectagent; 
 @FindBy(xpath = "//input[@value='Choose Towns...']")
 private WebElement agencies;
 @FindBy(xpath = "//input[@id='client_address']")
 private WebElement staddress;
 @FindBy(xpath = "//input[@id='client_city']")
 private WebElement city;
 @FindBy(xpath = "//input[@id='client_contact']")
 private WebElement cellph;
 @FindBy(xpath = "//input[@id='client_email']")
 private WebElement clientemail;
 @FindBy(xpath = "//select[@id='client_found']")
 private WebElement clientfound;
 @FindBy(xpath = "//button[@class='btn-submit']")
 private WebElement submit;
 
 
 public Add_client(WebDriver d)
 {
	 PageFactory.initElements(d,this);
 } 
 
 
 public void enterclientname(String s) 
 {
	 clientname.sendKeys(s);
 }
 public void enterzip(String s) 
 {
	 zip.sendKeys(s);
 }
 public void selectclientstatus_Active() 
 {
	 Select s=new Select(clientstatus);
	 s.selectByIndex(1);
 }
 public void clientstatus_inactive() 
 {
	 Select s = new Select(clientstatus);
     s.selectByIndex(2);
 }
 
 public void clickcreatepass() 
 {
	 createpass.click();
 }
 public void enterclientpass(String s) 
 {
	 clientpass.sendKeys(s);
 }
 public void entercnfpass(String s) 
 {
	 cnfpass.sendKeys(s);
 }
 public void enteragencies(String s) 
 {
	 agencies.sendKeys(s);
 }
 public void slagent()
 {
	 Select s = new Select(selectagent);
	 s.selectByIndex(3);
 }
 public void enterstaddress(String s) 
 {
	 staddress.sendKeys(s);
 }
 public void entercity(String s) 
 {
	 city.sendKeys(s);
 }
 public void entercellph(String s) 
 {
	 cellph.sendKeys(s);
 }
 public void enterclientemail(String s) 
 {
	 clientemail.sendKeys(s);
 }
 public void slclientfound()
 {
	 Select s = new Select(clientfound);
	 s.selectByIndex(1);
 }
 public void clicksubmit()
 {
	 submit.click();
 }
 
}
