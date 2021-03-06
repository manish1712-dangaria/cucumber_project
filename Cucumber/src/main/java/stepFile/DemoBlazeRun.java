package stepFile;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.Runner;

public class DemoBlazeRun extends Runner {
	 
	
	 
	 @Given("^user views the list of product$")
	    public void userViewsTheListOfProduct() throws Throwable {
		driver = browser();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/index.html");
		Thread.sleep(5000);
		 
	    }

	    @When("^user views details of product$")
	    public void userViewsDetailsOfProduct() throws Throwable {
	    	driver.findElement(By.linkText("Phones")).click(); 
	    	driver.findElement(By.linkText("Samsung galaxy s6")).click();
	    }
	    
	    @And("^user adds product to cart$")
	    public void userAddsProductToCart() throws Throwable {
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	    	Thread.sleep(3000);
	    	Alert alert = driver.switchTo().alert();
			alert.accept();
			driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Sony vaio i5')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
			Thread.sleep(1000);
	    	Alert alert2 = driver.switchTo().alert();
			alert2.accept();
			driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[contains(text(),'ASUS Full HD')]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
			Thread.sleep(1000);
	    	Alert alert3 = driver.switchTo().alert();
			alert3.accept();
			driver.findElement(By.id("cartur")).click();
			Thread.sleep(3000);
			
	    }

	    @Then("^user checkout and makes payment for the product$")
	    public void userCheckoutAndMakesPaymentForTheProduct() throws Throwable {
	    	driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("name")).sendKeys("Manish");
			driver.findElement(By.id("country")).sendKeys("India");
			driver.findElement(By.id("city")).sendKeys("Mumbai");
			driver.findElement(By.id("card")).sendKeys("3503252200956600");
			driver.findElement(By.id("month")).sendKeys("05");
			driver.findElement(By.id("year")).sendKeys("2022");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
			Thread.sleep(7000);
			System.out.println("Test case Sucessfully passed");
	    }
	
}
