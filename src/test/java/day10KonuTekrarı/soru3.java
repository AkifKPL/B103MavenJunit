package day10KonuTekrarı;

import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class soru3 extends TestBase {

     @Test
    public void test01(){
//         Class: ActionClass3
//         Method : scrollUpDown()
//         https://techproeducation.com a git
             driver.get("https://techproeducation.com");
//         Sayfanin altına doğru gidelim
         Actions actions=new Actions(driver);
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         actions.sendKeys(Keys.PAGE_UP).perform();
         actions.sendKeys(Keys.PAGE_UP).perform();
         actions.sendKeys(Keys.ARROW_DOWN);
         actions.sendKeys(Keys.ARROW_DOWN);
         waitFor(3);

//         Sonra sayfanın üstüne doğru gidelim




     }
}
