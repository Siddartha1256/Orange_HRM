package projectOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIM_HRM {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        //PIM
        
        driver.findElement(By.xpath("(//span[.='PIM'])[1]")).click();
        
        //add emp details
        
        driver.findElement(By.xpath("//a[.='Employee List']")).click();
        driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
        driver.findElement(By.name("firstName")).sendKeys("raichur");
        driver.findElement(By.name("lastName")).sendKeys("siddartha");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("4321");
        Thread.sleep(2000);
        
        //add pic
        
        driver.findElement(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--solid-main employee-image-action']"))
        .sendKeys("C:\\Users\\HP\\Pictures\\as.png"); 													//path of the file
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(2000);
        driver.quit();
        
	}
	
}
