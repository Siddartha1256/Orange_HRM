package projectOrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LeaveHRM {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[@href='/web/index.php/leave/viewLeaveModule']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("");
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[2]")).click();
        driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[2]")).sendKeys("");
        driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
        //driver.findElement(By.xpath("(//input[@placeholder='Type for hints...")).sendKeys("zoro");
       // driver.findElement(By.xpath("(//input[@placeholder='yyyy-mm-dd'])[1]")).sendKeys("");
	}

}
