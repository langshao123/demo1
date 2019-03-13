package baidu;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lian1 {
	@Test
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url="https://www.baidu.com";
		driver.get(url);
		
		String a=driver.getTitle();
		String b=driver.getCurrentUrl();
		System.out.println(a);
		System.out.println(b);
		driver.manage().window().maximize();
		String url1="https://www.DNS.com";
		driver.get(url1);
		driver.navigate().back();
		driver.navigate().forward();
	}

}
