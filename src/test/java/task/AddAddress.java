package task;

import helper.JsonTestDataHelper;
import model.Address;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.CreateAddressPage;
import pages.SelectAddressPage;

public class AddAddress {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    CreateAddressPage createAddressPage = new CreateAddressPage();
    SelectAddressPage selectAddressPage = new SelectAddressPage();
    Address address = new Address();

    public void withTheData() {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        logger.info("Cerrar Alerta de Seleccion de Producto");
        //productsPage.closeToast.isVisibility();
        String alertText = createAddressPage.closeToast.getTextElement();
        if (alertText.equals("X")) {
            createAddressPage.closeToast.clickJavascript();
        }

        logger.info("Click en el Boton Agregar Address");
        selectAddressPage.addAddressButton.isVisibility();
        selectAddressPage.addAddressButton.click();

        logger.info("Pais ingresado");
        createAddressPage.countryTxtBox.setText(address.getCountry());

        logger.info("Nombre del Cliente ingresado");
        createAddressPage.nameTxtBox.setText(address.getName());

        logger.info("Celular ingresado");
        createAddressPage.mobileNumberTxtBox.setText(address.getMobileNumber());

        logger.info("Zip Code ingresado");
        createAddressPage.zipCodeTxtBox.setText(address.getZipCode());

        logger.info("Direccion ingresada");
        createAddressPage.addressTxtBox.setText(address.getAddress());

        logger.info("Ciudad ingresada");
        createAddressPage.cityTxtBox.setText(address.getCity());

        logger.info("State ingresado");
        createAddressPage.stateTxtBox.setText(address.getState());

        logger.info("Click en el Boton Submit");
        createAddressPage.submitAddressButton.isVisibility();
        createAddressPage.submitAddressButton.clickJavascript();

        logger.info("Seleccionar una direccion de la lista");
        selectAddressPage.selectAddressRadio.isVisibility();
        selectAddressPage.selectAddressRadio.selectElement(0);

        logger.info("Click en el Boton Continue");
        selectAddressPage.continueButton.click();
    }
}
