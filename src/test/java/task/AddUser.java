package task;

import helper.JsonTestDataHelper;
import model.Register;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;
import session.Session;

public class AddUser {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    Register register = new Register();

    public void withTheData() {
        logger.info("Se encuentra en la Clase: "+getClass().getName());

        logger.info("Email ingresado");
        registerPage.emailTxtBox.isVisibility();
        registerPage.emailTxtBox.setText(register.getEmail());

        logger.info("Password ingresada");
        registerPage.passwordTxtBox.setText(register.getPassword());

        logger.info("Confirmar password");
        registerPage.repeatPasswordTxtBox.setText(register.getPassword());

        logger.info("Click en Security Question");
        registerPage.selectElement.click();

        logger.info("Seleccionar Security Question");
        registerPage.securityQuestionCboBox.selectElement(register.getQuestion());

        logger.info("Respuesta ingresada");
        registerPage.answerTxtBox.setText(register.getAnswer());

        registerPage.registerButton.isVisibility();
        logger.info("Click en el Boton Registrar");
        registerPage.registerButton.click();
    }

    public void goToRegister() {
        logger.info("Click en el Boton Account");
        homePage.navbarAccount.isVisibility();
        homePage.navbarAccount.click();

        logger.info("Click en el Boton Login");
        homePage.navigateTologinButton.click();

        Session.getInstance().getBrowser().navigate().refresh();

        logger.info("Click en el Boton customer");
        loginPage.newCustomerLink.click();
    }

}
