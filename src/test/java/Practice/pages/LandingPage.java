package Practice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLanding() {
        long time = System.currentTimeMillis() + 20000;  //to wait for max 5 secs and if not found exit

        driver.getCurrentUrl();

        while (System.currentTimeMillis() < time) {
            List<WebElement> elements = driver.findElements(By.cssSelector(".welcome-section .container-fluid .moving-card-carousel .inner-box h3 a"));

            for (WebElement element : elements
                    ) {
                if (element.getText().equals("PRACTICE PROJECT")) {
                    System.out.println(element.getText());
                    element.click();
                    break;

                } else {
                    System.out.println(element.getText());

                }

            }
        }
    }
}
