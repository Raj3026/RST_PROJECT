package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Client_list 
{
 @FindBy(xpath = "//a[.='Client List']")
 private WebElement cllist;
 @FindBy(xpath ="//a[.='Add Client']")
   private WebElement addclient;
 @FindBy(xpath="//td[contains(.,'SUBHAJIT TEST')])[1]/following-sibling::td[4]/a[5]")
 private WebElement subha;
 
 Client_list(WebDriver d)
 {
	 PageFactory.initElements(d,this);
 }
 

 public void clname()
 {
	 subha.click();
 }
 public void clickcllist()
 {
	 cllist.click();
 }
 public void clickaddclient()
 {
	 addclient.click();
 }
}
