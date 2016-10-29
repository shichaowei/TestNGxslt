package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class myblog {
	
	@FindBy(xpath="//div[text()='É¾³ý']")
	public WebElement deletebtn;
	WebDriver driver;
	
	public myblog(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickdeletebtn(){
		deletebtn.click();
	}
	

}
