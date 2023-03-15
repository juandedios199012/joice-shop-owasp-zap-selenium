package pages;

import control.Button;
import org.openqa.selenium.By;

public class BasketPage {
    //public Button checkoutButton = new Button(By.id("checkoutButton"));
    public Button checkoutButton = new Button(By.cssSelector("button[id='checkoutButton']"));

    public BasketPage() {
    }

}
