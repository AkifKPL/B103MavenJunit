package practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class C02 {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
// ...Exercise 2...


// https://www.amazon.com/ sayfasina gidin
// dropdown'dan "Baby" secenegini secin
// sectiginiz option'i yazdirin
// dropdown'daki optionlarin toplam sayısının 28'e esit oldugunu test edin
    }

////    @After
////    public void tearDown(){
////        driver.close();
//    }

    @Test
    public void name() {

        driver.get("https://www.amazon.com/");

//1- locate edilmeli
        WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

        //2-Select objesi olusturulmalı
        Select select=new Select(ddm);

        //3-opsiyon secilir
        select.selectByVisibleText("Baby");
        //select.selectByValue("search-alias=stripbooks");
        //select.selectByIndex(12);

        String sectigimOpsiyon=select.getFirstSelectedOption().getText();
        System.out.println("sectigimOpsiyon = " + sectigimOpsiyon);


    }
}
