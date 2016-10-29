package deleter;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.homepage;
import Page.myblog;

public class Case {
	public static void sleep(long time){
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void test(){
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://study-miniblog-perf.qa.netease.com/");
		new homepage(driver).actlogin("wsk001", "123456");
		sleep(1000);
		for(int i=0;i<50;i++){
			new myblog(driver).clickdeletebtn();
			sleep(2000);
		}
		driver.quit();
	}
	
}
