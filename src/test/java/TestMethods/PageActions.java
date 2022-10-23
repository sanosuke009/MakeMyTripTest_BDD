package TestMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestBaseClass.BaseC;
import TestManagers.ReportingManager;
import TestObjects.ObjPicker;
import TestObjects.PageObj;

public class PageActions {
	
	public static boolean waitforSearchElement()
	{
		boolean res = false;
		//Waitin for the search button to load
		
		try {
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPSearchButton)));
			WebElement el = BaseC.driver.findElement(By.xpath(PageObj.elmXPSearchButton));
			if(el.isDisplayed())
			{
				res =true;
				ReportingManager.printInReport("The Flight Page and the Search Button is displayed.");
			}
			else
			{
				ReportingManager.printInReport("The Flight Page and the Search Button is NOT displayed.");
			}
			ReportingManager.takeScreenShot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = false;
			e.printStackTrace();
		}
		return res;
		
	}
	
	public static boolean ClickOnDestination()
	{
		boolean res = false;
		//Waitin for the search button to load
		
		try {
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPDestinationTab)));
			
			for(int i=0;i<2;i++)
			{
				WebElement el = BaseC.driver.findElement(By.xpath(PageObj.elmXPDestinationTab));
			
				try {
			
			el.click();
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPDestinationLink)));
			WebElement el1 = BaseC.driver.findElement(By.xpath(PageObj.elmXPDestinationLink));
			if(el1.isDisplayed())
			{
				res=true;
				System.out.println("Clicked successfully");
			}
				}
				catch(ElementClickInterceptedException ex)
				{
					res=false;
					System.out.println("Caught intercepted ClickException");
					//ex.printStackTrace();
					BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPModalElement)));
					WebElement el2 = BaseC.driver.findElement(By.xpath(PageObj.elmXPModalElement));
					el2.click();
				}
				if(res)
				{
					break;
				}
			}
			
			WebElement el11 = BaseC.driver.findElement(By.xpath(PageObj.elmXPDestinationLink));
			el11.click();
			
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPFutureDate)));
			WebElement el2 = BaseC.driver.findElement(By.xpath(PageObj.elmXPFutureDate));
			
			if(el2.isDisplayed())
			{
				res =true;
				System.out.println("The Destination Option is clicked.");
			}
			else
			{
				ReportingManager.printInReport("The Destination Option is NOT clicked.");
			}
			ReportingManager.takeScreenShot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = false;
			e.printStackTrace();
		}
		return res;
		
	}
	
	
	public static boolean ClickOnFutureDate()
	{
		boolean res = false;
		//Waitin for the search button to load
		
		try {
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPFutureDate)));
			WebElement el = BaseC.driver.findElement(By.xpath(PageObj.elmXPFutureDate));
			el.click();
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPFutureDateSet)));
			WebElement el1 = BaseC.driver.findElement(By.xpath(PageObj.elmXPFutureDateSet));
						
			if(el1.isDisplayed())
			{
				res =true;
				System.out.println("The future date is selected.");
			}
			else
			{
				ReportingManager.printInReport("The future date is NOT selected.");
			}
			ReportingManager.takeScreenShot();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			res = false;
			e.printStackTrace();
		}
		return res;
		
	}
	
	public static boolean validateReviewYourBooking()
	{
		boolean res = false;
		try {
			Set<String> windows = BaseC.driver.getWindowHandles();
			for(String s : windows)
			{
				BaseC.driver.switchTo().window(s);
			}
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(PageObj.elmXPReviewYourBookingHeader)));
			WebElement el = BaseC.driver.findElement(By.xpath(PageObj.elmXPReviewYourBookingHeader));
			if(el.isDisplayed()) {res=true;ReportingManager.printInReport("The Review Your Booking header is displayed.");}
			else
			{
				ReportingManager.printInReport("The Review Your Booking header is NOT displayed.");
			}
			ReportingManager.takeScreenShot();
		} catch (Exception e) {
			res = false;
			e.printStackTrace();
		}
		return res;
		
	}
	
	public static boolean ClickOnButton(String buttonName)
	{
		boolean res = false;
		try {
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ObjPicker.get(buttonName))));
			WebElement el = BaseC.driver.findElement(By.xpath(ObjPicker.get(buttonName)));
			el.click();
				ReportingManager.printInReport("The "+buttonName+" Button is clicked.");
				ReportingManager.takeScreenShot();
			res=true;
		} catch (Exception e) {
			res = false;
			ReportingManager.printInReport("The "+buttonName+" Button is NOT clicked.");
			ReportingManager.takeScreenShot();
			e.printStackTrace();
		}
		return res;
		
	}
	
	public static boolean validateButton(String buttonName)
	{
		boolean res = false;
		try {
			BaseC.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(ObjPicker.get(buttonName))));
			WebElement el = BaseC.driver.findElement(By.xpath(ObjPicker.get(buttonName)));
			if(el.isDisplayed()) {res=true;ReportingManager.printInReport("The "+buttonName+" is displayed.");}
			else
			{
				ReportingManager.printInReport("The "+buttonName+" is NOT displayed.");
			}
			ReportingManager.takeScreenShot();
		} catch (Exception e) {
			res = false;
			e.printStackTrace();
			ReportingManager.takeScreenShot();
		}
		return res;
		
	}

}
