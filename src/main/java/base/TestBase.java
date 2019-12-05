package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import utils.datautils.LoadDataProperties;

import java.util.TreeMap;

public class TestBase {
    public String browser="EDGE";
    public String environment ="test";
    public String url;
    public WebDriver driver;
    public static TreeMap<String, String> testData = null;

    @BeforeSuite
    public void startup(){
        url = "https://komtek.nk"+environment+".no/eiendomsskatt/klageh%C3%A5ndtering";
    }

    @Test
    public void launchBrowesr() throws Exception {
        /*String path = "/testdata/" + environment + ".properties";
        testData = new LoadDataProperties().getWebDataMapping(path);*/
        if(driver == null){
            if(browser == "CHROME"){
                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                String baseUrl = "http://demo.guru99.com/test/newtours/";
                driver.get(baseUrl);
                System.out.println(driver.getTitle());
            }if(browser == "EDGE"){
                System.setProperty("webdriver.edge.driver",
                        System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
                String baseUrl = "http://demo.guru99.com/test/newtours/";
                driver.get(baseUrl);
                System.out.println(driver.getTitle());

                System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\drivers\\msedgedriver.exe");
                driver = new ChromeDriver();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setBinary(
                        "C:\\Program Files (x86)\\Microsoft\\Edge Beta\\Application\\msedge.exe");
               /*// ChromeOptions edgeOptions = new EdgeOptions().merge(chromeOptions);

                driver = new ChromeDriver(edgeOptions);*/

            }
                String baseUrl = "http://demo.guru99.com/test/newtours/";
                driver.get(baseUrl);
                System.out.println(driver.getTitle());
            }
        }


    @AfterMethod
    public void closeBrowser(){
        if(driver !=null){
            driver.close();
        }
    }
}
