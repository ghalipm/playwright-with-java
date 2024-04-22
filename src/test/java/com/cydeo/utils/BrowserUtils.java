package com.cydeo.utils;

import com.microsoft.playwright.Page;

/**
 * @author ghalipm on 4/21/2024
 * @project playwright-with-java
 */
public class BrowserUtils {

    public  static  void sleepWithThread(int seconds){


        try {
            Thread.sleep(seconds*1000);

        }catch (Exception e){

        }

    }

    public static void sleepWithPage(Page page, int seconds){
        page.waitForTimeout(seconds*1000);

    }



}
