package com.Duke.Test;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.Element;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by danield on 22/10/2016.
 //
 //    Test 3
 //    On the ClearScore savings calculator (https://www.clearscore.com/savings-calculator/), write tests to check that:
 //             When updating your current score to 50, and score goal to 680 that –
 //             Your current score interest rate, costs, and cards available are: 36.5%, £849, and 22
 //             Your score goal interest rate, costs, and cards available are: 25%, £520, and 241
 //             Your potential savings are £384
 */
public class Test3 {

    private final WebDriver driver = new DukeUnitDriver(DesiredCapabilities.chrome());

    @Test
    public void shouldShowCorrespondingInterestRateAndCostsAndCards(){

        // Go to the ClearScore site and verify it's the correct page
        driver.get("https://www.clearscore.com/savings-calculator/");
        assertThat(driver.getTitle().startsWith("Free Credit Scores"));

        // Create variables for the elements that will be used for the test
        By currentScoreSliderValue = By.cssSelector("");
        By currentScoreInterestRate = By.cssSelector("");
        By currentScoreCosts = By.cssSelector("");
        By currentScoreCardsAvailable = By.cssSelector("");

        By scoreGoalSliderValue = By.cssSelector("");
        By scoreGoalInterestRate = By.cssSelector("");
        By scoreGoalCosts = By.cssSelector("");
        By scoreGoalCardsAvailable = By.cssSelector("");

        By potentialSavings = By.cssSelector("");


        // Find first slider element, change it's value to 60
        // Find second slider element, change it's value to 680
        // Assert that the relevant values are set to the correct values

        // The above is the outline of how I would approach this test.
        // I spent time speaking to a couple of devs and looking on Stackoverflow for advice, but couldn't quite figure out what needed to be done.
        // I've used the By.cssSelector just as a filler, I'm not sure it's the best way to find the elements in this test
        // Be interested in seeing how the test could be written!

    }

}
