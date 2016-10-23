package com.Duke.Test;

import org.apache.http.impl.execchain.MainClientExec;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by danield on 22/10/2016.
 * This is the class used to open the browser, find elements (if required) and make assertions
 * To to: Create method that opens 'String' <website> to stop test methods being so clunky
 *
 */
public class Test1{
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

    public String openWebpage(String webpage){

        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get(webpage);

        driver.close();
        driver.quit();

        return webpage;
    }

    @Test
    public void openClearScoreHomepage(){

        System.setProperty("webdriver.firefox.marionette", "./geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        openWebpage("http://www.clearscore.com");
        Assert.assertTrue("Title should start with Free Credit Scores",
                driver.getTitle().startsWith("Free Credit Scores"));

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

        WebDriver driver = new FirefoxDriver();

        /*Call method to go to clearscore, then use same method as verifyThatCookieBarIsNotPresentOnPageReload*/

        driver.getCurrentUrl().contains("https://www.clearscore.com/privacy-policy/");
        Assert.assertThat(driver.getCurrentUrl().("https://www.clearscore.com/privacy-policy/"));

    }

    @Test
    public void verifyCookieBarDoesNotAppearAfterBeingDismissedOnPageReload(){

    }
}
