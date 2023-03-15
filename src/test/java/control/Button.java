package control;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;

public class Button extends Control {
    public Button(By locator) {
        super(locator);
    }

    public boolean isVisibility3() {
        this.findControl();
        try {
            WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(120));
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


}
