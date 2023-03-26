package task;

import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.DeliveryMethodPage;

public class AddDelivery {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    DeliveryMethodPage deliveryMethodPage = new DeliveryMethodPage();

    public void withTheData() {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        logger.info("Metodo de Entrega Seleccionado");
        deliveryMethodPage.chooseDeliveryRadio.isVisibility();
        deliveryMethodPage.chooseDeliveryRadio.selectElement(0);

        logger.info("Click en el Boton Contiue");
        deliveryMethodPage.continueButton.click();
    }
}
