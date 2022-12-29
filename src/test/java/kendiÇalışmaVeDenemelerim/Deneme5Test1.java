package kendiÇalışmaVeDenemelerim;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Deneme5Test1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


//    Test Durumu1: Kullanıcıyı Kaydet
//1. Tarayıcıyı başlatın
//2. 'http://automationexercise.com' URL'sine gidin
        driver.get("http://automationexercise.com");
//3. Ana sayfanın başarıyla göründüğünü doğrulayın

//4. 'Kaydol / Giriş Yap' düğmesine tıklayın
        WebElement kayıtButonBas= driver.findElement(By.xpath("//*[@href='/login']"));
        kayıtButonBas.click();
//5. 'Yeni Kullanıcı Kaydı!'nı doğrulayın! görünür

//6. Adı ve e-posta adresini girin
        WebElement email= driver.findElement(By.xpath("//*[@data-qa='signup-name']"));
        email.sendKeys("Akif", Keys.TAB,"Akfkpl3838@gmail.com");
//7. 'Kaydol' düğmesini tıklayın//*[@data-qa='signup-button']
        WebElement kaydolTıkla=driver.findElement(By.xpath("//*[@data-qa='signup-button']"));
        kaydolTıkla.submit();

//8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin göründüğünü doğrulayın

//9. Ayrıntıları doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
        WebElement formDoldur=driver.findElement(By.xpath("//*[@id='id_gender1']"));
        formDoldur.click();
        WebElement pasword=driver.findElement(By.xpath("//*[@type='password']"));
        pasword.sendKeys("123456789");
        WebElement gün=driver.findElement(By.xpath("//*[@id='days']"));
        gün.click();
//10. 'Bültenimize kaydolun!' onay kutusunu seçin.
//11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
//12. Ayrıntıları doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
//13. 'Hesap Oluştur düğmesini' tıklayın
//14. 'HESAP OLUŞTURULDU!' görünür
//15. 'Devam Et' düğmesini tıklayın
//16. "Kullanıcı adı olarak oturum açıldı" ifadesinin görünür olduğunu doğrulayın
//17. 'Hesabı Sil' düğmesini tıklayın
//18. 'HESAP SİLİNDİ!' görünür ve 'Devam Et' düğmesini tıklayın
    }
}
