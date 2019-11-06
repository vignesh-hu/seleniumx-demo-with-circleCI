package com.aravinda.app.script;

import com.aravinda.app.page.SeleniumxFrontPage;
import org.seleniumx.annotations.Page;
import org.seleniumx.util.Script;
import org.testng.Assert;

public class SeleniumxWebPageTestScript extends Script {
    @Page(page = {SeleniumxFrontPage.class})
    public void script() {
        execute("SeleniumxFrontPage","verifyPageLoaded");
        execute("SeleniumxFrontPage","verifyPageUrl");
        log.info(get("SeleniumxFrontPage","getTitle"));
        Assert.assertEquals("SeleniumX | Test Automation Framework",get("SeleniumxFrontPage","getTitle"));

    }
}
