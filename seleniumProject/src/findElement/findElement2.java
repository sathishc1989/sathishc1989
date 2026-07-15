package findElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElement2 {
    public static void main(String[] args) throws InterruptedException {

        //launch browser
        WebDriver driver = new ChromeDriver();

        //open url
        driver.get("https://online.actitime.com/cskltd/forgot.do");

        //verify login
        String actualTitle = driver.getTitle();
        if (actualTitle.contains("actiTIME"))
        {
            System.out.println("Login page is displayed");
        }
        else
        {
            System.out.println("Login page is not displayed");
        }

        //locate username
        WebElement username =driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("sathishc1989@gmail.com");
        Thread.sleep(2000);

        WebElement password =driver.findElement(By.xpath("//input[@placeholder='Password']"));
        password.sendKeys("Csk@2026");
        Thread.sleep(2000);

        WebElement loginbutton = driver.findElement(By.xpath("//div[normalize-space()='Login']"));
        loginbutton.click();
        Thread.sleep(2000);

        //verify login operation
        String currentUrl = driver.getCurrentUrl();

        if (currentUrl.contains("timetrack/enter.do"))
        {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
        driver.close();
    }
}
