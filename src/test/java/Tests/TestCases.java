package Tests;

import org.testng.annotations.Test;
import setup.Base;

public class TestCases extends Base {
    @Test
    public void tests() throws InterruptedException {
        Thread.sleep(1000);
        landingpage.searchWord();


    }
}
