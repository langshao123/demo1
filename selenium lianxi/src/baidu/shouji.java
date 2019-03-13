package baidu;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class shouji {
	WebDriver driver;
	    @Before
	    public void openfire() {
			System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
			 driver=new ChromeDriver();
			String url="http://localhost:8080/mobile_mysql/index.jsp";
			driver.get(url);
	    }
		@Test
		public void shouji1() throws InterruptedException {
			driver.findElement
			(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[2]/a[1]")).click();
			driver.findElement(By.name("name")).sendKeys("bhq6");
			driver.findElement(By.name("password")).sendKeys("help6");
			driver.findElement(By.name("passwordOne")).sendKeys("help6");
			driver.findElement(By.name("reallyName")).sendKeys("狼少");
			driver.findElement(By.name("age")).sendKeys("8");
			driver.findElement(By.name("profession")).sendKeys("法师");
			driver.findElement(By.name("email")).sendKeys("1234567890@qq.com");
			driver.findElement(By.name("question")).sendKeys("谁最帅");
			driver.findElement(By.name("result")).sendKeys("狼少");
			driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td/form/input")).click();
			Thread.sleep(2000);
		}
			@Test
			public void shouji2(){
			driver.findElement
			(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("bhq6"); 
			driver.findElement
			(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("help6");
		    driver.findElement
		    (By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input")).click();
			}
		    /*			driver.manage().window().maximize();
			String a=driver.getCurrentUrl(); 
			String b=driver.getTitle();
			System.out.println(a);
			System.out.println(b);*/
/*		    driver.findElement(By.name("name")).sendKeys("bhq");
			driver.findElement(By.name("password")).sendKeys("help");
			driver.findElement(By.className("input1")).click();*/
//			driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[1]/td[2]/input")).sendKeys("bhq"); 
	//		driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[2]/td[2]/input")).sendKeys("help"); 
		//	driver.findElement(By.xpath("/html/body/table[5]/tbody/tr/td[1]/table[1]/tbody/tr/td/form/table/tbody/tr[3]/td[1]/input")).click();

			

		}
		

