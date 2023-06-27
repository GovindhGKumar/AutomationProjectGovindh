package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Sitepage {
	ChromeDriver cd;
	
	By login=By.xpath("//*[@id=\"masthead\"]/div/div/div[3]/ul/li[1]/a");
	By username=By.xpath("//*[@id=\"username\"]");
	By pswrd=By.xpath("//*[@id=\"password\"]");
	By loginbtn=By.xpath("//*[@id=\"customer_login\"]/div[1]/form/p[4]/button");   
	By homelogo=By.xpath("//*[@id=\"masthead\"]/div/div/div[2]/a");
	By men=By.xpath("//*[@id=\"menu-item-336215\"]/a");
	By ptshirt=By.xpath("//*[@id=\"menu-item-345164\"]/a");
	By kadhtshirt=By.xpath("//*[@id=\"post-345151\"]/div/section/div[5]/div/div/div/div[2]/div/ul/li[13]/h3/a");
	By size=By.xpath("//*[@id=\"product-398697\"]/div[2]/div[2]/form/div[1]/div[1]/div/span[2]/div/ul/li[4]/span");
	By quantity=By.xpath("//*[@id=\"product-398697\"]/div[2]/div[2]/form/div[2]/div[4]/div[1]/span[2]");
	By addcart=By.xpath("//*[@id=\"product-398697\"]/div[2]/div[2]/form/div[2]/div[4]/button");
	By cartbutton=By.xpath("//*[@id=\"masthead\"]/div/div/div[3]/ul/li[2]/a");  
	By checkout=By.xpath("//*[@id=\"post-7\"]/div/div/div[2]/div/div[1]/a");
	By firstnamefeild=By.xpath("//*[@id=\"billing_first_name\"]");
	By lastname=By.xpath("//*[@id=\"billing_last_name\"]");
	By address=By.xpath("//*[@id=\"billing_address_1\"]");
	By town=By.xpath("//*[@id=\"billing_city\"]");
	By state=By.xpath("//*[@id=\"billing_state\"]");
	By PIN=By.xpath("//*[@id=\"billing_postcode\"]");
	By phoneno=By.xpath("//*[@id=\"billing_phone\"]");
	By email=By.xpath("//*[@id=\"billing_email\"]");
	By contactus=By.xpath("//*[@id=\"menu-item-1911\"]/a");
	By directions=By.xpath("//*[@id=\"mapDiv\"]/div/div/div[4]/div/div/div/div/div[4]/div");
	By fb=By.xpath("//*[@id=\"widget_sp_image-26\"]/a");
	By ordertrack=By.xpath("//*[@id=\"menu-item-349823\"]/a");
	By ordernumberin=By.xpath("//*[@id=\"orderID\"]");
	By submit=By.xpath("//*[@id=\"content\"]/div/section/div[2]/div/div/div/div[4]/div/div/form/input[3]");
	By homebtnlogo=By.xpath("//*[@id=\"masthead\"]/div/div/div[2]/a");
	By logout=By.xpath("//*[@id=\"masthead\"]/div/div/div[3]/ul/li[1]/a");
	By logoutbutton=By.xpath("//*[@id=\"post-9\"]/div/div/div/p[1]/span/a");
	
	public Sitepage(ChromeDriver cd)
	{
		this.cd=cd;
	}
	
	
	
	public void login(String n,String k)
	{
		cd.findElement(login).click();
		cd.findElement(username).sendKeys(n);
		cd.findElement(pswrd).sendKeys(k);
		cd.findElement(loginbtn).click();
		cd.findElement(homelogo).click();
	}
	public void shirtselection()
	{
		cd.findElement(men).click();
		cd.findElement(ptshirt).click();
		
		//JavascriptExecutor js=(JavascriptExecutor)cd;
		//js.executeScript("arguments[0].scrollintoView(true);", kadhtshirt);
		
		
		cd.findElement(kadhtshirt).click();
		cd.findElement(size).click();
		cd.findElement(quantity).click();
		cd.findElement(addcart).click();
	}
	public void cart()
	{
		cd.findElement(cartbutton).click();
		cd.findElement(checkout).click();
		cd.findElement(firstnamefeild).sendKeys("Rahul");
		cd.findElement(lastname).sendKeys("R");
		cd.findElement(address).sendKeys("House 123");
		cd.findElement(town).sendKeys("Kochi");
		
		Select s=new Select(cd.findElement(state));
		s.selectByVisibleText("Kerala");
		
		cd.findElement(PIN).sendKeys("687415");
		cd.findElement(phoneno).sendKeys("5236472149");
		cd.findElement(email).sendKeys("hgbn@fkl");
		
	}
	
	public void contactus()
	{
		cd.findElement(homelogo).click();
		cd.findElement(contactus).click();
		String s=cd.getWindowHandle();
		
		cd.findElement(fb).click();
		Set<String>w=cd.getWindowHandles();
		for(String wh:w)
		{
			if(!wh.equalsIgnoreCase(s))
			{	
				cd.switchTo().window(s);
				
			}
		}
		
		}
	public void trackorder()
	
	{
		cd.findElement(ordertrack).click();
		cd.findElement(ordernumberin).sendKeys("2548");
		cd.findElement(submit).click();
		cd.findElement(homebtnlogo).click();
	}
	public void logout()
	{
		
		cd.findElement(logout).click();
		cd.findElement(logoutbutton).click();
		cd.quit();
		
	
	
	
	
	

}
}
