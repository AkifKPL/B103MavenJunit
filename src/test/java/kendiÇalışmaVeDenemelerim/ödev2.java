package kendiÇalışmaVeDenemelerim;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class ödev2 extends TestBase {

    @Test
    public void name() {
//        Bir Class olusturalim KeyboardActions2
//        https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe/");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        actions.sendKeys(Keys.PAGE_DOWN).perform();


//        video’yu gorecek kadar asagi inin
//        videoyu izlemek icin Play tusuna basin
//        videoyu calistirdiginizi test edin
    }
}
