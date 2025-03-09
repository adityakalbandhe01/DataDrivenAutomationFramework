package testcases;

import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.readconfig;

public class Baseclass {
    readconfig readconfig =new readconfig();
     String url = getBaseUrl();
     String browser = readconfig.getBrowser();
     
     public static WebDriver driver;
     public static Logger logger;


@BeforeClass
     public void setUP(){

      //launch browser
      switch(browser.toLowerCase())
      {
        case "chrome":
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        break;
        case "msedge":
        WebDriverManager.edgedriver().setup();
        driver = new edgedriver();
        break;
        case "firefox":
        WebDriverManager.firefoxdriver().setup();
        driver = new firefoxdriver();
        break;
      }
      driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS );
     

      logger = LogManager.getLogManager("MyShopProject");
     @AfterClass 
      public void tearDown();
      driver.close();
      driver.quit();
     }

}
