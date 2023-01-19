package day10KonuTekrarı;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class tt extends TestBase {
    @Test
    public void name() {

        //1. 'https://the-internet.herokuapp.com/download' adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/download");

        //2. some-file.txt dosyasini indirelim
        driver.findElement(By.xpath("//a[@href='download/some-file.txt']")).click();
        //3. dosyanin basariyla indirilip indirilmedigini test edelim (dosya downloads'a indirilecektir)

//        C:\Users\akfkp\
                String farklıKisim=System.getProperty("user.home");
                String ortakKısım="Download\\some-file.txt";
                String dosyayolu=farklıKisim+ortakKısım;
        Assert.assertTrue(Files.exists(Paths.get(dosyayolu)));

    }
}
