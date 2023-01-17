package practice03;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;
public class HWActions01 extends TestBase {
    @Test
    public void name() {
        //https://demoqa.com/ url'ine gidin.
        driver.get("https://demoqa.com/");
        //Alerts, Frame & Windows Butonuna click yap
        WebElement kutu = driver.findElement(By.xpath("(//*[@class='card-up'])[6]"));
        //clickWithText("div.card-body>h5","Alerts, Frame & Windows");
        Actions actions = new Actions(driver);
        //actions.moveToElement(kutu).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        driver.findElement(By.xpath("(//*[@class='card mt-4 top-card'])[3]")).click();
        //""Please select an item from left to start practice."" yazısının görünür olduğunu doğrula
        //Sol'da açılan Menu den ""Browser Windows"" butonuna click yap
        //New Tab butonunun görünür olduğunu doğrula
        //New Tab butonuna click yap
        //Açılan yeni Tab da ""This is a sample page"" yazısının görünür olduğunu doğrula
        //İlk Tab'a geri dön
        ////New Tab butonunun görünür olduğunu doğrula
    }
}
