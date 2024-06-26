package com.cydeo.tests.day_03.pac_02_using_utllity_methods;

import com.cydeo.utils.CRMUtils;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.*;

/**
 * @author ghalipm on 4/27/2024
 * @project playwright-with-java
 */
public class P01_CRMLoginTask {


    static private Playwright playwright;

    static private Browser browser;

    private Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
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
        page = browser.newContext().newPage();
        page.navigate("https://login1.nextbasecrm.com/");
    }

    @AfterEach
    void tearDown() {
        page.close();
    }


    @Test
    void test1() {

        CRMUtils.login(page);


    }
}
