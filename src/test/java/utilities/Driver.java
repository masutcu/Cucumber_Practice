package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {



    public static WebDriver driver;


    public static WebDriver getDriver(){

        if(driver==null) {

            switch (ConfigReader.getProperty("browser")){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;

                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                    break;

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "chrome-headless":
                    ChromeOptions options=new ChromeOptions();
                    options.addArguments("--headless");
                    options.addArguments("--remote-allow-origins=*");
                    options.addArguments("--window-size=1920,1080");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(options);
                    break;

                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }
        return driver;
    }




    public static void closeDriver(){

        if(driver!=null) {
            driver.close();
            driver=null;
        }
    }
}
