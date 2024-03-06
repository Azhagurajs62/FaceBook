package org.Facebook.stepdefinition;
import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	static WebDriver driver;
	@Given("user launches facebook applications")
	public void user_launches_facebook_applications() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.Facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("browserlaunch");
	}

	@And("user able to create Account")
	public void user_able_to_create_Account() {
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			}

	@Then("User able to signup")
	public void user_able_to_signup() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("ajith");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("kumar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("ajay.ajith5396@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("ajay.ajith5396@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("ajithkumar@0123");
        WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
        Select s=new Select(date);
        s.selectByIndex(12);
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
        Select s1=new Select(day);
        s1.selectByIndex(10);
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
        Select s3=new Select(year);
        s3.selectByValue("2000");
        
       
	}
	

	@And("User choose DOB")
	public void user_choose() throws Throwable {
		 WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
	        Select s=new Select(date);
	        s.selectByIndex(12);
	        Thread.sleep(3000);
	        WebElement day = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
	        Select s1=new Select(day);
	        s1.selectByIndex(10);
	        Thread.sleep(3000);

	        WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
	        Select s3=new Select(year);
	        s3.selectByValue("2000");
	        
	  
	}

	@Then("user validate confirmation message")
	public void user_validate_confirmation_message() throws Throwable {
        driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _9nq1 textPadding20px _4jy3 _517h _51sy']")).click();
	   
	}
	@When("Users able to signup by one dim list")
	public void users_able_to_signup_by_one_dim_list(DataTable dataTable) throws Throwable {
	    List<String> asList = dataTable.asList();
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(asList.get(0));
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys(asList.get(1));
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys(asList.get(2));
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys(asList.get(2));
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys(asList.get(3));
        WebElement date = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[1]"));
        Select s=new Select(date);
        s.selectByIndex(12);
        Thread.sleep(3000);
        WebElement day = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[2]"));
        Select s1=new Select(day);
        s1.selectByIndex(10);
        Thread.sleep(3000);

        WebElement year = driver.findElement(By.xpath("(//select[@class='_9407 _5dba _9hk6 _8esg'])[3]"));
        Select s3=new Select(year);
        s3.selectByValue("2000");
        
       
	    
	}
	

}

	

	