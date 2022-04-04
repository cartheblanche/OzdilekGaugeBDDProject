import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import java.time.Duration;


public class BasePage extends BaseTest {

    @Step("Wait for <int> seconds")
    public void waitForSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds * 1000);
    }

    @Step("Check <id> for visible and click.")
    public void findByElementEndClick(String id) {
        MobileElement element = appiumDriver.findElement(By.id(id));
        if (element.isDisplayed()) {
            appiumDriver.findElement(By.id(id)).click();

        } else {
            System.out.println("!!!Element not visible!!!");
        }
    }

    @Step("Swipe the page down")
    public void swipeUp() {
        final int ANIMATION_TIME = 200;

        final int PRESS_TIME = 200;

        int edgeBorder = 1;

        PointOption pointOptionStart, pointOptionEnd;

        Dimension dims = appiumDriver.manage().window().getSize();

        pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
        System.out.println("Start Point: " + pointOptionStart.toString());
        pointOptionEnd = PointOption.point(dims.width / 2, edgeBorder);
        System.out.println("End Point: " + pointOptionEnd.toString());
        try {
            new TouchAction(appiumDriver)
                    .press(pointOptionStart)
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            Assert.fail("!!! swipeScreen(): TouchAction FAILED" + e.getMessage() + " !!!");
            return;
        }

        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Step("XPath: Find <xpath> element and click.")
    public void clickByXPath(String xpath) {
        appiumDriver.findElement(By.xpath(xpath)).click();
    }

}


