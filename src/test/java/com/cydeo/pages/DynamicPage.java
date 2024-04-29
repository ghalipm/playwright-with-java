package com.cydeo.pages;

import com.cydeo.utils.Driver;
import com.microsoft.playwright.Locator;
import lombok.Getter;

/**
 * @author ghalipm on 4/28/2024
 * @project playwright-with-java
 */

@Getter
public class DynamicPage {
    private final Locator alertMessage;

    public DynamicPage(){
        this.alertMessage= Driver.getPage().getByTestId("alert");
    }
}
