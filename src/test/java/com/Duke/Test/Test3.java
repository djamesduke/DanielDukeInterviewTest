package com.Duke.Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Created by danield on 22/10/2016.
 //    Test 1
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



    }

}
