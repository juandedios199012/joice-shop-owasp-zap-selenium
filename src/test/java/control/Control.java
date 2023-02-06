package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

import java.util.List;

//import static control.WaitUntilElement.isVisibility;

public class Control {
    protected WebElement control;
    protected By locator;
    protected List<WebElement> controls;

    public Control(By locator) {
        this.locator = locator;
    }

    protected void findControl() {
        this.control = Session.getInstance().getBrowser().findElement(this.locator);
    }

    protected void findControls() {
        this.controls = Session.getInstance().getBrowser().findElements(this.locator);
    }

    public void click() {
        this.findControl();
        this.control.click();
    }

    public void selectElement(int index) {
        this.findControls();
        this.controls.get(index).click();
    }

    public boolean isControlDisplayed() {
        try {
            this.findControl();
            return this.control.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
