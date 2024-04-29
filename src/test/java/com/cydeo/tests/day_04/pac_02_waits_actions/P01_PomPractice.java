package com.cydeo.tests.day_04.pac_02_waits_actions;

import com.cydeo.pages.LibraryLoginPage;
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
public class P01_PomPractice {

    LibraryLoginPage libraryLoginPage;

    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();
    }

    @AfterEach
    void tearDown() {
        BrowserUtils.sleepWithThread(3);
        Driver.closeDriver();
    }


    @Test
    void test1() {
    libraryLoginPage.getEmailInput().fill("email");
    libraryLoginPage.getPasswordInput().fill("password");
    libraryLoginPage.getSignInButton().click();

        System.out.println("libraryLoginPage.getErrorMessage() = " + libraryLoginPage.getErrorMessage().textContent());

        Assertions.assertTrue(libraryLoginPage.getErrorMessage().isVisible());
    }

}
