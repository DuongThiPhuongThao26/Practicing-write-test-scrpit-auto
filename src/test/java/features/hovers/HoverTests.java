package features.hovers;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HoverTests extends BaseTest {

    @Test
    void testHoverUser1(){
        var HoversPage  = homePage.clickHovers();
        var caption  = HoversPage.hoverOverFigure(1);
        waitABit();
                assertTrue(caption.isCaptionDisplayed());
                assertEquals("name: user1", caption.getTitle());
                assertEquals("View profile", caption.getLinkText());
                assertTrue(caption.getLink().endsWith("/users/1"));
    }
}
