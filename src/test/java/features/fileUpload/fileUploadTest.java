package features.fileUpload;

import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.FileUploadPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fileUploadTest extends BaseTest {
    @Test
    void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickUpload();
        String filename = "Choai Villa.jpg";
        fileUploadPage.uploadFile(System.getProperty("user.dir") + "\\src\\test\\resources\\" + filename);
        assertEquals(fileUploadPage.getUploadedFile(), filename);
    }
}
