package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {


    public static void main(String[] args) {

        //1. Setting up the webdriver manager
        // We create our "Browser Driver"
        WebDriverManager.chromedriver().setup();

        //2. Create instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        //3. Test driver whether it works as expected
        driver.get("https://facebook.com");




    }
}
