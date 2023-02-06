package testCase;

import model.Address;
import model.Card;
import model.Login;
import org.junit.jupiter.api.*;
import pages.*;
import session.Session;

import static util.EnvConfig.HOST;

public class OrderTest {
    HandlePage handlePage = new HandlePage();
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Login login = new Login();
    ProductsPage productsPage = new ProductsPage();
    BasketPage basketPage = new BasketPage();
    CreateAddressPage createAddressPage = new CreateAddressPage();
    SelectAddressPage selectAddressPage = new SelectAddressPage();
    Address address = new Address();
    DeliveryMethodPage deliveryMethodPage = new DeliveryMethodPage();
    PaymentPage paymentPage = new PaymentPage();
    Card card = new Card();
    OrderSummaryPage orderSummaryPage = new OrderSummaryPage();
    OrderCompletionPage orderCompletionPage = new OrderCompletionPage();

    @BeforeEach
    public void openBrowser() throws InterruptedException {
        Session.getInstance().getBrowser().get(HOST);
        handlePage.welcomeHandle.click();
        Thread.sleep(3000);
        handlePage.meWantItButton.click();

        homePage.navbarAccount.click();
        homePage.navigateTologinButton.click();
        loginPage.emailTxtBox.setText(login.getEmailLogin());
        loginPage.passwordTxtBox.setText(login.getPasswordLogin());
        loginPage.loginButton.click();
    }

    @Test
    @Order(2)
    public void OrdenTest() throws InterruptedException {
        productsPage.addBasketButton.click();
        productsPage.basketButton.click();
        Thread.sleep(5000);
        basketPage.checkoutButton.click();
        selectAddressPage.addAddressButton.click();
        createAddressPage.countryTxtBox.setText(address.getCountry());
        createAddressPage.nameTxtBox.setText(address.getName());
        createAddressPage.mobileNumberTxtBox.setText(address.getMobileNumber());
        createAddressPage.zipCodeTxtBox.setText(address.getZipCode());
        createAddressPage.addressTxtBox.setText(address.getAddress());
        createAddressPage.cityTxtBox.setText(address.getCity());
        createAddressPage.stateTxtBox.setText(address.getState());
        Thread.sleep(5000);
        createAddressPage.submitAddressButton.click();
        Thread.sleep(5000);
        selectAddressPage.selectAddressRadio.selectElement(0);
        selectAddressPage.continueButton.click();
        Thread.sleep(5000);
        deliveryMethodPage.chooseDeliveryRadio.selectElement(0);
        deliveryMethodPage.continueButton.click();
        Thread.sleep(5000);
        paymentPage.addNewCard.click();
        Thread.sleep(2000);
        paymentPage.nameTxtBox.setText(card.getName());
        paymentPage.cardNumberTxtBox.setText(card.getCardNumber());
        paymentPage.selectElementMonth.click();
        paymentPage.expiryMonthCboBox.clickFirstSelectedValue("1");
        paymentPage.selectElementYear.click();
        paymentPage.expiryYearCboBox.clickFirstSelectedValue("2080");
        paymentPage.submitButton.click();
        Thread.sleep(5000);
        paymentPage.selectCard.selectElement(0);
        paymentPage.continueButton.click();
        orderSummaryPage.checkoutButton.click();
        Assertions.assertTrue(orderCompletionPage.confirmationLabel.isControlDisplayed(), "ERROR no se registro");
    }

    @AfterEach
    public void closeBrowser() {
        Session.getInstance().closeBrowser();
    }
}
