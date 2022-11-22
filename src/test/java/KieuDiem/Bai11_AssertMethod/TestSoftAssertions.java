package KieuDiem.Bai11_AssertMethod;

import KieuDiem.Bai10_AnnotationTestNG.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSoftAssertions extends BaseTest {
    @Test
    public void testSoftAssert(){
        driver.get("https://rise.fairsketch.com/signin");

        String headerSignIn = driver.findElement(By.xpath("//div[@class = 'card-header text-center']/h2")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(headerSignIn, "Sign In", "Header Sign In page is not valid");

        driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();

        WebElement menuClient = driver.findElement(By.xpath("//span[normalize-space() = 'Clients']"));

        menuClient.click();

        WebElement headerTotalClient = driver.findElement(By.xpath("//span[normalize-space() = 'Clients']"));

        softAssert.assertTrue(headerTotalClient.isEnabled(), "Header Total Client is not turn-on");
        softAssert.assertEquals(headerTotalClient.getText(),"Selenium", "Content of header Total Client is not valid");

        //Cuối cùng phải sử dụng assertAll để chốt xác nhận các Assert trên
        softAssert.assertAll();
    }

}
