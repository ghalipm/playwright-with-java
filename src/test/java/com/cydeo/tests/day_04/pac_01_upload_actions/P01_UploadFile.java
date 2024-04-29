package com.cydeo.tests.day_04.pac_01_upload_actions;

import com.cydeo.utils.BrowserUtils;
import com.cydeo.utils.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

/**
 * @author ghalipm on 4/28/2024
 * @project playwright-with-java
 */

// https://practice.cydeo.com/upload
public class P01_UploadFile {
    @BeforeEach
    void setUp() {
        Driver.getPage().navigate("https://practice.cydeo.com/upload");
    }

    @Test
    void test1() {
        //path of your project
        String pathOfFile = System.getProperty("user.dir") + "/src/test/resources/uploadtest.txt";

        // Driver.getPage().getByTestId("file-upload").setInputFiles(Path.of(pathOfFile));
        Driver.getPage().getByTestId("file-upload").setInputFiles(Paths.get(pathOfFile));
        //.sendKeys(pathOfFile) //selenium
        /*
        for multiple files
        page.getByLabel("Upload files").setInputFiles(new Path[] {Paths.get("pathOfFirstFile"), Paths.get
        ("pathOfSecondFile")});

         */
        BrowserUtils.sleepWithThread(3);
        Driver.getPage().getByTestId("file-submit").click();
        System.out.println(Driver.getPage().locator("//h3").textContent());

        Assertions.assertEquals("File Uploaded!",Driver.getPage().locator("//h3").textContent());

        // to delete the file uploaded:

    }

    @AfterEach
    void tearDown() {
        Driver.closeDriver();
    }
}