package control;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ComboBox extends Control {

    public ComboBox(By locator) {
        super(locator);
    }

    public void clickFirstSelectedValue(String value){
        this.findControl();
        Select select = new Select(this.control);
        select.selectByValue(value);

    }
}
