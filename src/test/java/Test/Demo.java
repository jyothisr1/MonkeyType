package Test;

import org.testng.annotations.Test;

public class Demo extends BaseTest{

    @Test
    public void automateTyping(){
        homePage.openWebsite();
        homePage.typeTest();
    }
}
