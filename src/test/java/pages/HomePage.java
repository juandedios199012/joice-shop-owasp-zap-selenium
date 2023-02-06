package pages;

import control.Button;
import org.openqa.selenium.By;

public class HomePage {
    public Button navbarAccount = new Button(By.id("navbarAccount"));
    public Button navigateTologinButton = new Button(By.id("navbarLoginButton"));

    public HomePage() {
    }

}
