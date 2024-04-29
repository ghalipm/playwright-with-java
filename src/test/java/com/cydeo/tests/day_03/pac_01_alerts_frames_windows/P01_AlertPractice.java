package com.cydeo.tests.day_03.pac_01_alerts_frames_windows;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.*;

/**
 * @author ghalipm on 4/27/2024
 * @project playwright-with-java
 */
public class P01_AlertPractice {

    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
        browser = playwright.chromium()
                .launch(new BrowserType.LaunchOptions()
                .setHeadless(false)
                .setSlowMo(1000)
        );
    }

    @AfterAll
    static void afterAll() {
        browser.close();
        playwright.close();
    }

    @BeforeEach
    void setUp() {
        page = browser.newPage();
    }

    @AfterEach
    void tearDown() {
        page.close();
    }


    @Test
    void test1() {
        page.navigate("https://practice.cydeo.com/javascript_alerts");

        //we need to use before in that example
        // if we have only one/two option(s)
        // then playwright will handle without this line
        page.onceDialog(Dialog::accept);
        page.locator("button")
                //.nth(0)
                .first()
                .click();

        String str = page.locator("#result").textContent();
        System.out.println("str = " + str);

    }

}