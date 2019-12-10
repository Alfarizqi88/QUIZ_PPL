/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 *
 * @author Abiyyuoo
 */
public class selenium_class {
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver","D:\\Program\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "https://demo.1crmcloud.com/login.php";

        driver.get(baseUrl);

        driver.findElement(By.id("login_user")).sendKeys("admin");
        driver.findElement(By.id("login_pass")).sendKeys("admin");
        driver.findElement(By.id("login_button")).click();
//        WebElement w = driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=DetailView&record=1']"));
//        w.click();
        Thread.sleep(10000);
        driver.findElement(By.className("default-avatar")).click();

//        driver.close();
    }
    
}
