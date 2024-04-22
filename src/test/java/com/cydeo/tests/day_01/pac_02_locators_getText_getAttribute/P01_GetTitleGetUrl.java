package com.cydeo.tests.day_01.pac_02_locators_getText_getAttribute;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P01_GetTitleGetUrl {

//command+N
//Alt+ insert



    @Test
    void test1() {

        Playwright playwright = Playwright.create();
        BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(
                //if you want to see browser pass this line
                new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://practice.cydeo.com/");

        System.out.println(page.url());

        Assertions.assertTrue(page.url().contains("cydeo"));

        System.out.println(page.title());

        Assertions.assertEquals("Practice",page.title());

        page.waitForTimeout(2000);

        page.close();
        browser.close();
        playwright.close();


    }
}
