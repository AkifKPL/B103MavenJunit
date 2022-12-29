package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_CheckBox {


    // https://demo.guru99.com/test/radio.html adresine gidin
    // checkbox elementlerini locate edin
    // checkbox1 ve checkbox3  secili degil ise secin
    // checkbox1 ve checkbox3 elementlerinin secili oldugunu Test edin
    // checkbox2 elementinin secili olmadıgını test edin
    WebDriver driver;

    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void test02() {
        driver.get("https://demo.guru99.com/test/radio.html");
        WebElement checkbox1=driver.findElement(By.id("vfb-6-0"));
        WebElement checkbox2=driver.findElement(By.id("vfb-6-1"));
        WebElement checkbox3=driver.findElement(By.id("vfb-6-2"));

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }
        if (!checkbox3.isSelected()){
            checkbox3.click();
        }

        Assert.assertTrue(checkbox1.isSelected());
        Assert.assertTrue(checkbox3.isSelected());

        Assert.assertFalse(checkbox2.isSelected());


    }
//    @After
//    public void setup(){
//        driver.close();
//    }
}
