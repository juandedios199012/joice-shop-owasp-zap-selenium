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

    public void withTheData() throws InterruptedException {
        logger.info("Se encuentra en la Clase: " + getClass().getName());

        Thread.sleep(6000);
        logger.info("Agregar Producto");
        productsPage.addBasketButton.isVisibility();
        productsPage.addBasketButton.click();

        logger.info("Click en el Boton Basket");
        productsPage.basketButton.isVisibility();
        productsPage.basketButton.click();
        Thread.sleep(6000);
        logger.info("Click en el Boton checkout");
        basketPage.checkoutButton.isVisibility();
        basketPage.checkoutButton.clickJavascript();
    }
}
