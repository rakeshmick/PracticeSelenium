package Practice.practice.testng;

import Practice.pages.LandingPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNgTestClass extends BaseTest{




    @Test

    public void testNavToCart() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigateToLanding();
        Assert.assertEquals("Rahul Shetty Academy",driver.getTitle());

    }

   /* @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/");
    }*/
    @AfterMethod
    public void testDown(){
       
        driver.quit();
    }
}
