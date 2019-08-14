package SeleniumWithJava.SeleniumWithJava;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class App {

	public static void main(String[] args) {

		//System.setProperty("webdriver.gecko.driver", "/home/omni/.local/share/gecko_driver/geckodriver");
		
		System.setProperty("webdriver.chrome.driver", "/home/omni/.local/share/crome_driver/chromedriver_linux64/chromedriver");
		
	
		WebDriver driver = new ChromeDriver();
		 WebDriverWait wait = new WebDriverWait(driver,50);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://accounts.google.com/");
		 driver.findElement(By.id("identifierId")).sendKeys("madhavi.cse34@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("xxxxxxx");
		//driver.findElement(By.id("passwordNext")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
        driver.findElement(By.xpath("//span[text()='Next']")).click();
	
	
		
		
		
//		
//		WebDriver driver;
//	    driver = new FirefoxDriver();
//	    driver.get("http://www.google.com");
//	    driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//
//	    WebElement oSearchField = driver.findElement(By.name("q"));
//	    oSearchField.sendKeys("Selenium");
//
//	    WebElement oButton = driver.findElement(By.name("btnG"));
//	    oButton.click();
//	    WebElement oPrevious;
//	    oPrevious = driver.findElement(By.xpath("//td[@class='b navend']/a[@id='pnprev']"));
//
//	    if (!oPrevious.isDisplayed()){
//	        System.out.println("First Page of GoogleResults");
//	    }
		
		
		
		
		
		
//		WebDriver driver=new ChromeDriver();
//		//HtmlUnitDriver driver = new HtmlUnitDriver();
//        driver.manage().window().maximize();
//        driver.get("http://www.google.com");
//
//        System.out.println("The webpage name is :"+ driver.getTitle());
//        WebElement text =driver.findElement(By.name("q"));
//        text.sendKeys("Big Basket");
//        text.submit();
//        try {
//       // driver.findElement(By.id("gbqfq")).sendKeys("Big Basket");
//        driver.findElement(By.name("btnG")).click();
//        driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/table/tbody/tr[4]/td[1]/div/span/h3/a")).click();
//        System.out.println("The webpage name is :"+ driver.getTitle()); 
//
//        driver.get("http://bigbasket.com/");
//        WebElement element=driver.findElement(By.id("ftv-city-selectboxdiv"));
//        Select se=new Select(element);
//        se.selectByVisibleText("Bangalore");
//
//        driver.findElement(By.id("area_selection")).clear();
//        WebElement element1=driver.findElement(By.id("area_selection"));
//        Select se1=new Select(element1);
//        se1.selectByVisibleText("Jayanagar 4 Block, Bengaluru, Karnataka, India");
//        driver.findElement(By.id("area_selection")).sendKeys("Jayanagar 4 Block, Bengaluru, Karnataka, India");
//        driver.findElement(By.id("area_selection")).equals("Jayanagar 4 Block, Bengaluru, Karnataka, India");
//        driver.findElement(By.xpath("#set_visitor_address")).click();
//
//        driver.findElement(By.id("id_q")).clear();
//        driver.findElement(By.id("id_q")).sendKeys("Apples");
//        driver.findElement(By.xpath("//*[@id='auto_search']/div/form/input[2]")).click();
//
//        driver.close();
//        driver.quit();  
//        }
//        catch(Exception e) {
//        	e.printStackTrace();
//        }
//		
		
		
		
		
		
//		WebDriver driver=new FirefoxDriver();
//        driver.get("http://www.google.com");
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cheese");   
//        driver.findElement(By.xpath("//button[@name='btnG']")).click();
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
//        driver.findElement(By.xpath("(//h3[@class='r']/a)[3]")).click();
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); 
//		
		
		
		
		
		
		
//		WebDriver driver = new FirefoxDriver();
//	    driver.get("http://www.google.com");
//	    WebElement element = driver.findElement(By.name("q"));
//	    element.sendKeys("Cheese!\n"); // send also a "\n"
//	    element.submit();

	    //driver1.findElement(By.xpath(".//*[@id='rso']/li[3]/div/h3/a")).click();
		
		
//		driver.get("http://www.google.com"); 
//        WebElement element = driver.findElement(By.name("q"));
//        element.sendKeys("Cheese!");
//        element.submit();
        
        
        

//		String baseUrl = "http://www.google.com/";
//
//		String expectedTitle = "Google";
//
//		String actualTitle = "";
//		driver.get(baseUrl);
//		actualTitle = driver.getTitle();
//		if (actualTitle.contentEquals(expectedTitle)) {
//
//			System.out.println("Test Passed!");
//
//		} else {
//
//			System.out.println("Test Failed");
//
//		}
//
//		driver.close();
//		//System.exit(0);

	}

}
