package pages;

import control.Button;
import org.openqa.selenium.By;

public class HandlePage {

    public Button welcomeHandle = new Button(By.cssSelector(".close-dialog"));
    public Button meWantItButton = new Button(By.cssSelector(".cc-dismiss"));
}
