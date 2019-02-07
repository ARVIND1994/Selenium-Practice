package newpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String baseurl = "http://demo.guru99.com/test/web-table-element.php";
		driver.get(baseurl);
		//WebElement text = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]"));
		List column = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("No. of columns are"  + column.size());
		
		List row  =  driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("No. of row"  +   row.size());
		                                      
		//System.out.println(text);
		driver.quit();
        
	    //	/html/body/div/div[3]/div[1]/table/thead/tr/th[1]   
	      
	}

}
