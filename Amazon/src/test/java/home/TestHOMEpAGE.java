package home;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestHOMEpAGE extends CommonAPI {
    @Test
    public void test1(){

        //System.out.println(driver.getTitle());

            driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java books", Keys.ENTER);
//        //System.out.println(driver.getCurrentUrl());*/

       //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
//        driver.findElement(By.id(".nav-input")).click();
        //driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();

    }
}
