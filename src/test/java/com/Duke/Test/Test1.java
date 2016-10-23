package com.Duke.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by danield on 22/10/2016.
 * This is the class used to open the browser, find elements (if required) and make assertions
 * To to: Create method that opens 'String' <website> to stop test methods being so clunky
 *
 */
public class Test1{


    private final WebDriver driver = new HtmlUnitDriver(DesiredCapabilities.chrome());

    //
//    Test 1
//    On the ClearScore website (https://www.clearscore.com), write tests to check that:
//             The “We use cookies” notification is present
//             The “We use cookies” notification can be dismissed
//             The “We use cookies” notification does not reappear after being dismissed
//             The appropriate cookie(s) are set

//    public void initiateWebDriver(){
//
//        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");
//
//        WebDriver driver = new FirefoxDriver();
//
//        driver.close();
//        driver.quit();
//
//    }

    @Test
    public void openClearScoreHomepage(){
        driver.get("http://www.clearscore.com");
        assertThat(driver.getTitle()).startsWith("Free Credit Scores");

        By cookieBar = By.cssSelector("div.cs-cookie.show");
        assertThat(driver.findElement(cookieBar).isDisplayed()).isTrue();
        driver.findElement(By.cssSelector("div.cs-cookie.show div span")).click();
        assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();
    }

//    @Test
//    public void verifyCookieBarIsPresent(){
//
//        openWebpage("http://www.clearscore.com");
//
//        driver.findElement(By.id(""));
//
//    }
//
//    @Test
//    public void verifyThatCookieBarCanBeDismissed(){
//
//        //Open
//
//        WebDriver driver = new FirefoxDriver();
//
//        driver.findElement(By.id(""));
//        Assert.assertTrue("Cookie bar is present",
//                driver);
//    }
//
//    @Test
//    public void verifyThatCookieBarIsNotPresentOnPageReload(){
//
//        WebDriver driver = new FirefoxDriver();
//
//
//    }

    @Test
    public void verifyCorrectCookieSetIfUserAcceptsPolicy(){
    }

    @Test
    public void verifyAcceptCookieIsNotSetIfUserClicksMoreInfoOnCookieBar(){
        /*Call method to go to clearscore, then use same method as verifyThatCookieBarIsNotPresentOnPageReload*/
    }

    @Test
    public void verifyCookieBarDoesNotAppearAfterBeingDismissedOnPageReload(){
    }
}
