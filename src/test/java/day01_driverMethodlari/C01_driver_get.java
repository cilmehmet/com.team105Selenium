package day01_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driver_get {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","\\D:\\T-105 Selenium\\com.Team105Selenium\\src\\drivers\\chromedriver.exe\\");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(5000);
        driver.close();

        /*
           Selenium jar dosyalarini ve chrome driver ini manuel olarak sisteme
           tanitmis olduk. Eger Firefox veya Safari ile calismamiz gerekse, o zaman da onlarin driver larini indirip
           manuel olarak 8. satirdaki gibi o driverlari tanimlamaliyiz.
            */
    }
}
