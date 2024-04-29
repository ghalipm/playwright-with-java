package com.cydeo.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Playwright;

/**
 * @author ghalipm on 4/28/2024
 * @project playwright-with-java
 */
public class BrowserFactory {

    public  static Browser getBrowser(String browserFromConfig, Playwright playwright) {
        Browser browser=null;

        switch (browserFromConfig){
            case "chrome":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                break;

            case  "firefox":
                browser = playwright.firefox().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));

                break;

            case  "msedge":
                browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setChannel("msedge")
                        .setHeadless(false));

                break;
        }

        return browser;
    }
}
