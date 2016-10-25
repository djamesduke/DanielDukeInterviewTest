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
    public void shouldSetTheCorrectCookieIfUserAccepts(){
        // Clears browser cookies
        driver.manage().deleteAllCookies();

        // Go's to ClearScore.com and confirms page is correct
        driver.get("http://www.clearscore.com");
        assertThat(driver.getTitle()).startsWith("Free Credit Scores");

        // CookieBar elements
        By cookieBar = By.cssSelector("div.cs-cookie.show");
        By confirmationButton = By.cssSelector("div.cs-cookie.show div span");

        // Asserts that the cookieBar is visible, and is then clicked
        assertThat(driver.findElement(cookieBar).isEnabled()).isTrue();
        driver.findElement(confirmationButton).click();

        // Get the cookies
        driver.manage().getCookies();
        System.out.print(driver.manage().getCookies());

        Cookie csAcceptCookie = driver.manage().getCookieNamed("CS_ACCEPT_COOKIES");

        assertThat(csAcceptCookie).isNotNull();

    }
}
