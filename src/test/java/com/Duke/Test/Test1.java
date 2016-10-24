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
 *
 */
public class Test1{


    private final WebDriver driver = new HtmlUnitDriver(DesiredCapabilities.chrome());


//    Test 1
//    On the ClearScore website (https://www.clearscore.com), write tests to check that:
//             The “We use cookies” notification is present
//             The “We use cookies” notification can be dismissed
//             The “We use cookies” notification does not reappear after being dismissed
//             The appropriate cookie(s) are set


    @Test
    public void openClearScoreHomepageAndVerifyTheCookieBarCanBeClickedAndIsThenDismissed(){
        driver.get("http://www.clearscore.com");
        assertThat(driver.getTitle()).startsWith("Free Credit Scores");


        By cookieBar = By.cssSelector("div.cs-cookie.show");

        assertThat(driver.findElement(cookieBar).isDisplayed()).isTrue();
        driver.findElement(By.cssSelector("div.cs-cookie.show div span")).click();
        assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();
    }

//    The below test was added to check that the HTMLunitDriver was working correctly. I did get another error code, but different
//    from that received when running the above test
//
//    @Test
//    public void openRightmoveHomepage(){
//        driver.get("http://www.rightmove.co.uk");
//        assertThat(driver.getTitle()).startsWith("UK's number one property website for properties for sale and to rent");
//
//
//        By cookieBar = By.id("cookiemodalbar");
//
//        assertThat(driver.findElement(cookieBar).isDisplayed()).isTrue();
//        driver.findElement(By.id("cookiemodalbar-button-text")).click();
//        assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();
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
