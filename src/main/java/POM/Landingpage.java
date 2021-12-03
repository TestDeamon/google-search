package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Landingpage {
    private WebDriver driver;

    public Landingpage(WebDriver driver){
        this.driver = driver;
    }

    public void searchWord() throws InterruptedException {

        Thread.sleep(2000);
        //Find element by css selector, class, name, id, xpath
        driver.findElement(By.name("q")).sendKeys("Alola David");
        Actions builder = new Actions(driver);

        Action seriesOfActions = builder
                .sendKeys(Keys.ENTER)
                .build();
        seriesOfActions.perform();
//        driver.findElement()
        Thread.sleep(10000);
    }

}
