package com.Duke.Test;

import com.gargoylesoftware.htmlunit.WebClient;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Created by danield on 24/10/2016.
 */
public class DukeUnitDriver extends HtmlUnitDriver {

    // Added this override method as kept getting exceptions when running HTMLUnitDriver without (http://stackoverflow.com/questions/8745061/is-it-possible-to-ignore-javascript-exceptions-when-working-with-webdriver-html)

    @Override
    protected WebClient modifyWebClient(WebClient client) {
        //currently does nothing, but may be changed in future versions
        WebClient modifiedClient = super.modifyWebClient(client);

        modifiedClient.getOptions().setThrowExceptionOnScriptError(false);
        return modifiedClient;
    }

    public DukeUnitDriver(Capabilities desiredCapabilities) {
        super(desiredCapabilities);
    }


}
