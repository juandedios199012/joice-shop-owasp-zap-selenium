package pages;

import control.Button;
import control.ComboBox;
import control.TextBox;
import org.openqa.selenium.By;

public class RegisterPage {
    public TextBox emailTxtBox = new TextBox(By.id("emailControl"));
    public TextBox passwordTxtBox = new TextBox(By.id("passwordControl"));
    public TextBox repeatPasswordTxtBox = new TextBox(By.id("repeatPasswordControl"));
    public Button selectElement = new Button(By.cssSelector(".mat-select-arrow"));
    public ComboBox securityQuestionCboBox = new ComboBox(By.cssSelector(".mat-option-text"));
    public TextBox answerTxtBox = new TextBox(By.id("securityAnswerControl"));
    public Button registerButton = new Button(By.id("registerButton"));

    public RegisterPage() {
    }

}
