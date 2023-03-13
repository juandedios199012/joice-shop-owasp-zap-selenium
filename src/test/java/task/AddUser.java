package task;

import helper.JsonTestDataHelper;
import model.Register;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import session.Session;

public class AddUser {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    Register register = new Register();

    public void withTheData() {
        goToRegister();

        logger.info("Email ingresado");
        registerPage.emailTxtBox.setText("user04@gmail.com");

        logger.info("Password ingresada");
        registerPage.passwordTxtBox.setText("A1B2C3D4");

        logger.info("Confirmar password");
        registerPage.repeatPasswordTxtBox.setText("A1B2C3D4");

        logger.info("Click en Security Question");
        registerPage.selectElement.click();

        logger.info("Seleccionar Security Question");
        registerPage.securityQuestionCboBox.selectElement(1);

        logger.info("Respuesta ingresada");
        registerPage.answerTxtBox.setText(register.getAnswer());
        //Thread.sleep(5000);

        registerPage.registerButton.isVisibility();
        logger.info("Click en el Boton Registrar");
        registerPage.registerButton.click();
    }
    public void goToRegister() {
        logger.info("Click en el Boton Account");
        homePage.navbarAccount.click();

        logger.info("Click en el Boton Login");
        homePage.navigateTologinButton.click();

        Session.getInstance().getBrowser().navigate().refresh();
        //Thread.sleep(7000);
        logger.info("Click en el Boton customer");
        loginPage.newCustomerLink.click();
    }
}
