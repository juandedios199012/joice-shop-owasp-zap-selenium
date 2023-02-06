package pages;

import control.Button;
import control.Form;
import org.openqa.selenium.By;

public class ProductsPage {
    public Form heading = new Form(By.xpath("//*[contains(text(),'All Products')]"));
    public Button addBasketButton = new Button(By.xpath("//*[contains(text(),'Add to Basket')]"));
    public Button basketButton = new Button(By.xpath("//*[contains(text(),' Your Basket')]"));

    public ProductsPage() {
    }

}
