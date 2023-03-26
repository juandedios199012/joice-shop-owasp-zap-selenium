package task;

import helper.JsonTestDataHelper;
import model.Card;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.PaymentPage;

public class AddPayment {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    PaymentPage paymentPage = new PaymentPage();
    Card card = new Card();

    public void withTheData() {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        logger.info("Click en Add new Card");
        paymentPage.addNewCard.isVisibility();
        paymentPage.addNewCard.click();

        logger.info("Nombre del Titular de la tarjeta ingresado");
        paymentPage.nameTxtBox.isVisibility();
        paymentPage.nameTxtBox.setText(card.getName());

        logger.info("Numero de tarjeta ingresado");
        paymentPage.cardNumberTxtBox.setText(card.getCardNumber());

        logger.info("Seleccionar mes de vencimiento");
        paymentPage.selectElementMonth.isVisibility();
        paymentPage.selectElementMonth.clickJavascript();
        paymentPage.expiryMonthCboBox.clickFirstSelectedValue("1");

        logger.info("Seleccionar año de vencimiento");
        paymentPage.selectElementYear.clickJavascript();
        ;
        paymentPage.expiryYearCboBox.clickFirstSelectedValue("2080");

        logger.info("Click en el Boton Submit");
        paymentPage.submitButton.isVisibility();
        paymentPage.submitButton.click();

        logger.info("Seleccionar un Card de la Lista");
        paymentPage.selectCard.isVisibility();
        paymentPage.selectCard.selectElement(0);

        logger.info("Click en el Boton Continue");
        paymentPage.continueButton.click();
    }
}
