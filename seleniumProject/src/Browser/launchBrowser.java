package Browser;


import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

    public static void main(String[] args) {
        //launch browser
        ChromeDriver driver = new ChromeDriver();

        driver.get( "https://parabank.parasoft.com/");
       driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.println("title of webpage:" +title);

        String currenturl = driver.getCurrentUrl();
        System.out.println("current url:" +currenturl);
        //Thread.sleep(3000);
    }
}
