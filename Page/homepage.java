package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.*;
public class homepage {
	
	@FindBy(id="username")
	public WebElement username;

	@FindBy(id="password")
	public WebElement password;

	@FindBy(id="loginbtn")
	public WebElement loginbtn;
	
	WebDriver ff;
	public homepage(WebDriver ff){
		PageFactory.initElements(ff, this);
		this.ff=ff;
	}
	
	public void actlogin(String user,String pass){
		username.sendKeys(user);
		password.sendKeys(pass);
		loginbtn.click();
	}
	
}
