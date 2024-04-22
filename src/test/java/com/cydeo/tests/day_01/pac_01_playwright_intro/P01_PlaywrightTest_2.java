package com.cydeo.tests.day_01.pac_01_playwright_intro;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P01_PlaywrightTest_2 {
    public static void main(String[] args) throws InterruptedException {
        Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false))
                .newPage().navigate("http://www.google.com");
    }
}
