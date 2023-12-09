package com.tka.incognito;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IncogNewAmazonAddCart {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		
		
		ChromeOptions op = new ChromeOptions();
		// configure options parameter to Chrome driver
		// Chrome Options class is used to manipulate various properties of Chrome driver
		
		
		op.addArguments("--incognito");
		
		// add Incognito parameter
		//addArguments() is the method to configure the AbstractDriverOptions
		//to manage the firefox specific settings in a way that geckodriver can understand using an instance of FirefoxOptions Class. 
		//As an example: FirefoxOptions option=new FirefoxOptions(); options.addArguments("start-maximized");
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		// DesiredCapabilities object
		//Desired Capabilities is a class used to declare a set of basic requirements such as combinations of browsers,
		//operating systems, browser versions, etc. 
		//to perform automated cross browser testing of a web application.
		//Desired Chrome Capabilities class provides a set of
		//key-value pairs to modify individual properties of web driver such as browser name, browser platform, etc.
		
		cap.setCapability(ChromeOptions.CAPABILITY, cap);
		 //set capability is a method to browser 
		
		WebDriver driver = new ChromeDriver(op);
		driver.get("https://www.amazon.in/");
		String sq= driver.getTitle();
		System.out.println(sq);
		
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]")).click();
		String title1 = driver.getTitle();
        System.out.println("title 1 : " + title1);
        //click sign in page
	    
	    //driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[1]/input[1]")).sendKeys("9423591967");
	    driver.findElement(By.xpath("//*[starts-with(@type,'email')]")).sendKeys("9423591967");
	    String title2 = driver.getTitle();
        System.out.println("title 2 mb no : " + title2);
        //sign in with mobile no
        
        
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[2]/div[1]/form/div/div/div/div[2]/span/span/input")).click();
	    String title3 = driver.getTitle();
        System.out.println("title 3 click : " + title3);
        //sign in click

        driver.findElement(By.xpath("//*[contains(@type,'pass')]")).sendKeys("sukode@1278");
        String title4 = driver.getTitle();
        System.out.println("title 4 pass : " + title3);
        
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div[1]/div[2]/div/form/div/div[2]/span/span/input")).click();
	    String title5 = driver.getTitle();
        System.out.println("title 5 pass click : " + title5);
        //sign in click (password)
        
	    driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/div/div[2]/div/ul/li[2]/span/a/div[1]/div/img")).click();
	    String title6 = driver.getTitle();
        System.out.println("title 6 click product : " + title6);
        //click on product
	    
        //comment added to check conflict on git
	    driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div/div[2]/div/div[2]/ul/li[1]/span/div/div[1]/a/div")).click();
	    String title7 = driver.getTitle();
        System.out.println("title 7 select product click : " + title7);
	    //select on product and click on
        //System.out.println("title 7 select product click : " + title7);
        
        
	    driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[5]/div[3]/div[1]/div[3]/div/div[1]/div/div/div/form/div/div/div/div/div[3]/div/div[35]/div[1]/span/span/span/input")).click();
	    String title8 = driver.getTitle();
        System.out.println("title 8 add cart : " + title8);
	    //add to cart
        
	    driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[3]/div/a[5]/div[1]/span[1]")).click();
	    String title9 = driver.getTitle();
        System.out.println("title 9 cart : " + title9);
        //show cart shopping
	}

}
