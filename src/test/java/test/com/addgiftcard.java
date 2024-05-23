/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package test.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author User
 */
public class addgiftcard {
        private WebDriver driver;

    public addgiftcard() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        System.setProperty("webdriver.chrome.driver", "c:\\data\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("disable-extensions");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
        driver.close();
    }
     @Test
  public void test() throws Exception {
    driver.get("https://myomealsprep.com/");
    driver.findElement(By.xpath("//header[@id='masthead']/div/div[2]/div/div/div[3]/div/div/div/a/span/span")).click();
    driver.findElement(By.xpath("//button[@type='button']")).click();
    driver.findElement(By.xpath("//div[@id='product-18702']/div/div[2]/form/div[2]/button[2]/span")).click();
    driver.findElement(By.id("ywgc-recipient-name")).click();
    driver.findElement(By.id("ywgc-recipient-name")).clear();
    driver.findElement(By.id("ywgc-recipient-name")).sendKeys("Maria");
    driver.findElement(By.id("ywgc-recipient-email")).click();
    driver.findElement(By.id("ywgc-recipient-email")).clear();
    driver.findElement(By.id("ywgc-recipient-email")).sendKeys("test@gmail.com");
    driver.findElement(By.id("ywgc-edit-message")).click();
    driver.findElement(By.id("ywgc-edit-message")).clear();
    driver.findElement(By.id("ywgc-edit-message")).sendKeys("Hello");
    driver.findElement(By.id("ywgc-sender-name")).click();
    driver.findElement(By.id("ywgc-sender-name")).clear();
    driver.findElement(By.id("ywgc-sender-name")).sendKeys("Pooja");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.xpath("//a[@id='hfe-menu-cart__toggle_button']/span[2]")).click();
  }
}
