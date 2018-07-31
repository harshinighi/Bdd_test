package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
WebDriver driver;
String title;
@Given("^Login$")
public void login() {
	System.setProperty("webdriver.gecko.driver","E:\\gecko\\geckodriver.exe");
	driver= new FirefoxDriver();
	  driver.get("http://ec2-18-220-4-236.us-east-2.compute.amazonaws.com:8090/TestWebapp/");
      driver.manage().window().maximize();
	
    // Write code here that turns the phrase above into concrete actions
   
}

@When("^Validate login$")
public void validate_login()  {
	 driver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
     driver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
     driver.findElement(By.xpath("//*[@type='submit']")).click();
    // Write code here that turns the phrase above into concrete actions
   
}

@Then("^Successful login$")
public void successful_login(){
	 driver.close();

	
    // Write code here that turns the phrase above into concrete actions
  
}


}
