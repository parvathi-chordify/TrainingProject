package automationExample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reditum 
  {
	WebDriver driver;
	@BeforeTest
	public void setUp() 
	{
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	}

	@Test(priority=1)
	public void userpanel() throws InterruptedException 
	{
	   
	    driver.get("https://reditum.ec/");
	    
	    Thread.sleep(3000);
	    WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"user_email\"]"));
	    WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"user_password\"]"));

	    usernameInput.sendKeys("joicy.george@chordify.com");
	    passwordInput.sendKeys("admin4reditum");

	    
	    WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/form/div[4]/input"));
	    loginButton.click();
	    Thread.sleep(3000);  
	    driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/ul/li[2]/a")).click();
	    Thread.sleep(12000);
	   
	  
	    driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/ul/li[2]/ul/li[1]/a")).click();
	    Thread.sleep(12000);
	    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div[2]/div/div/div[2]/div/div/a[1]/div/div")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"start_date\"]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/thead/tr[1]/th[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/table/tbody/tr[5]/td[5]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[6]/div[2]/div/div[3]/div[1]/div[3]/button")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[7]/div[2]/div/span/span[1]/span/ul")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/span/span/span/ul/li[2]/ul/li[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[7]/div[2]/button")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[8]/div[2]/span/span[1]/span/ul/li/input")).sendKeys("1-ACTIVO");
	    driver.findElement(By.xpath("/html/body/span/span/span/ul/li[1]/ul/li[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[8]/div[4]/button[2]")).click();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/ul/li[2]/a/i")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/ul/li[2]/ul/li[2]/a")).click();
	}
	@Test(priority=0)
	public void adminPanel() throws InterruptedException
	{
		driver.get("https://reditum.ec/admin/");
		Thread.sleep(3000);
		    WebElement usernameInput = driver.findElement(By.xpath("//*[@id=\"admin_user_email\"]"));
		    WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"admin_user_password\"]"));

		    usernameInput.sendKeys("admin@example.com");
		    passwordInput.sendKeys("admin4reditum");
        Thread.sleep(3000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/form/fieldset[2]/ol/li/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[12]/a")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("window.scrollBy(0,1000)");
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/ul/li[12]/ul/li[4]/a")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"diplay-filter\"]")).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,1000)");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"q_entity_name\"]")).sendKeys("B. ama");
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/form/div[5]/select")).click();
	    Select objSelect =new Select(driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[1]/div/form/div[5]/select")));
	    objSelect.selectByVisibleText("Igual a");
	    driver.findElement(By.xpath("//*[@id=\"q_product_2_code\"]")).sendKeys("1");
	    Thread.sleep(3000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    js1.executeScript("window.scrollBy(0,1000)");
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/form/div[8]/input[1]")).click();
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[1]/div/form/div[2]/div[1]/div/div/table/tbody/tr[3]/td[9]/div/a[1]/span")).click();
	}
	@AfterTest
	public void teardown()
	{
		driver.quit();
	}

}
