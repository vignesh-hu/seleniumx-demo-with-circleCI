package com.aravinda.app.testCase;

import com.aravinda.app.script.SeleniumxWebPageTestScript;
import org.openqa.selenium.Platform;
import org.seleniumx.annotations.Script;
import org.seleniumx.annotations.ServerSettings;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC_01_SeleniumxWebPageTest extends TestCase {

    @ServerSettings(PLATFORM = Platform.MAC,
            BROWSER = Set.BROWSER.CHROME,
            VERSION = "1.0",
            SERVER_PORT = "4444",
            SERVER_URL = "http://localhost",
            BASE_URL = "http://localhost:8080/address-formatter-0.0.1-SNAPSHOT",
            IMPLICIT_WAIT = 10)
    @Script(script = SeleniumxWebPageTestScript.class)
    public void testCase() {
        run();

    }
}
