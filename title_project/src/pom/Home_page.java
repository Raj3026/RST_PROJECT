package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page
{
 @FindBy(xpath="//span[contains(.,'Dashboard')]")
 private WebElement dashboard;
 @FindBy(xpath = "//span[contains(.,'Client Management')]")
 private WebElement clientmanagement;
 @FindBy(xpath = "//a[.='Client List']")
 private WebElement clientlist;
 
 public Home_page(WebDriver d)
 {
	 PageFactory.initElements(d,this);
 }
 
 public void clidashboard()
 {
	 dashboard.click();
 }
 public void clickclientmanagement()
 {
	 clientmanagement.click();
 }
 public void clickclientlist()
 {
	 clientlist.click();
 }
}
