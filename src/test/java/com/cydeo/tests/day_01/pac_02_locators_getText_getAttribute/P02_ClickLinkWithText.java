package com.cydeo.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P02_ClickLinkWithText {

    @Test
    void test() {
        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");

        // page.waitForTimeout(3000);
        // page.setViewportSize(1920, 1080);
        //page.click("text=Autocomplete");
        page.click("//a[@href='/autocomplete']");
        page.waitForTimeout(1000);

        System.out.println(page.title());

        page.close();
        browser.close();
        playwright.close();

    }
}
