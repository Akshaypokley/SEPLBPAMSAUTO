package Pract;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by akshay.pokley on 5/5/2018.
 */
public class FindAllLinks {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("http://toolsqa.wpengine.com/");

        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println(links.size());

        for (int i = 1; i <= links.size(); i = i + 1)

        {

            System.out.println(links.get(i).getText());

        }

    }

}