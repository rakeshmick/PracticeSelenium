package Practice.practice.testng.ekart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EkartHomePage {

    WebDriver driver;
    String url = "https://rahulshettyacademy.com/seleniumPractise/#/";
    By brandLogoInHomePage = By.cssSelector("div.brand.greenLogo");

    public EkartHomePage(WebDriver driver) {
        this.driver = driver;

    }

    public By getBrandLogoInHomePage() {
        return brandLogoInHomePage;
    }
}
