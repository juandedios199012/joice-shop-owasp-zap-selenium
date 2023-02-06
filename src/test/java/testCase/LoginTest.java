package testCase;

import model.Login;
import org.junit.jupiter.api.*;
import pages.HandlePage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;
import session.Session;

import static util.EnvConfig.HOST;

public class LoginTest {
    HandlePage handlePage = new HandlePage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Login login = new Login();
    ProductsPage productsPage = new ProductsPage();

    @BeforeEach
    public void openBrowser() {
        Session.getInstance().getBrowser().get(HOST);
        handlePage.welcomeHandle.click();
    }

    @Test
    @Order(2)
    public void LoginTest() throws InterruptedException {
        homePage.navbarAccount.click();
        homePage.navigateTologinButton.click();
        loginPage.emailTxtBox.setText(login.getEmailLogin());
        loginPage.passwordTxtBox.setText(login.getPasswordLogin());
        loginPage.loginButton.click();
        Thread.sleep(3000);
        Assertions.assertTrue(productsPage.heading.isControlDisplayed(), "ERROR no se registro");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeBrowser();
    }
}
