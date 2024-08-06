package com.spearsoftech.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseFactory {

    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public static WebDriver initializeDriver() {
        tlDriver.set(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

        return getDriver();
    }

    @AfterMethod
    public static void closeBrowser() {
        if (getDriver() != null)
            getDriver().quit();
    }

    public static void navigateToURL(String url) {
        getDriver().navigate().to(url);
    }

    public static synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
}
