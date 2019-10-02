import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowser {
    public WebDriver invokeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kadir\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver kadir = new ChromeDriver();
        return kadir;
    }
}
