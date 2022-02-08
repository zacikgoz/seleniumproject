package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverFactory {

        public static WebDriver getDriver(String browserType) {
            if(browserType.equalsIgnoreCase("Chrome")){
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();
            }else if(browserType.equalsIgnoreCase("Firefox")){
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            }else if(browserType.equalsIgnoreCase("safari")){
                WebDriverManager.safaridriver().setup();
                return new SafariDriver();
            }else{
                System.out.println("Given browser type does not exist/or is not currently supported");
                System.out.println("Driver == null");
                return null;
            }


        }
    }

/*// TASK: NEW METHOD CREATION
// Method name : getDriver
// Static method
// Accepts String arg: browserType
//   - This arg will determine what type of browser is opened
//   - if "chrome" passed --> it will open chrome browser
//   - if "firefox" passed --> it will open firefox browser
// RETURN TYPE: "WebDriver"*/