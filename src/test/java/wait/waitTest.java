package wait;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class waitTest extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
//        assertEquals(loadingPage.getLoadedText(), "Hello World!");
        assertEquals(loadingPage.getLoadedText(), "Hello World!");


    }

}
