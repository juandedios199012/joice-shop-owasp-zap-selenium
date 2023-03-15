package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class CreateAddressPage {
    public TextBox countryTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a country.']"));
    public TextBox nameTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a name.']"));
    public TextBox mobileNumberTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a mobile number.']"));
    public TextBox zipCodeTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a ZIP code.']"));
    public TextBox addressTxtBox = new TextBox(By.id("address"));
    public TextBox cityTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a city.']"));
    public TextBox stateTxtBox = new TextBox(By.cssSelector("input[placeholder='Please provide a state.']"));
    public Button submitAddressButton = new Button(By.cssSelector("button[id='submitButton']"));
    public Button closeToast = new Button(By.cssSelector(".mat-button-wrapper"));
    public CreateAddressPage() {
    }

}
