package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("C:\\Users\\isabellaSzrajbman\\Desktop\\webdriver_java_TAU\\resources\\chromedriver97.exe");
        assertEquals(uploadPage.getUploadedFiles(),"chromedriver97.exe");
    }
}
