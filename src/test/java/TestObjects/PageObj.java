package TestObjects;

import TestManagers.ConfigManager;

public class PageObj {
	
	//Objects of Home Page of MakeMyTrip
	public static String elmXPModalElement = "//div[@data-cy='outsideModal']";
	public static String elmXPLoginButton = " //div/p[contains(text(),'Login or Create Account')]//ancestor::li";
	public static String elmXPFlightButton = "(//span[contains(@class,'Flights')])[1]";
	public static String elmXPSearchButton = "//a[text()='Search']";
	public static String elmXPDestinationTab = "//label[@for='toCity']";
	public static String elmXPFutureDate = "(//div[@class='DayPicker-Month'])[2]//descendant::p[text()='20']//parent::div";
	public static String elmXPFutureDateSet = "(//p[@data-cy='departureDate']/span[text()='20'])[1]";
	public static String elmXPDestinationLink = "(//div/p[contains(text(),'"+ConfigManager.configGet("Dest_city")+"')])[1]";
	
	//Objects of Search Page of MakeMyTrip
	public static String elmXPFirstViewPrice = "(//div//descendant::button[text()='View Prices'])[1]";
	public static String elmXPFirstBookNowButton = "((//div//descendant::button[text()='Hide Prices'])[1]"
			+ "//ancestor::div[contains(@class,'card-upperpart')]//following-sibling::div[contains(@class,'viewFaresOuter')"
			+ "]//button[contains(text(),'Book Now')])[1]";
	
	//Objects of Book Now Page of MakeMyTrip
	public static String elmXPReviewYourBookingHeader = "//h4[contains(text(),'Review your booking')]";

}
