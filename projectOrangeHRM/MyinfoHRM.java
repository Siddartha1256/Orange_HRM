package projectOrangeHRM;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyinfoHRM {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[6]")).click();
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.name("firstName"));
        ele.sendKeys(Keys.CONTROL+"A");
        Thread.sleep(1000);
        ele.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(1000);
        ele.sendKeys("Raichur");
        Thread.sleep(1000);
        WebElement ele1 = driver.findElement(By.name("middleName"));
        ele1.sendKeys(Keys.CONTROL+"A");
        ele1.sendKeys(Keys.BACK_SPACE);
        ele1.sendKeys("Siddartha");
        Thread.sleep(1000);
        WebElement ele2 = driver.findElement(By.name("lastName"));
        ele2.sendKeys(Keys.CONTROL+"A");
        ele2.sendKeys(Keys.BACK_SPACE);
        ele2.sendKeys("Sanjay");
        driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("sidda or sanju");
        WebElement ele3 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
        ele3.sendKeys(Keys.CONTROL+"A");
        ele3.sendKeys(Keys.BACK_SPACE);
        ele3.sendKeys("0321");
        WebElement ele4 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
        ele4.sendKeys(Keys.CONTROL+"A");
        ele4.sendKeys(Keys.BACK_SPACE);
        ele4.sendKeys("KA36 0007");
        WebElement ele5 = driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]"));
        ele5.sendKeys(Keys.CONTROL+"A");
        ele5.sendKeys(Keys.BACK_SPACE);
        ele5.sendKeys("2036-08-07");
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
        
        
        
       /* Robot r=new Robot(); 
        r.keyPress(KeyEvent.VK_BACK_SPACE);
        r.keyRelease(KeyEvent.VK_BACK_SPACE);*/
        //driver.quit();
	}

}
