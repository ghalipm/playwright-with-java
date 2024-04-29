package com.cydeo.utils;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

/**
 * @author ghalipm on 4/27/2024
 * @project playwright-with-java
 */
public class Driver {

    static private Playwright playwright;

    static private Browser browser;

    static private Page page;

    private Driver() {
    }

    public  static Page getPage(){
        //this line for deciding the browser type
        String browserFromConfig=ConfigurationReader.getProperty("browser");

        if (page==null){
            playwright=Playwright.create();
            playwright.selectors().setTestIdAttribute("id"); //data-testid
            switch (browserFromConfig.toLowerCase()){
                case "chrome":

                    BrowserType chromium = playwright.chromium();
                    browser=chromium.launch(new BrowserType.LaunchOptions().setHeadless(false));
                    page= browser.newPage();
                    break;


                case "firefox":
                    BrowserType firefox = playwright.firefox();
                    browser=firefox.launch(new BrowserType.LaunchOptions().setHeadless(false));
                    page= browser.newPage();
                    break;

                case "msedge":
                    Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setChannel("msedge").setHeadless(false));
                    page= browser.newPage();

            }

        }

        return page;

    }


    public static void closeDriver(){

        if (page!=null){
            page.close();
            page=null;}
        if(browser!=null){
            browser.close();
            browser=null;}
        if(playwright!=null){
            playwright.close();
            playwright=null;
        }

    }


}

