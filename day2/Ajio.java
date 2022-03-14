package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://www.ajio.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //In the search box, type as "bags" and press enter
		 WebElement search = driver.findElement(By.xpath("//input [@name = 'searchVal']"));
		 search.sendKeys("bags",Keys.ENTER);
		 Thread.sleep(2000);
		 
		 //To the left  of the screen under " Gender" click the "Men"
		 driver.findElement(By.xpath("//label[@for='Men']")).click();
		 Thread.sleep(2000);
		 
		 //Under "Category" click "Fashion Bags"
		 driver.findElement(By.xpath("//label [contains(text(),'Fashion Bags')]")).click();
		 
		 
		 //Print the count of the items Found. 
		 String text = driver.findElement(By.xpath("//div [@class = 'length']")).getText();
		 System.out.println(text);
		 
		 //Get the list of brand of the products displayed in the page and print the list.
		 List <WebElement> list = driver.findElements(By.xpath("//div [@class ='brand']"));
		 System.out.println("Total # of Brand of the products displayed in the page " +list.size());
		 
		 Set<String>  brandName = new HashSet<String>();
		 //Set<WebElement>  brandName1 = new HashSet<WebElement>(list);
		 
		 for (WebElement eachList : list)
		 {
			 brandName.add(eachList.getText());
			 System.out.println(" Brand Name from the List: " +eachList.getText());
		 }
		 
		 
		 //Get the list of names of the bags and print it
		 List <WebElement> bag = driver.findElements(By.xpath("//div [@class ='nameCls']"));
		 System.out.println("Total # of Bag of the products displayed in the page " +list.size());
		 
		 Set <String> bagName = new HashSet<String>();
		 for (WebElement eachBag : bag)
		 {
			 bagName.add(eachBag.getText());
			 System.out.println("Printing the Bag Name form the List: " +eachBag.getText());
		 }
	
	Map<String,String> mapBrand = new LinkedHashMap<String,String>();
	Map<WebElement,WebElement> mapBrandWebElement = new LinkedHashMap<WebElement,WebElement>();
	

	for (int i =0 ; i< bagName.size(); i++)
	{
		mapBrand.put(list.get(i).getText(), bag.get(i).getText());
		mapBrandWebElement.put(list.get(i), bag.get(i));
	}
	
	
	Set <Entry<WebElement,WebElement>> entrySetWebElement = mapBrandWebElement.entrySet();
	for (Entry<WebElement,WebElement> entry : entrySetWebElement)
	{
		System.out.println(entry.getKey().getText()+"--->"+entry.getValue().getText());
		
	}

	}

}
