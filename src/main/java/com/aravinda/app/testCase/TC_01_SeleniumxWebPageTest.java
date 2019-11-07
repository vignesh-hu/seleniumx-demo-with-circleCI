package com.aravinda.app.testCase;

import com.aravinda.app.script.SeleniumxWebPageTestScript;
import org.openqa.selenium.Platform;
import org.seleniumx.annotations.Script;
import org.seleniumx.annotations.ServerSettings;
import org.seleniumx.util.Set;
import org.seleniumx.util.TestCase;

public class TC_01_SeleniumxWebPageTest extends TestCase {

    @ServerSettings(
            PLATFORM = Platform.LINUX,
            BROWSER = Set.BROWSER.CHROME,
            VERSION = "1",
            SERVER_PORT = "4444",
            SERVER_URL = "http://127.0.0.1",
            BASE_URL = "https://www.seleniumx.com/",
            IMPLICIT_WAIT = 100)
//    @DriverSettings(
//            OS = Set.OS.MAC,
//            WINDOW_SIZE = Set.WINDOW_SIZE.DEFAULT,
//            BROWSER = Set.BROWSER.CHROME,
//            BASE_URL = "https://www.seleniumx.com/",
//            IMPLICIT_WAIT = 100
//    )
    @Script(script = SeleniumxWebPageTestScript.class)
    public void testCase() {
        run();

    }
}
