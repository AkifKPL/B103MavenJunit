package day14;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;
import java.io.File;
import java.io.IOException;
public class C01_Screenshot1 extends TestBase {
    @Test
    public void fullPageScreenshotTest() throws IOException {
//        Techpro education a git ve Sayfanin goruntusunu al
        driver.get("https://www.techproeducation.com");
//        1. Ekran goruntusunu getScreenshotAs metotu ile alip File olarak olusturalim
        File goruntu = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        2. Almis oldugum ekran goruntusunu belirledigim bir PATH e kaydet.dir= directory=dosya
        String path = System.getProperty("user.dir")+"/test-output/EkranGoruntuleri/image.png";
        File hedef = new File(path);
//        3. Goruntum ile dosyami birlestirip kaydet
        FileUtils.copyFile(goruntu,hedef);

//        ALTERNATIF OLARAK TUM BU ADIMLARI TEK SEFERDE DEGISKEN KULLANMADAN YAPABILIRIM
//        FileUtils.copyFile(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE),//goruntu
//                new File(System.getProperty("user.dir")+"/test-output/EkranGoruntuleri/image.png"));//path

//        -“QA” aramasi yap
//        Acilen sayfanin metnini test et ve ekran goruntusu al: “Search Results for: qa”
    }
}