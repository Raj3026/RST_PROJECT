package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Vehicle 
{
 @FindBy(xpath = "//a[.='Add Vehicle']")
 private WebElement advehicle;
 
 
 
 
 public void cliadvehicle()
 {
	 advehicle.click();
 }
}
