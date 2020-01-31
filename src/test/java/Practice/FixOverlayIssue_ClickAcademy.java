package Practice;

import static org.junit.Assert.assertTrue;

import Practice.pages.LandingPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class FixOverlayIssue_ClickAcademy {

    WebDriver driver;

  

    @Test

    public void testNavToCart() throws InterruptedException {
    	WebElement element = driver.findElement(By.cssSelector(".img-responsive"));
    	         ((JavascriptExecutor) driver).executeScript("arguments[0].style.visibility='hidden'", element);
    		
       driver.findElement(By.cssSelector(".interview-question #tablist1-tab2")).click();
       System.out.println(driver.getCurrentUrl());
       Thread.sleep(3000);
    }

    @Before
    public void setUp() {
    	 driver = new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");
        
    }
    @After
    public void testDown(){
        driver.close();
        driver.quit();
    }
}
