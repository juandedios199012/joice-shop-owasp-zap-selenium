package task;

import helper.DataProvider;
import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.HandlePage;
import pages.HomePage;
import pages.LoginPage;

public class SignIn {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    DataProvider dataProvider = new DataProvider();

    HandlePage handlePage = new HandlePage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    public void withTheData() {
        goToSignIn();
        logger.info("Email ingresado");
        loginPage.emailTxtBox.isVisibility();
        loginPage.emailTxtBox.setText(dataProvider.getUserData().getEmailLogin());

        logger.info("Password ingresado");
        loginPage.passwordTxtBox.isVisibility();
        loginPage.passwordTxtBox.setText(dataProvider.getUserData().getPasswordLogin());

        logger.info("Click en el Boton Login");
        loginPage.loginButton.isVisibility();
        loginPage.loginButton.click();
    }

    public void goToSignIn() {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        logger.info("Clic en cuadro de Bienvenida");
        handlePage.welcomeHandle.click();

        handlePage.meWantItButton.isVisibility();
        logger.info("Click en el Boton de la esquina derecha");
        handlePage.meWantItButton.click();

        logger.info("Click en el Boton Account");
        homePage.navbarAccount.click();

        logger.info("Click en el Boton Login");
        homePage.navigateTologinButton.click();
    }
}
