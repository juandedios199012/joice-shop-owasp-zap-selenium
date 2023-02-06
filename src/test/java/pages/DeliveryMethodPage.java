package pages;

import control.Button;
import control.RadioButton;
import org.openqa.selenium.By;

public class DeliveryMethodPage {
    public RadioButton chooseDeliveryRadio = new RadioButton(By.cssSelector(".mat-row"));
    public Button continueButton = new Button(By.xpath("//*[contains(text(),'Continue')]"));

    public DeliveryMethodPage() {
    }

}
