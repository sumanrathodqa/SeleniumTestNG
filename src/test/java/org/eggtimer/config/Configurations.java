package org.eggtimer.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Configurations {
    String driverPath = "/Users/sumanarya/.m2/repository/chromedriver";
    public static WebDriver driver;

    @BeforeMethod
    public void chromeSetup() {
        System.setProperty("webdriver.chrome.driver", driverPath);
        Reporter.log("=========== Browser session starting ===========", true);
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://e.ggtimer.com/");
    }

    @AfterMethod
    public void teardown() {
        driver.close();
        driver.quit();
        Reporter.log("=========== Browser session ended ===========", true);
    }

}
