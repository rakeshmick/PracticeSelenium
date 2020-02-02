package Practice.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    public WebDriver driver;
    public  String baseUrl;

    @BeforeTest
    public void before(ITestContext context) {

        String browsername = (String) context.getCurrentXmlTest().getParameter("browser");
        baseUrl =  	(String) context.getCurrentXmlTest().getParameter("baseUrl");
        switch (browsername) {

            case "Firefox": {
                if(!System.getProperty("os.name").equals("Mac OS X")) {
                    System.setProperty("webdriver.gecko.driver", "/Users/rakeshprabhakaran/eclipse-workspace/ProgrammingBasics/src/Jars/geckodriver");
                }
                DesiredCapabilities capabilities=DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                driver = new FirefoxDriver(capabilities);
                break;
            }


            case "Chrome": {
                if(!System.getProperty("os.name").equals("Mac OS X")) {
                    System.setProperty("webdriver.chrome.driver", "/Users/rakeshprabhakaran/eclipse-workspace/DomainsTest/Jars/chromedriver");
                }
                driver =  new ChromeDriver();
            }
        }

        driver.get(baseUrl);
        System.out.println("Opened : "+driver.getCurrentUrl());

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
