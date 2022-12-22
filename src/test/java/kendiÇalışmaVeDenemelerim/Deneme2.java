package kendiÇalışmaVeDenemelerim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1. Yeni bir package olusturalim : day01
//        2. Yeni bir class olusturalim : C03_GetMethods
//        3. Amazon sayfasina gidelim. https://www.amazon.com/
            driver.get("https://www.amazon.com");
//        4. Sayfa basligini(title) yazdirin
        System.out.println("sayfa başlığı  "  + driver.getTitle());
        System.out.println(driver.getTitle());
//        5. Sayfa basliginin “Amazon” icerdigini test edin
        String başlık=driver.getTitle();
        if (başlık.contains("amazon")){
            System.out.println(" Test PASSED");
            }else System.out.println("Test FAİLED");
//        6. Sayfa adresini(url) yazdirin
        System.out.println(driver.getCurrentUrl());
//        7. Sayfa url’inin “amazon” icerdigini test edin.
        String başlık2=driver.getCurrentUrl();
        if (başlık2.contains("amazon")){
            System.out.println(" Test PASSED");
        }else System.out.println("Test FAİLED");
//        8. Sayfa handle degerini yazdirin
       String gatewayvarMı= driver.getWindowHandle();
//        9. Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if(gatewayvarMı.contains("gateway")){
            System.out.println(" Test PASSED");
    }else System.out.println("Test FAİLED");
//        10. Sayfayi kapatin
        driver.close();
    }
}
