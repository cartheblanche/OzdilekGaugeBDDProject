import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest{
    @Step("Enter e-mail")
    public void fillEmail(){
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etEposta")).sendKeys("ahmetberke.dural@testinium.com");
    }
    @Step("Enter password")
    public void fillPassword(){
        appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/etPassword")).sendKeys("goodTesting");
    }
}
