package KieuDiem.Bai10_AnnotationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginCMS extends BaseTest {

    @BeforeMethod
    public void beforeMethodChild(){
        System.out.println("");
    }

    @Test(priority = 1)
    public void activeEcommerce() throws InterruptedException {
        System.out.println("Run activeEcommerce");
        driver.get("https://demo.activeitzone.com/ecommerce/login");
        driver.findElement(By.xpath("//button[normalize-space()='Copy']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(2000);
    }
    @AfterMethod
    public void AfterMethodChild(){
        System.out.println("");
    }

}
