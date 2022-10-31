package features.keyPress;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeyPresses extends BaseTest {
    @Test
    void testBackspace(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }

    @Test
    void enterPi(){
        KeyPressesPage keyPressesPage = homePage.clickKeyPresses();
        keyPressesPage.enterText(Keys.chord(Keys.ALT, "227"));
    }


}
