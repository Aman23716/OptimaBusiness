package org.OptimaBusTests.uiTests.mainPageTests;

import org.OptimaBusTests.uiTests.BaseUiTests;
import org.testng.annotations.Test;

public class DocumentsTest extends BaseUiTests {
    @Test
    public void checkHelpBtn() {
        webElementActions.refreshPage();
        webElementActions.pause(2000);
        more.openHelpBtn();
        customAssertions.asserText("Руководство пользователя", more.usersGuideText, "norm");
    }
}
