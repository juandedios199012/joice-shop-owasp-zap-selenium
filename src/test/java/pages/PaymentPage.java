package pages;

import control.Button;
import control.ComboBox;
import control.RadioButton;
import control.TextBox;
import org.openqa.selenium.By;

public class PaymentPage {
    public Button addNewCard = new Button(By.xpath("//*[contains(text(),' Add a credit or debit card')]"));
    public TextBox nameTxtBox = new TextBox(By.id("customer"));
    public TextBox cardNumberTxtBox = new TextBox(By.id("cardNumber"));
    public Button selectElementMonth = new Button(By.id("monthForm"));
    public ComboBox expiryMonthCboBox = new ComboBox(By.id("month"));
    public Button selectElementYear = new Button(By.id("yearForm"));
    public ComboBox expiryYearCboBox = new ComboBox(By.id("year"));
    public Button submitButton = new Button(By.id("submitButton"));
    public RadioButton selectCard = new RadioButton(By.cssSelector(".mat-radio-container"));
    public Button continueButton = new Button(By.xpath("//*[contains(text(),'Continue')]"));

    public PaymentPage() {
    }

}
