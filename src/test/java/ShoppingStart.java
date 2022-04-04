import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ShoppingStart extends BaseTest{

    @Step("Check if the shopping page opened.")
    public void checkShoppingPage(){
        try{
            appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/iv"));
        }catch(Exception e){
            Assert.fail("!!! Search Page is not open !!!");
        }
    }
}
