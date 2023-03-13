package control;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import session.Session;

import java.time.Duration;
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

    public boolean isVisibility() {
        this.findControl();
        try {
            WebDriverWait wait = new WebDriverWait(Session.getInstance().getBrowser(), Duration.ofSeconds(120));
            wait.until(ExpectedConditions.visibilityOf(this.control));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void moveToElement(){
        this.findControl();
        Actions act =  new Actions(Session.getInstance().getBrowser());
        act.moveToElement(this.control).click().perform();
    }

/*    public void clickWithJS(){
        //try {
            this.findControl();

        //} catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) Session.getInstance().getBrowser();
            executor.executeScript("arguments[0].click();", this.control);
            //}
    }*/

}
