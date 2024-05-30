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
public class sendmas {
    private WebDriver driver;
    
    public sendmas() {
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
        
    }
    @Test
  public void test() throws Exception {
    driver.get("https://myomealsprep.com/");
    driver.findElement(By.linkText("Contact Us")).click();
    driver.findElement(By.id("contact-fname")).click();
    driver.findElement(By.id("contact-fname")).clear();
    driver.findElement(By.id("contact-fname")).sendKeys("Maria");
    driver.findElement(By.id("contact-lname")).click();
    driver.findElement(By.id("contact-lname")).clear();
    driver.findElement(By.id("contact-lname")).sendKeys("Pooja");
    driver.findElement(By.id("contact-phone")).click();
    driver.findElement(By.id("contact-phone")).clear();
    driver.findElement(By.id("contact-phone")).sendKeys("8256454541");
    driver.findElement(By.id("contact-email")).click();
    driver.findElement(By.id("contact-email")).clear();
    driver.findElement(By.id("contact-email")).sendKeys("test@test");
    driver.findElement(By.id("contact-message")).click();
    driver.findElement(By.id("contact-message")).clear();
    driver.findElement(By.id("contact-message")).sendKeys("H");
    driver.findElement(By.id("contact-email")).click();
    driver.findElement(By.id("contact-email")).click();
    driver.findElement(By.id("contact-email")).clear();
    driver.findElement(By.id("contact-email")).sendKeys("test@gmail.com");
    driver.findElement(By.id("contact-message")).click();
    driver.findElement(By.id("contact-message")).click();
    driver.findElement(By.id("contact-message")).clear();
    driver.findElement(By.id("contact-message")).sendKeys("Hello");
    driver.findElement(By.xpath("//input[@value='Send message']")).click();
  }
}
