import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CategoriesPage extends BaseTest{
    @Step("Check if the categories page opened.")
    public void checkCategoriesPage(){
        try{
            appiumDriver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Kategoriler\"]"));
        }catch(Exception e){
            Assert.fail("!!! Categories is not open !!!");
        }
    }
}