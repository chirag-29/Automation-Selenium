
import java.text.SimpleDateFormat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.sun.org.apache.bcel.internal.generic.Select
import org.openqa.selenium.support.ui.Select;
public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		//Going to the URL and maximizing the screen
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		//Selecting Round trip
		
		driver.findElement(By.linkText("ROUND TRIP")).click();
		
		// Selecting the destination field
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("BE_flight_origin_city")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).click();
//		Thread.sleep(2000);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).sendKeys("Mumbai"+Keys.ENTER);
//		
//		
		
		// Selecting Source airport Mumbai
//		WebElement input = driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']"));
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		input.clear();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		input.click();
//		input.click();
//		input.sendKeys("Mumbai");
//		driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]/div[1]/p[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_city\"]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
//		driver.findElement(By.xpath("//*[@id='BE_flight_origin_city']")).sendKeys("Mumbai"+Keys.ENTER);
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='BE_flight_form_wrapper']/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[2]/div[1]/p[1]")).click();

		
		// Selecting Destination airport Bangalore
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[3]/div[1]/p[1]")).click();
		
		
	
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_origin_date\"]")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String d1 = "'21/08/2020'";
		String d2 = "'30/08/2020'";
		System.out.println(d1);
		System.out.println(d2);
		driver.findElement(By.xpath("//*[@id="+d1+"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id="+d2+"]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		//Selecting no of Passengers in this case 4
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"BE_flight_paxInfoBox\"]/span")).click();
		int noOfPass = 2;
		for(int i=1;i<noOfPass;i++){
			driver.findElement(By.xpath("//*[@id='BE_flight_passengerBox']/div[1]/div[1]/div/div/span[2]")).click();
		}
		
		
		//Selecting the travel class in this case premium economy
		String tClass = "premium economy"; //business,economy
		if (tClass=="economy") {
			driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[1]")).click();
		}
		else if(tClass=="premium economy") {
			driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[2]")).click();
		}
		else {
			driver.findElement(By.xpath("//*[@id=\"flight_class_select_child\"]/ul/li[3]")).click();
		}
		
		
		
		//Searching the flight
		driver.findElement(By.xpath("//*[@id='BE_flight_flsearch_btn']")).click();
		
		
		//Checking if both flights are displayed
		String date1 = driver.findElement(By.xpath("//*[@id=\'Flight-APP\']/section/section[2]/section[1]/div[2]/section/div[1]/div/div[1]/p[2]")).getText();
		System.out.println(date1);
		String date2 = driver.findElement(By.xpath("//*[@id=\"Flight-APP\"]/section/section[2]/section[1]/div[2]/section/div[2]/div/div[1]/p[2]")).getText();
		System.out.println(date2);
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		
		
		//Selecting the flights
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'fare-BOMDEL6999420200821_UPDELBLR6981920200821_UP_GALDOM\']/div[2]")).click();		
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//*[@id=\"fare-BLRDEL6982020200830_UPDELBOM6993320200831_UP_GALDOM\"]")).click();	
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		//Booking flight
		driver.findElement(By.xpath("//*[@id=\'Flight-APP\']/section/section[3]/div/div[2]/div[2]/button")).click();		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		
		
		//Entering the details
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"additionalContactEmail\"]")).click();
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\"additionalContactEmail\"]")).sendKeys("chiragp291198@gmail.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'additionalContactMobile\']")).click();
		driver.findElement(By.xpath("//*[@id=\'additionalContactMobile\']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//*[@id=\'traveller-dom\']/form/div[1]/div[1]/div/article/div[4]/div/div/label[1]")).click();
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\'title0\']")); 
		Select select = new Select(element); 
		select.selectByValue("Mr");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\'title1\']")); 
		Select select2 = new Select(element2); 
		select2.selectByValue("Mrs");
		
		String[] fname = {"John","XYZ"};
		String[] lname = {"Doe","abc"};
		
		
		for(int i=0; i<noOfPass; i++) {
			driver.findElement(By.xpath("//*[@id=\'travellerf"+i+"\']")).sendKeys(fname[i]);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'travellerl"+i+"\']")).sendKeys(lname[i]);
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		}
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		try {
			Thread.sleep(4000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'gtm_saveflightreview\']")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\'popupdata\']/div/div[4]/input[1]")).click();
		
		
	}

}
