package Es;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class Dropdown_steps {
	@Given("^John is viewing the Etsy landing page$")
		public void John_is_viewing_the_Etsy_landing_page() throws Throwable {
			
	// Driver location for Firefox driver
		System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
		WebDriver obj=new FirefoxDriver();
		obj.get("https://www.etsy.com");
		Thread.sleep(5000);
		obj.manage().window().maximize();
	    Thread.sleep(5000);
	    obj.close();
         }
		     	
	@When("^he searches for a product from the drop-down menu$")
	public void he_searches_for_a_product_from_the_drop_down_menu() throws Throwable {
		// Driver location for Firefox driver
				System.setProperty("webdriver.gecko.driver","D:\\Myworkspace\\Drivers\\geckodriver.exe");
				WebDriver obj=new FirefoxDriver();
				obj.get("https://www.etsy.com");
				Thread.sleep(5000);
				obj.manage().window().maximize();
			    Thread.sleep(5000);
			 // clciking the "Jewellery" link
			 obj.findElement(By.xpath(".//*[@id='catnav-primary-link-1179-link']")).click();
			 // Using Action class to select "All Jewellery" element from dropdown list
				Actions a=new Actions(obj);
		        a.sendKeys(Keys.TAB,Keys.ENTER).build().perform();
		        Thread.sleep(5000);
			    obj.close();

			}

	@Then("^the result should be displayed$")
	public void the_result_should_be_displayed() throws Throwable {
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




