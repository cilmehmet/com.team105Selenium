package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethodlari {

    public static void main(String[] args) throws InterruptedException {

        // Biz browser'ları olusturdugumuz driver sayesinde  otomate edebiliyoruz.
        // Bunun için her testin başında mutlaka driver objesi olusturacagız.

        System.setProperty("webdriver.chrome.driver","\\D:\\T-105 Selenium\\com.Team105Selenium\\src\\drivers\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        // Acilan sayfanin basliginin amanon icerdigini test edin.

        String expectedKelime = "amazon";
        String actualResult = driver.getTitle();

        if (actualResult.contains(expectedKelime)) {
            System.out.println("Title testi PASSED");
        } else {
            System.out.println("Title amazon içermiyor test, FAILED");
            System.out.println(driver.getTitle());
        }

        // gittiğimiz sayfanın url'sinin https://www.amazon.com/ olduğunu test edin.

        String expectedUrl = "https://www.amazon.com/";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi PASSED");
        } else {
            System.out.println("Url istediğimiz değeri içermiyor test, FAILED");
            System.out.println(driver.getCurrentUrl());
        }

        Thread.sleep(5000);
        driver.close();
    }
}