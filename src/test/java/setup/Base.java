package setup;

import POM.Landingpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Base {
    private WebDriver driver;
    protected Landingpage landingpage;
    String baseUrl = "https://www.google.com";

    //Create Method/Function
    //Return String int double
    //accessmodifier return name() {}

    //non returning function
//    public void start() {
//    }
    //Returning function
//    public int add(int a, int b) {
//        int result = 0;
//
//        result = a + b;
//
//        return result;
//    }


//    System.out.println(sum);

    @BeforeTest
    public void setup() throws InterruptedException{

//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\IdeaProjects\\ChakaProcessAutomation\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get(baseUrl);
        landingpage = new Landingpage(driver);
    }

    @AfterTest
    public void closeBrowser() throws InterruptedException{
//        driver.close();
        Thread.sleep(3000);
        driver.quit();
    }
}
