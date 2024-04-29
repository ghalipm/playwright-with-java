package com.cydeo.tests.day_01.pac_01_playwright_intro;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P01_PlaywrightTest {

    public static void main(String[] args) throws InterruptedException {

        Playwright playwright=Playwright.create();
//        BrowserType chromium = playwright.chromium();
//        Browser browser = chromium.launch(
//                //if you want to see browser pass this line
//                new BrowserType.LaunchOptions().setHeadless(false));
//        Page page = browser.newPage();

        // msedge browser:
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://www.msn.com/");
        Thread.sleep(3000);


        page.close();
        browser.close();
        playwright.close();


    }
}
