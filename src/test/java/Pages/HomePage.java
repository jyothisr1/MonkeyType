package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{
    @FindBy(xpath = "//div[@id='words']/div")
    List<WebElement> characters;

    public void openWebsite() {
        driver.get("https://monkeytype.com/");
    }

    public void typeTest() {
//        for (WebElement ch:characters){
//            String a=ch.getText();
//            Actions actions=new Actions(driver);
//            actions.sendKeys(a).build().perform();
//        }
        int n=1;
        int size=driver.findElements(By.xpath("(//div[@id='words']/div)")).size();
        for(int i=1;i<characters.size();i++){
            List<WebElement> ls=driver.findElements(By.xpath("//div[@id='words']/div["+i+"]/letter"));
            System.out.println(ls.size()+"======>");
            Actions actions=new Actions(driver);
            for(int j=n;j<=ls.size();j++){
                String a=driver.findElement(By.xpath("(//div[@id='words']/div/letter)["+j+"]")).getText();
                System.out.println(a);
                actions.sendKeys(a).build().perform();
                n++;
            }
            actions.sendKeys(" ").build().perform();
        }
//        for (int i=1;i<100;i++){
//            String a=driver.findElement(By.xpath("(//div[@id='words']/div/letter)["+i+"]")).getText();
//            Actions actions=new Actions(driver);
//            actions.sendKeys(a).build().perform();
//        }
    }
}
