package pages;

import control.Label;
import org.openqa.selenium.By;

public class OrderCompletionPage {
    public Label confirmationLabel = new Label(By.cssSelector(".confirmation"));

    public OrderCompletionPage() {
    }

}
