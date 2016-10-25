package com.Duke.Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Created by danield on 22/10/2016.
//
//    Test 1
//    On the ClearScore website (https://www.clearscore.com), write tests to check that:
//             The “We use cookies” notification is present
//             The “We use cookies” notification can be dismissed
//             The “We use cookies” notification does not reappear after being dismissed
//             The appropriate cookie(s) are set
*/
public class Test1 {

    private final WebDriver driver = new DukeUnitDriver(DesiredCapabilities.chrome());


    @Test
    public void shouldSeeCookieBarAndItCanBeClickedAndIsThenDismissed() {
        // Clears browser cookies
        driver.manage().deleteAllCookies();

        // Go's to ClearScore.com and confirms page is correct
        driver.get("http://www.clearscore.com");
        assertThat(driver.getTitle()).startsWith("Free Credit Scores");

        // CookieBar elements
        By cookieBar = By.cssSelector("div.cs-cookie.show");
        By confirmationButton = By.cssSelector("div.cs-cookie.show div span");

        // Asserts that the cookieBar is visible, and then dismisses when accept is clicked
        assertThat(driver.findElement(cookieBar).isEnabled()).isTrue();
        driver.findElement(confirmationButton).click();
        assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();

        // This test fails. I also tried to locate the confirmationButton by pin pointing a click at the exact location. That did work, but it keeps failing on the last assert
        // I think this is because the website JS is causing the test issues

    }


    @Test
    public void openRightmoveomepageAndVerifyTheCookieBarCanBeClickedAndIsThenDismissed(){
        // Clears browser cookies
        driver.manage().deleteAllCookies();

        driver.get("http://www.rightmove.co.uk");
        assertThat(driver.getTitle()).startsWith("UK's number one property website for properties for sale and to rent");

        By cookieBar = By.cssSelector("#cookiemodalbar");

        assertThat(driver.findElement(cookieBar).isDisplayed()).isTrue();
        driver.findElement(By.cssSelector("#cookiemodalbar-button-text")).click();
        //assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();
    }

//    @Test
//    public void testingGoogle(){
//        driver.get("http://www.google.co.uk");
//        assertThat(driver.getTitle()).startsWith("Google");
//
//        By cookieBar = By.id("cnsh");
//
//        assertThat(driver.findElement(cookieBar).isDisplayed()).isTrue();
//
//        driver.findElement(By.cssSelector("#cnsh > div > div._tLg > div._sLg > div > div")).click();
//        assertThat(driver.findElement(cookieBar).isDisplayed()).isFalse();
//    }

    @Test
    public void shouldSetTheCorrectCookieIfUserAccepts(){

        driver.get("http://www.clearscore.com");
        assertThat(driver.getTitle()).startsWith("Free Credit Scores");

        driver.manage().getCookies();
        System.out.print(driver.manage().getCookies());

        Cookie csAcceptCookie = driver.manage().getCookieNamed("CS_ACCEPT_COOKIES");

        assertThat(csAcceptCookie).isNotNull();

        driver.quit();

    }
}
