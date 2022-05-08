package methods;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/main/resources/features"},
		glue= {"stepFile"},
		tags= "@Buy",
		plugin = {"pretty", "html:target/cucumber"}
		)
public class Runner {

	public static WebDriver driver = null;
	
	public static WebDriver browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
		
	}
}


