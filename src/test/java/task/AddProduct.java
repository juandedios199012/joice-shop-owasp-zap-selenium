package task;

import helper.JsonTestDataHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import pages.BasketPage;
import pages.ProductsPage;

public class AddProduct {

    private static final Logger logger = LogManager.getLogger(JsonTestDataHelper.class);

    ProductsPage productsPage = new ProductsPage();
    BasketPage basketPage = new BasketPage();

    public void withTheData() {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        logger.info("Agregar Producto");
        productsPage.addBasketButton.isVisibility();
        productsPage.addBasketButton.click();

        logger.info("Click en el Boton Basket");
        productsPage.basketButton.isVisibility();
        productsPage.basketButton.click();

        /*logger.info("Cerrar Alerta de Seleccion de Producto");
        String alertText=productsPage.closeToast.getTextElement();
        if (alertText.equals("X")){
            productsPage.closeToast.click();
            productsPage.closeToast.clickJavascript();
        }*/

        logger.info("Click en el Boton checkout");
        basketPage.checkoutButton.isVisibility();
        // basketPage.checkoutButton.isControlDisplayed();
        basketPage.checkoutButton.clickJavascript();
    }
}
