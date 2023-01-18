package kendiÇalışmaVeDenemelerim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Ödev1 extends TestBase {
    @Test
    public void test1(){

//        1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
//        2- Hover over Me First" kutusunun ustune gelin
        WebElement kutu1=driver.findElement(By.xpath("//button[@class='dropbtn']"));
        Actions actions=new Actions(driver);
        actions.moveToElement(kutu1).perform();
        waitFor(3);
//        Link 1" e tiklayin
        driver.findElement(By.xpath("(//a[@class='list-alert'])[1]")).click();
//        Popup mesajini yazdirin
        String alertYazı= driver.switchTo().alert().getText();
        System.out.println("alertYazı = " + alertYazı);
        waitFor(2);
//        Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();
//        “Click and hold" kutusuna basili tutun
        WebElement basılıTut=driver.findElement(By.id("click-box"));
        actions.clickAndHold(basılıTut).perform();
        waitFor(2);
//        7-“Click and hold" kutusunda cikan yaziyi yazdirin
        String kutuYazdır=driver.findElement(By.id("click-box")).getText();
        System.out.println("kutuYazdır = " + kutuYazdır);

//        8- “Double click me" butonunu cift tiklayin
        WebElement ciftTıkla=driver.findElement(By.tagName("h2"));
        actions.doubleClick(ciftTıkla).perform();
        waitFor(2);



    }


}
