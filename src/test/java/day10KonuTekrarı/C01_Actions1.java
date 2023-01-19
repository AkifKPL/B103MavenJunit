package day10KonuTekrarı;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C01_Actions1 extends TestBase {


    @Test
    public void rightClick(){

        //    Class: Actions1
//    Method: rightClick
//    https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
//    Kutuya sag tıklayın
        Actions actions = new Actions(driver);
        WebElement kutu =driver.findElement(By.id("hot-spot"));
        actions.contextClick(kutu).perform();
//    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
       String alert= driver.switchTo().alert().getText();
       String aculaty="You selected a context menu";
        Assert.assertEquals(alert,aculaty);
        driver.switchTo().alert().accept();


//    Tamam diyerek alert’i kapatın
    }
}
