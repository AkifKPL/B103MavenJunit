package kendiÇalışmaVeDenemelerim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Deneme4 extends TestBase {


    @Test
    public void name() {

        driver.get("https://google.com");
        WebElement aramaKutusu=driver.findElement(By.name("q"));
//        aramaKutusu.sendKeys("redmi"+ Keys.ENTER);
        Actions actions=new Actions(driver);
        actions
                .keyDown(aramaKutusu,Keys.SHIFT).sendKeys("ipone x fiyatları")
                .keyUp(aramaKutusu,Keys.SHIFT)
                .sendKeys(" çok pahalı"+ Keys.ENTER)
                .build()
                .perform();


    }
}
