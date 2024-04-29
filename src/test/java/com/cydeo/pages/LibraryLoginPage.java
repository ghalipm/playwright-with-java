package com.cydeo.pages;

import com.cydeo.utils.Driver;
import com.microsoft.playwright.Locator;
import lombok.Getter;

/**
 * @author ghalipm on 4/28/2024
 * @project playwright-with-java
 */

@Getter
public class LibraryLoginPage {

    private final Locator emailInput;
    private final Locator passwordInput;
    private final Locator signInButton;
    private final Locator errorMessage;

    // ChroPath is also useful for working fast
    //initialize could be done also above directly, not using constructor
    public LibraryLoginPage() {
        this.emailInput= Driver.getPage().locator("#inputEmail");
        this.passwordInput= Driver.getPage().locator("#inputPassword");
        this.signInButton= Driver.getPage().locator("//button[contains(text(), 'Sign in')]");
        this.errorMessage= Driver.getPage().locator("div[role='alert']");
    }

    public void login(String email, String password){
        emailInput.fill(email);
        passwordInput.fill(password);
        signInButton.click();

    }

}
