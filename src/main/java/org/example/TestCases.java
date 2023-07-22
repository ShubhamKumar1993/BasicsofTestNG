package org.example;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestCases {

    @Test(priority = 2)
    void setup() {
        System.out.println("Started Testng");
    }

    @Test (priority = 1)
    void SecondTest() {
        System.out.println("middle of Testng");
    }

    @Test (priority = 3)
    void FinalTest() {
        System.out.println("Done with Testng");
       
        @Test (priority = 4)
    void FinalTest() {
        System.out.println("again Testng");

    }
}
