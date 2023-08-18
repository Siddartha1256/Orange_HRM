package projectOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PerformanceHRM {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
       
        //Performance
        
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[7]")).click();
        Thread.sleep(2000);
        
        //Manage Reviews
        
        driver.findElement(By.xpath("//span[.='Manage Reviews ']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-link']")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click(); 										//ADD Button
        
        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Dominic  Chase");	//Employee Name
        
        driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[2]")).sendKeys("John  Smith");		//Reviewer
        Thread.sleep(2000);
        
        WebElement ele = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]"));
        ele.click();
        //ele.sendKeys(Keys.CONTROL+"A");
        //ele.sendKeys(Keys.BACK_SPACE);
        ele.sendKeys("2023-09-06");
        WebElement ele1 = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]"));
        ele1.click();
        //ele1.sendKeys(Keys.CONTROL+"A");
        //ele1.sendKeys(Keys.BACK_SPACE);
        ele1.sendKeys("2024-09-06");
        Thread.sleep(2000);
        WebElement ele2 = driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[3]"));
        ele2.click();
        //ele2.sendKeys(Keys.CONTROL+"A");
        //ele2.sendKeys(Keys.BACK_SPACE);
        ele2.sendKeys("2024-09-07");
        Thread.sleep(2000);
        //driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        
        driver.quit();
        
        
        /*
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[1]")).click(); 				//Job Title Drop down
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
        
        driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).click();                 //Review Status Drop down
        driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();*/
	}

}