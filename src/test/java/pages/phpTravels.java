package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class phpTravels {

	WebDriver driver;
	public phpTravels (WebDriver x) {
		driver = x;
	}
	public WebElement getFirstNameBox() {
		
		WebElement firstNameBox = driver.findElement(By.name("firstname"));
		return firstNameBox;

		}
	public WebElement getLastNameBox() {
		WebElement lastNameBox = driver.findElement(By.name("lastname"));
		return lastNameBox;
	}
	public WebElement getMobileNumberBox() { 
		WebElement mobileNumberBox = driver.findElement(By.name("phone"));
		return mobileNumberBox;
		
		}
	public WebElement getEmaileBox() { 
		WebElement emaileBox = driver.findElement(By.name("email"));
		return emaileBox;
		
		}
	public WebElement getPaswordeBox() { 
		WebElement passwordBox = driver.findElement(By.name("password"));
		return passwordBox;
		
		}
	public WebElement getConfirmPasswordBox() { 
		WebElement confirmPasswordBox = driver.findElement(By.name("confirmpassword"));
		return confirmPasswordBox;
		
		}
	
	public WebElement readsignupButtonText() {
		WebElement signupButtonText = driver.findElement(By.xpath("//*[@id=\"headersignupform\"]/div[9]/button"));
		return signupButtonText;
	}
	
}
