package testCase;

import org.junit.jupiter.api.*;
import pages.OrderCompletionPage;
import pages.OrderSummaryPage;
import session.Session;
import task.*;

import static util.EnvConfig.HOST;

@TestClassOrder(ClassOrderer.OrderAnnotation.class)
public class OrderTest {
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();
    SignIn signIn = new SignIn();
    AddProduct addProduct = new AddProduct();
    AddAddress address = new AddAddress();
    AddDelivery addDelivery = new AddDelivery();
    AddPayment addPayment = new AddPayment();

    @BeforeEach
    public void openBrowser(){
        Session.getInstance().getBrowser().get(HOST);
        signIn.withTheData();
    }

    @Test
    @Order(2)
    public void OrdenTest(){
        addProduct.withTheData();
        address.withTheData();
        addDelivery.withTheData();
        addPayment.withTheData();

        orderSummaryPage.checkoutButton.click();
        Assertions.assertTrue(orderCompletionPage.confirmationLabel.isControlDisplayed(), "ERROR no se registro");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeBrowser();
    }
}
