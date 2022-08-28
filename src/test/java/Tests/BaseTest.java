package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest(groups = {"group1", "group2", "group3"})
    public void startTest() {
        System.out.println("Start test-run!");
    }
    @AfterTest(groups = {"group1", "group2", "group3"})
    public void endTest() {
        System.out.println("End test-run!");
    }
    @BeforeClass(groups = {"group1", "group2", "group3"})
    public void classSetUP() {
        System.out.println("Before Class!");
    }

    @AfterClass(groups = {"group1", "group2", "group3"})
    public void classTearDown() {
        System.out.println("After Class!");
    }
}
