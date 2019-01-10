package Module;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.io.File;

/**
 * Created by akshay.pokley on 1/10/2019.
 */
public class CaptureScreenshot {

    @Test
    public static void captureScreenMethod() throws Exception{
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        TakesScreenshot screenshot=(TakesScreenshot)driver;
        // Call method to capture screenshot


        driver.get("https://www.softwaretestingmaterial.com/capture-screenshot-using-selenium-webdriver");
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("C:\\Users\\akshay.pokley\\Pictures\\New folder (3)\\SoftwareTestingMaterial.png"));
        driver.close();
        driver.quit();
    }
}