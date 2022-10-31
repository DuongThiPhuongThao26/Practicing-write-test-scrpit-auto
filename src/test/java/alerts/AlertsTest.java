package alerts;

import base.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.AlertsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertsTest extends BaseTest {

    AlertsPage alertsPage;

    @BeforeEach
    void clickAlert() {
        alertsPage = homePage.clickAlert();
    }

    @Test
    void testAcceptAlert() {
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert");
    }

    @Test
    void testGetTextAndDismissAlert() {
        alertsPage.triggerConfirm();
        String alertText = alertsPage.getAlertText();
        alertsPage.dismissAlert();
        assertEquals(alertText, "I am a JS Confirm");
        assertEquals(alertsPage.getResult(), "You clicked: Cancel");
    }

    @Test
    void testSetTextAndAcceptAlert() {
        alertsPage.triggerProm();
        String text = "ALERT!";
        alertsPage.setAlertInput(text);
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResult(), "You entered: " + text);
    }
}
