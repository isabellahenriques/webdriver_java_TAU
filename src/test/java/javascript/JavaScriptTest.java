package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTests {

    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDom().scrollToTable();
    }

//    @Test
//    public void testScroolToFifithParagraph(){
//        homePage.clickInfiniteScroll().scrollToParagraph("5");
//    }

}
