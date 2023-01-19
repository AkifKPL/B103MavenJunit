package day10KonuTekrarı;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class soru5 extends TestBase {
//    ACTIONS CLASS'ı NEDİR? HANGİ METHODLAR İLE  NASIL KULLANILIR?..

//   Actions classını kullanarak klavye ve mouse ile yapabileciğiz tüm işlemleri otomosyonda da  yapmamızı sağlamaktayız..!!
//   Bu classa ait metdodlar kısaca aşağıdaki gibidir....

//       actions.doubleClick () :   WebElement'e çift tıklama yapar
//       actions.clickAndHold () :  Uzerinde click yapili olarak bekler
//       actions .dragAndDrop () :  Bir noktadan diğerine sürükler ve bırakır
//       actions.moveToElement () : Mouse'u istedigimiz WebElement'in uzerinde tutar
//       actions.contextClick ():   Mouse ile istedigimiz WebElement'e sag tiklama yapar.
//       actions.sendKeys() :       Öğeye bir dizi anahtar gönderir
//       actions.keyDown () :       Klavyede tuşa basma işlemi gerçekleştirir
//       actions.keyUp () :         Klavyede tuşu serbest bırakma işlemi gerçekleştirir
//
//
//        !!!!Actions classını kullanmak için üç aşama vardır.

//     1.Action classından obje üretiriz.
//     (Actions actions= new Actions(driver);)
//     2.actions objesi ile kullanacağımız web elementi locate ederiz...
//     3.istediğimiz methodları action objesi ile kullanırız.
//     actions.doubleClick(element ismi).perform;


    @Test
    public void name() {


//        Create a class: Action5
//        Create a method keyboardActions
//        Google a gidin https://www.google.com
        driver.get("https://www.google.com");
        WebElement ara=driver.findElement(By.xpath("//input[@class='gLFyf']"));

        Actions actions=new Actions(driver);
       actions.keyDown(ara,Keys.SHIFT)
               .sendKeys("telefon redmi")
               .keyUp(ara,Keys.SHIFT)
               .sendKeys("cok pahalı"+Keys.ENTER)
               .build()
               .perform();
       waitFor(5);
//        ‘iPhone X fiyatlari’ yazdir (SHIFT TUSUNA BASILARAK)
//        ‘ cok pahali!’ Yazdır (SHIFT TUSUNA BASILMAYARAK)
//        Ve ENTER tusuna bas
    }
}
