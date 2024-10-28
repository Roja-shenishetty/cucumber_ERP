package commonFunctions;

import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class FunctionLibrary {
	public static WebDriver driver;
	public static Properties conpro;
	
	
	public static WebDriver startBrowser() throws Throwable
	{
		conpro=new Properties();
		conpro.load(new FileInputStream("./PropertiesFiles/Environment.properties"));
	    if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
	    {
	    	driver=new ChromeDriver();
	    	driver.manage().window().maximize();
	    }
	    else if(conpro.getProperty("Browser").equalsIgnoreCase("Edge"))
	    {
	    	driver=new EdgeDriver();
	    	driver.manage().window().maximize();
	    }
	    else
	    {
	    	Reporter.log("Browser value not matching");
	    }
		return driver;
	}
	
	public static void openUrl()
	{
		driver.get(conpro.getProperty("url"));
		
	}
	
	public static void waitForElement(String ltype,String lvalue,String myWait)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(Integer.parseInt(myWait)));
		if(ltype.equalsIgnoreCase("xpath"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(lvalue)));
			
		}
		if(ltype.equalsIgnoreCase("name"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(lvalue)));
			
		}
		if(ltype.equalsIgnoreCase("id"))
		{
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(lvalue)));
			
		}
	}
	
	public static void typeAction(String ltype,String lvalue,String tdata)
	{
		if(ltype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(lvalue)).clear();
			driver.findElement(By.xpath(lvalue)).sendKeys(tdata);
			
		}
	    if(ltype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(lvalue)).clear();
			driver.findElement(By.name(lvalue)).sendKeys(tdata);
		}
		if(ltype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(lvalue)).clear();
			driver.findElement(By.id(lvalue)).sendKeys(tdata);
		}
	}
	
	public static void clickAction(String ltype,String lvalue)
	{
		if(ltype.equalsIgnoreCase("xpath"))
		{
			driver.findElement(By.xpath(lvalue)).click();
		}
		if(ltype.equalsIgnoreCase("name"))
		{
			driver.findElement(By.name(lvalue)).click();
		}
		if(ltype.equalsIgnoreCase("id"))
		{
			driver.findElement(By.id(lvalue)).sendKeys(Keys.ENTER);
		}
		
	}
	
	
	public static void captureSup(String ltype,String lvalue) throws Throwable
	{
		String supplierNum="";
		if(ltype.equalsIgnoreCase("xpath"))
		{
			supplierNum=driver.findElement(By.xpath(lvalue)).getAttribute("value");
		}
		if(ltype.equalsIgnoreCase("name"))
		{
			supplierNum=driver.findElement(By.name(lvalue)).getAttribute("value");
		}
		if(ltype.equalsIgnoreCase("id"))
		{
			supplierNum=driver.findElement(By.id(lvalue)).getAttribute("value");
		}
		
		FileWriter fw=new FileWriter("./CaptureData/supplierNum.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(supplierNum);
		bw.flush();
		bw.close();
	}
	
	
	public static void supplierTable() throws Throwable
	{
		FileReader fr=new FileReader("./CaptureData/supplierNum.txt");
		BufferedReader br=new BufferedReader(fr);
		String Exp_data=br.readLine();
		
		if(!driver.findElement(By.xpath(conpro.getProperty("searchText"))).isDisplayed())
			driver.findElement(By.xpath(conpro.getProperty("searchIcon"))).click();
		driver.findElement(By.xpath(conpro.getProperty("searchText"))).clear();
		driver.findElement(By.xpath(conpro.getProperty("searchText"))).sendKeys(Exp_data);
		driver.findElement(By.xpath(conpro.getProperty("searchBtn"))).click();
		
		String Act_data=driver.findElement(By.xpath(("//table[@class='table ewTable']/tbody/tr[1]/td[6]/div/span/span"))).getText();
		try {
			Assert.assertEquals(Exp_data, Act_data,"Supplier Number not found");
			Reporter.log(Exp_data+"     "+Act_data);
		} catch (AssertionError e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			
		}
		
	 }
	
	public static void captureCus(String ltype,String lvalue) throws Throwable
	{
		String customerNum="";
		if(ltype.equalsIgnoreCase("xpath"))
		{
			customerNum=driver.findElement(By.xpath(lvalue)).getAttribute("value");
		}
		if(ltype.equalsIgnoreCase("name"))
		{
			customerNum=driver.findElement(By.name(lvalue)).getAttribute("value");
		}
		if(ltype.equalsIgnoreCase("id"))
		{
			customerNum=driver.findElement(By.id(lvalue)).getAttribute("value");
		}
		
		FileWriter fw=new FileWriter("./CaptureData/customerNum.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(customerNum);
		bw.flush();
		bw.close();
	}
	
	
	public static void customerTable() throws Throwable
	{
		FileReader fr=new FileReader("./CaptureData/customerNum.txt");
		try (BufferedReader br = new BufferedReader(fr)) {
			String Exp_data=br.readLine();
			
			if(!driver.findElement(By.xpath(conpro.getProperty("searchText"))).isDisplayed())
				driver.findElement(By.xpath(conpro.getProperty("searchIcon"))).click();
			driver.findElement(By.xpath(conpro.getProperty("searchText"))).clear();
			driver.findElement(By.xpath(conpro.getProperty("searchText"))).sendKeys(Exp_data);
			driver.findElement(By.xpath(conpro.getProperty("searchBtn"))).click();
			
			String Act_data=driver.findElement(By.xpath(("//table[@class='table ewTable']/tbody/tr[1]/td[5]/div/span/span"))).getText();
			try {
				Assert.assertEquals(Exp_data, Act_data,"customer Number not found");
				Reporter.log(Exp_data+"     "+Act_data);
			} catch (AssertionError e) {
				// TODO: handle exception
				System.out.println(e.getMessage());
				
			}
		}
		
		
		
	 }
	
	
	   public static void closeBrowser()
	   {
		driver.quit();
	   }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
