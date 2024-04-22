package com.cydeo.tests.day_02.pac_02_dropdowns;

import com.cydeo.tests.day_02.pac_01_multipleElements_checkbox_radio.BrowserUtils;
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class P01_DropdownIntro {
    @Test
    void test1() {

        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            Page page = browser.newPage();
            page.navigate("https://practice.cydeo.com/dropdown");


            page.selectOption("#year", new SelectOption().setValue("1987"));
            page.selectOption("#month", new SelectOption().setLabel("January"));
            page.selectOption("#day", new SelectOption().setIndex(2));


            String actualYear = page.evaluate("document.querySelector('#year').value").toString();
            String actualMonth = page.evaluate("document.querySelector('#month').value").toString();
            String actualDay = page.evaluate("document.querySelector('#day').value").toString();

            System.out.println("Selected year: " + actualYear);
            System.out.println("Selected month: " + actualMonth);
            System.out.println("Selected day: " + actualDay);

            page.close();
            browser.close();
        } catch (PlaywrightException e) {
            e.printStackTrace();
        }
    }
}