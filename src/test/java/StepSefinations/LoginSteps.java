package StepSefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
       driver=new ChromeDriver();
       driver.get("https://app.bugbug.io/sign-in/");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
       driver.findElement(By.name("email")).sendKeys("user@gmail.com");
       driver.findElement(By.name("password")).sendKeys("12345678");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
       Thread.sleep(3000);
       WebElement accountdonotexistsmsg=driver.findElement(By.xpath("//p[contains(text(),'Unable to log in with provided credentials.')]"));
       System.out.print(accountdonotexistsmsg.getText());
       if(accountdonotexistsmsg.getText().equals("Unable to log in with provided credentials.")) {
    	   driver.findElement(By.xpath("//a[contains(text(),'Sign up')]")).click();
    	   driver.findElement(By.name("email")).sendKeys("user@gmail.com");
           driver.findElement(By.name("password1")).sendKeys("pEy!mFc123");
           driver.findElement(By.xpath("//button[@type='submit']")).click();
          
       }
     
	}

	@When("click on login button")
	public void click_on_login_button() {
       // driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("User navigated to home page")
	public void user_navigated_to_home_page() {
       driver.close();
	}


}

