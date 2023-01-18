package day10KonuTekrarı;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru2 extends TestBase {
    @Test
    public void test2(){
//        Class: Actions2
//        Method : hoverOver() and test the following scenario:
//        Amazon a gidelim https://www.amazon.com/
        driver.get("https://www.amazon.com/");
//        Sag ust bolumde bulunan “Account & Lists” menüsüne git
        Actions menu= new Actions(driver);
        WebElement acılırMenu= driver.findElement(By.id("nav-link-accountList"));
       menu.moveToElement(acılırMenu).perform();
       waitFor(3);

       //        “Account” secenegine tikka
        driver.findElement(By.linkText("Account")).click();
//        Acilan sayfanin Title in “Your Account” icerdigini dogrula
        Assert.assertTrue(driver.getTitle().contains("Your Account"));

    }

}
