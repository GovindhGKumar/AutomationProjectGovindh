package test;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Sitepage;

public class Sitetest {
	ChromeDriver cd;
	
	@BeforeTest
	public void beftest()
	{
		cd=new ChromeDriver();
		cd.manage().window().maximize();
	}
	@BeforeMethod
	public void befmeth()
	{
		cd.get("https://www.mydesignation.com/");
	}
	@Test
	public void test() 
	{
		Sitepage sp=new Sitepage(cd);
		
		String z=cd.getTitle();
		String x="MYDESIGNATION Youngster Unisex Fashion Brand";			//Assertion
		Assert.assertEquals(z, x);
		System.out.println("The title of the tested website is - "+z);
		
		
		sp.login("GOVINDHG","govindh123");
		sp.shirtselection();
		sp.cart();
		sp.contactus();
		sp.trackorder();
		sp.logout();
		
		
		
		
	}

}
