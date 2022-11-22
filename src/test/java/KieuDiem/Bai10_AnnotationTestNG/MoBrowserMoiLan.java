package KieuDiem.Bai10_AnnotationTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class MoBrowserMoiLan {
    WebDriver driver;
    //        @BeforeTest hoặc @BeforeClass
    @BeforeMethod
    public void createBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
    @Test (priority = 2)
    public void testAnhTesterBlog() throws InterruptedException {
        driver.get("https://anhtester.com");
        driver.findElement(By.xpath("//a[normalize-space()='blog']")).click();
        Thread.sleep(2000);
    }

    @Test (priority = 1)
    public void testGoogleSearch() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("anhtester", Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h3[normalize-space()='Anh Tester - Automation Testing']")).click();
        Thread.sleep(2000);
    }
    //    @AfterTest hoặc @AfterClass
    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }
}
