package day10KonuTekrarı;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class soru4 extends TestBase {

//    @Test
//    public void name() {
////        Class: Action4
////        Method: dragAndDropTest
////        Given user is on https://jqueryui.com/droppable/
//        driver.get("https://jqueryui.com/droppable/");
//        driver.switchTo().frame(0);
////        And user moves the target element(Drag me to my target) in to  destination(Drop here)
//        WebElement birinciKutu=driver.findElement(By.xpath("//div[@id='draggable']"));
//        WebElement ikinciKutu=driver.findElement(By.xpath("//div[@id='droppable']"));
//        Actions actions=new Actions(driver);
//        actions.dragAndDrop(birinciKutu,ikinciKutu).perform();
//
//
//    }
    @Test
    public void test01(){

        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
//        And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement birinciKutu=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement ikinciKutu=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(birinciKutu).moveToElement(ikinciKutu).perform();

    }

    @Test
    public void name() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
//        And user moves the target element(Drag me to my target) in to  destination(Drop here)
        WebElement birinciKutu=driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement ikinciKutu=driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions=new Actions(driver);
        actions.clickAndHold(birinciKutu).moveByOffset(430,30).build().perform();


    }
}
