package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE_ACCEPT_BUTTON = "//button[@data-cookiebanner=\"accept_button\"]";
    public static final String XPATH_NEW_ACCOUNT_BUTTON = "//div[contains(@class, \"_6ltg\")]/a";
    public static final String XPATH_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_MOMNTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com/");

        driver.findElement(By.xpath(XPATH_COOKIE_ACCEPT_BUTTON)).click();
        driver.findElement(By.xpath(XPATH_NEW_ACCOUNT_BUTTON)).click();
        WebElement selectDayElement = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(selectDayElement);
        selectDay.selectByValue("18");

        WebElement selectMonthElement = driver.findElement(By.xpath(XPATH_MOMNTH));
        Select selectMonth = new Select(selectMonthElement);
        selectMonth.selectByValue("7");

        WebElement selectYearElement = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(selectYearElement);
        selectYear.selectByValue("1999");
    }
}
