package com.aravinda.app.testCase;

import com.aravinda.app.script.SeleniumxWebPageTestScript;
import org.seleniumx.annotations.DriverSettings;
import org.seleniumx.annotations.Script;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC1_SeleniumxWebPageTest extends TestCase {

    //    @ServerSettings(PLATFORM = Platform.MAC,
//            BROWSER = Set.BROWSER.CHROME,
//            VERSION = "1.0",
//            SERVER_PORT = "4444",
//            SERVER_URL = "http://localhost",
//            BASE_URL = "http://localhost:8080/address-formatter-0.0.1-SNAPSHOT",
//            IMPLICIT_WAIT = 10)
    @DriverSettings(
            OS = Set.OS.MAC,
            WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
            BROWSER = Set.BROWSER.CHROME,
            BASE_URL = "https://www.seleniumx.com/",
            IMPLICIT_WAIT = 10000
    )
    @Script(script = SeleniumxWebPageTestScript.class)
    public void testCase() {
        run();

    }
}
