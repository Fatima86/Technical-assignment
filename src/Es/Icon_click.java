package Es;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Icon_click {
/*	@Given("^John is viewing the Etsy landing page$")
	public void John_is_viewing_the_Etsy_landing_page() throws Throwable {
		
// Driver location for Firefox driver
	System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
	WebDriver obj=new FirefoxDriver();
	obj.get("https://www.etsy.com");
	Thread.sleep(5000);
	obj.manage().window().maximize();
    Thread.sleep(5000);
     } */
    
	
	@When("^he searches for a product icon$")
	public void he_searches_for_a_product_icon() throws Throwable {
		// Driver location for Firefox driver
		System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.get("https://www.etsy.com");
		Thread.sleep(5000);
		obj.manage().window().maximize();
	    Thread.sleep(5000);
         obj.close();
    // Cascading JavaScriptExecutor with Webdriver object "obj"
     	JavascriptExecutor js=(JavascriptExecutor)obj;
     	
	    WebElement jelement=obj.findElement(By.xpath(".//*[@id='content']/div[2]/div/span[2]/div/div/div/div[2]/a/div[1]"));
    // Using WebElement to Scrolling to that located element "Jewellery Icon"
		js.executeScript("arguments[0].scrollIntoView(true);",jelement);
    // Using WebElement to click located element "Jewellery Icon"
		js.executeScript("arguments[0].click(true);",jelement);
		
		obj.close();
	}
	@Then("^the result product should be displayed$")
	public void the_result_product_should_be_displayed() throws Throwable {
	
	// Driver location for Firefox driver
			System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
			WebDriver obj=new FirefoxDriver();
			obj.get("https://www.etsy.com");
			Thread.sleep(5000);
	        obj.manage().window().maximize();
		    Thread.sleep(5000);
		obj.close();
			}
	}


