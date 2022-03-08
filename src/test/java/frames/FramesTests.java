package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FramesTests  extends BaseTests {

    @Test
    public void testWysyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "world";

        editorPage.setTextArea(text1);
        //editorPage.descreaseIndention();
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(),text1+text2);


    }

}
