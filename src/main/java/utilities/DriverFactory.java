package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

        public static WebDriver driverSetup(String browser) {
           String os = System.getProperty("os.name");

            if(os.toLowerCase().contains("windows")){

            if ("firefox".equals(browser.toLowerCase())) {
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
                return new FirefoxDriver();
            } else if ("chrome".equals(browser.toLowerCase())) {
                System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
                return new ChromeDriver();
            } else {
                System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");
                return new FirefoxDriver();
            }

        }else if(os.toLowerCase().contains("linux")){
                if ("firefox".equals(browser.toLowerCase())) {
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriverlinux");
                    return new FirefoxDriver();
                } else if ("chrome".equals(browser.toLowerCase())) {
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverlinux");
                    return new ChromeDriver();
                } else {
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriverlinux");
                    return new FirefoxDriver();
                }
            }else if(os.toLowerCase().contains("mac")){
                if ("firefox".equals(browser.toLowerCase())) {
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriverMac");
                    return new FirefoxDriver();
                } else if ("chrome".equals(browser.toLowerCase())) {
                    System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriverMac");
                    return new ChromeDriver();
                } else {
                    System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriverMac");
                    return new FirefoxDriver();
                }

            }else{
                System.out.println("Cant detect operating system, pls try other system");
                return null;
            }





}}

