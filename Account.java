
import java.io.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Account {
	public static void main(String[] args) throws InterruptedException,IOException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Chrome\\chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.id("username")).sendKeys("aman.singh@cloudanalogy.com");
		   Thread.sleep(1000);
		   driver.findElement(By.id("password")).sendKeys("Bawa7800");
		   Thread.sleep(1000);
		   driver.findElement(By.id("Login")).click();
		   Thread.sleep(2000);
		   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		  // Scanner sc = new Scanner(System.in);
		   System.out.println("Enter your rollno");
		   String a= in.readLine();
		   driver.findElement(By.id("emc")).sendKeys(a);
		   Thread.sleep(1000);
		   
		   driver.findElement(By.id("save")).click();
		   Thread.sleep(1000);
		   //I have done changes
		   driver.get("https://ap5.lightning.force.com/one/one.app#/setup/SetupOneHome/home");
		   driver.findElement(By.name("Account_Tab")).click();
		   Thread.sleep(500);
		   System.out.println("Succefully Run Account Tab");
		   //driver.get("https://shwetaa-dev-ed.my.salesforce.com/001/e?retURL=%2F001%2Fo");
		// Thread.sleep(2000);
		 //driver.findElement(By.id("tryLexDialogX")).click();
	//	 Thread.sleep(1000);
		   driver.findElement(By.id("tryLexDialogX")).click();
		   Thread.sleep(500);
		   System.out.println("Succefully Run Dialog Box");
		 driver.findElement(By.name("new")).click();
		 Thread.sleep(2000);
}
} 
