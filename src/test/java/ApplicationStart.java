import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ApplicationStart extends BaseTest {

    @Step("Check if the app opened.")
    public void checkStart(){
        try{
            appiumDriver.findElement(By.id("com.ozdilek.ozdilekteyim:id/iv_storeTopLogo"));
        }catch(Exception e){
            Assert.fail("!!! App is not open !!!");
        }
    }
}
