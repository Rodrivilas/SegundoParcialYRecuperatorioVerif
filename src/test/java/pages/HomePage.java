package pages;

import control.Button;
import org.openqa.selenium.By;

public class HomePage {
    public Button loginButton = new Button(By.xpath("//ul[@class=\"_3XsmI\"]//li//a[text()=\"Log in\"]"));
}
