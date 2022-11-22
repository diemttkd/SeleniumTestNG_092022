package KieuDiem.Bai11_AssertMethod;

import KieuDiem.common.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHardAssertions extends BaseTest {
    @Test(priority = 1)
    public void TestAssertEquals() {

        driver.get("https://anhtester.com");

        String expectedTitle = "Anh Tester - Automation Testing";
        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertEquals(actualTitle, expectedTitle );
        //Chỉ trường hợp fail mới show message

        System.out.println("Hello Automation class");
    }

    @Test(priority = 1)
    public void TestAssertTrue() {

        driver.get("https://anhtester.com");

        String actualTitle = driver.getTitle();

        System.out.println("*** Checking For The Title ***");

        Assert.assertTrue(actualTitle.contains("Anh Tester"));

        System.out.println(actualTitle);
    }
}
