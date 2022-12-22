package day05_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {
    @Before
    public void setup(){
        System.out.println("her test metodundan önce calışır.");
    }
    @After
    public void tearDown(){
        System.out.println("Her test metodundan sonra çalışır");
    }
    @Test
    public void test01(){
        System.out.println("ilk Test");

        }
        @Test
        public void test02(){
            System.out.println("İkinci Test");
    }
}
