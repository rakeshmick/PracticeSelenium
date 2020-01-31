package Practice;

import static org.junit.Assert.assertTrue;

import Practice.pages.LandingPage;
import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {

    WebDriver driver;

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test

    public void testNavToCart() {

        LandingPage landingPage = new LandingPage(driver);
        landingPage.navigateToLanding();
        Assert.assertEquals("Rahul Shetty Academy",driver.getTitle());

    }

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/");
    }
    @After
    public void testDown(){
        driver.close();
        driver.quit();
    }
}
