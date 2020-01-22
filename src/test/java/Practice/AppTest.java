package Practice;

import static org.junit.Assert.assertTrue;

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

        driver.getCurrentUrl();
        while (true) {
            List<WebElement> elements = driver.findElements(By.cssSelector(".welcome-section .container-fluid .moving-card-carousel .inner-box h3 a"));

            for (WebElement element : elements
                    ) {
                if (element.getText().equals("PRACTICE PROJECT"))
                { element.click();
                    System.out.println(element.getText());
                }
                else
                {System.out.println(element.getText());

                }

            }
        }

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
