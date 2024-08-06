package com.spearsoftech.pages;

import com.github.javafaker.Faker;
import net.jodah.failsafe.RetryPolicy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BasePage {

    private final WebDriver driver;
    static Faker faker = new Faker();
    public static String email = faker.internet().emailAddress();
    public static String pwd = "Password@1234";

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriverWait explicitWait(int timeOut) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        return wait;
    }

    public void selectDropdownValue(WebElement parent, String value) {
        Select select = new Select(parent);
        select.selectByVisibleText(value);
    }

    public String getRandomMonth() {

        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        Random random = new Random();
        int randomIndex = random.nextInt(months.size());
        String randomMonth = months.get(randomIndex);

        return randomMonth;
    }

    public static RetryPolicy<Object> createRetryPolicy(int retries, int delayTime) {
        return new RetryPolicy<>()
                .handle(Exception.class) // Retry on any exception (customize as needed)
                .withMaxRetries(retries)
                .withDelay(Duration.ofSeconds(delayTime)); // Delay between retries
    }
}
