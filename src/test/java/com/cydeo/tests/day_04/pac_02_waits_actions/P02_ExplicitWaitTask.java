package com.cydeo.tests.day_04.pac_02_waits_actions;

import com.cydeo.pages.DynamicPage;
import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author ghalipm on 4/28/2024
 * @project playwright-with-java
 */
public class P02_ExplicitWaitTask {
    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/dynamic_loading/7");
    }

    @AfterEach
    void tearDown() {
        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }

    @Test
    void test1(){
        DynamicPage dynamicPage=new DynamicPage();
        Driver.getPage().waitForFunction("document.title==='Dynamic title'");
        System.out.println(dynamicPage.getAlertMessage().textContent());
        Assertions.assertTrue(dynamicPage.getAlertMessage().textContent().contains("Done"));

    }

}
