import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Eclipse-Luna\\eclipse-standard-luna-R-win32-x86_64\\eclipse\\chromedriver_win32");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.gmail.com");

		
		
	}

}
