package kendiÇalışmaVeDenemelerim;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class path2 extends TestBase {


    @Test
    public void name() {

//        Class : FileDownloadTest Method : downloadTestExist
//        https://testcenter.techproeducation.com/index.php?page=file-download   adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
//        b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitFor(3);

        //        Dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyayolu=System.getProperty("user.home");
        System.out.println("dosyayolu = " + dosyayolu);
        String concat=dosyayolu+"\\Downloads\\b10 all test cases, code.docx";
        System.out.println("concat = " + concat);
        Boolean kontrol= Files.exists(Paths.get(concat));
        Assert.assertTrue(kontrol);




    }
}
