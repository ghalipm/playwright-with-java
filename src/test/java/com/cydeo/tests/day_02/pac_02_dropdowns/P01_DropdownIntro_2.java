package com.cydeo.tests.day_02.pac_02_dropdowns;

import com.cydeo.tests.day_02.pac_01_multipleElements_checkbox_radio.BrowserUtils;
import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P01_DropdownIntro_2 {

    @Test
    void test1() {


        Playwright playwright = Playwright.create();
        /*
       BrowserType chromium = playwright.chromium();
        Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));

         */

        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://practice.cydeo.com/dropdown");

        ElementHandle elementHandle = page.querySelector("#dropdown");

        String selectedOption = page.evaluate("el=>el.selectedOptions[0].text",elementHandle).toString();
        System.out.println("selectedOption = " + selectedOption);


        BrowserUtils.sleepWithThread(3);

        page.close();
        browser.close();
        playwright.close();



    }
}