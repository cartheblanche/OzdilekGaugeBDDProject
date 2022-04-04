import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class PantsPage extends BaseTest{
    @Step("Go to a random product page")
    public void getRandomProduct(){
        WebElement parentElement = appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/recyclerView"));
        List<WebElement> childElements = parentElement.findElements(By.className("android.widget.FrameLayout"));
        int randomNum = ThreadLocalRandom.current().nextInt(0, childElements.size()+1);
        WebElement selectedProduct = childElements.get(randomNum);
        selectedProduct.click();
    }


    @Step("Check if entered successfully to random product page")
    public void checkRandomProductPage(){
        try{
            appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/iv"));
        }catch(Exception e){
            Assert.fail("!!! Random product page is not open !!!");
        }
    }
}
