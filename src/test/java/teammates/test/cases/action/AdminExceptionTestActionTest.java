package teammates.test.cases.action;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import teammates.common.util.Const;
import teammates.common.util.Sanitizer;
import teammates.common.util.AppUrl;
import teammates.ui.controller.AdminExceptionTestAction;
import teammates.test.pageobjects.AppPage;
import teammates.test.pageobjects.Browser;
import teammates.test.pageobjects.BrowserPool;

public class AdminExceptionTestActionTest extends BaseActionTest {

    // private final DataBundle dataBundle = getTypicalDataBundle();
    private static Browser browser;
    private static AppPage page;
    
    @BeforeClass
    public void classSetup() {
        printTestClassHeader();
        browser = BrowserPool.getBrowser();
        page = loginAdmin(browser);
        uri = Const.ActionURIs.ADMIN_EXCEPTION_TEST;
        // removeAndRestoreTypicalDataInDatastore();
    }
    
    @Test
    public void testExecuteAndPostProcess() {
        
        AppUrl url = new AppUrl().createUrl(uri).withParam(Const.ParamsNames.ERROR, AssertionError.class.getSimpleName());
        page.navigateTo(url);     
    }

}
