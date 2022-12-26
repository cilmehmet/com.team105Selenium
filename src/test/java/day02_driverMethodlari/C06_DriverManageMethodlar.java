package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_DriverManageMethodlar {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","\\D:\\T-105 Selenium\\com.Team105Selenium\\src\\drivers\\chromedriver.exe\\");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // implicitly wait gittigimiz sayfa acilincaya veya aradigimiz webelement bulununcaya kadar
        // driver'in bekleyebilecegi max sureyi belirler

        // Bu dortlu her test method'unun basina yazilacak
    }
}