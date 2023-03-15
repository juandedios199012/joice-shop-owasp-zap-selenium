package testCase;

import org.junit.jupiter.api.*;
import pages.HandlePage;
import pages.LoginPage;
import session.Session;
import task.AddUser;

import static util.EnvConfig.HOST;

public class RegisterTest {
    HandlePage handlePage = new HandlePage();
    LoginPage loginPage = new LoginPage();
    AddUser addUser = new AddUser();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(HOST);
        handlePage.welcomeHandle.click();
        addUser.goToRegister();
    }

    @Test
    @Order(1)
    public void RegisterTest() {
        addUser.withTheData();
        Assertions.assertTrue(loginPage.emailTxtBox.isControlDisplayed(), "ERROR no se registro");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeBrowser();
    }
}
