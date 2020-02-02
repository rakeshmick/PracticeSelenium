package Practice.practice.testng.ekart.tests;

import Practice.practice.testng.BaseTest;
import Practice.practice.testng.ekart.pages.EkartHomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
// to run this test , execute ekartTestTestNg.xml
    @Test
    public void testForLogo(){
        // this test jsut verifies the logo in home page
        EkartHomePage ekartHomePage = new EkartHomePage(driver);
        WebElement logo = driver.findElement(ekartHomePage.getBrandLogoInHomePage());
        Assert.assertEquals( logo.getText(),"GREENKART");
    }
}
