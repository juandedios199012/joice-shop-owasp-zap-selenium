package testCase;

import model.Register;
import org.junit.jupiter.api.*;
import pages.HandlePage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import session.Session;

import static util.EnvConfig.HOST;

public class RegisterTest {
    HomePage homePage = new HomePage();
    HandlePage handlePage = new HandlePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    Register register = new Register();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(HOST);
        handlePage.welcomeHandle.click();
    }

    @Test
    @Order(1)
    public void RegisterTest() throws InterruptedException {
        homePage.navbarAccount.click();
        homePage.navigateTologinButton.click();
        Thread.sleep(5000);
        loginPage.newCustomerLink.click();
        registerPage.emailTxtBox.setText(register.getEmail());
        registerPage.passwordTxtBox.setText(register.getPassword());
        registerPage.repeatPasswordTxtBox.setText(register.getPassword());
        registerPage.selectElement.click();
        registerPage.securityQuestionCboBox.selectElement(1);
        registerPage.answerTxtBox.setText(register.getAnswer());
        Thread.sleep(5000);
        registerPage.registerButton.click();
        Assertions.assertTrue(loginPage.emailTxtBox.isControlDisplayed(), "ERROR no se registro");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeBrowser();
    }
}
