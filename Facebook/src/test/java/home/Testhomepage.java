package home;

import common.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testhomepage extends CommonAPI{


    @Test
    public void test1(){ clickOnElement(".nav-linksstyles__NavLinkList-sc-1tike8v-2.jJWZwe li:nth-child(4)");
    //clickOnElement("nav-linksstyles__Link-sc-1tike8v-0");
    }
    @Test
    public void test2(){
        Assert.assertEquals("Facebook - Log In or Sign Up", driver.getTitle());
    }
    @Test
    public void test3(){
        clickOnElement("email");
    }
    @Test
    public void test4(){
        typeOnElement("#email","user123@gmail.com");
        typeOnElement("#pass","user123");
        clickOnElement("input[type=submit]");
    }
}
