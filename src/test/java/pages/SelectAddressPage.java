package pages;

import control.Button;
import control.RadioButton;
import org.openqa.selenium.By;

public class SelectAddressPage {
    public Button addAddressButton = new Button(By.cssSelector(".btn-new-address"));
    public RadioButton selectAddressRadio = new RadioButton(By.cssSelector("mat-row[role='row']"));
    public Button continueButton = new Button(By.xpath("//*[contains(text(),'Continue')]"));

    public SelectAddressPage() {
    }

}
