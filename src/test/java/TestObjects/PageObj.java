package TestObjects;

import TestManagers.ConfigManager;

public class PageObj {
	
	//Objects of Home Page of MakeMyTrip
	public static String elmXPLoginButtonPopup = "//div[contains(@class, 'loginModal displayBlock')]";
	public static String elmXPAdvertiseClose = "//span[@class='langCardClose']";
	public static String elmXPModalElement = "//div[@data-cy='outsideModal']";
	public static String elmXPLoginButton = " //div/p[contains(text(),'Login or Create Account')]//ancestor::li";
	public static String elmXPFlightButton = "(//span[contains(@class,'Flights')])[1]";
	public static String elmXPSearchButton = "//a[text()='Search']";
	public static String elmXPDestinationTab = "//label[@for='toCity']";
	public static String elmXPFutureDate = "(//div[@class='DayPicker-Month'])[2]//descendant::p[text()='"+ConfigManager.configGet("future_date")+"']//parent::div";
	public static String elmXPFutureDateSet = "(//p[@data-cy='departureDate']/span[text()='20'])[1]";
	public static String elmXPDestinationLink = "(//div/p[contains(text(),'"+ConfigManager.configGet("Dest_city")+"')])[1]";
	
	//Objects of Search Page of MakeMyTrip
	public static String elmXPNowLockPricesPopUp = "//p[contains(text(),'Now Lock')]";
	public static String elmXPNowLockPricesPopUpCloseOKButton = "//button[contains(text(),'OKAY, GOT IT')]";
	public static String elmXPFirstViewPrice = "(//div//descendant::span[text()='View Prices'])[1]";
	public static String elmXPFirstBookNowButton = "((//div//descendant::span[text()='Hide Prices'])[1]"
													+"//ancestor::div[contains(@class,'fli-list')]//"
													+"following-sibling::button[contains(text(),'Book Now')])[1]";
	
	//Objects of Book Now Page of MakeMyTrip
	public static String elmXPReviewYourBookingHeader = "//h2[contains(text(),'Complete your booking')]";

	//Objects of Google Search
	public static String elmXPGoogleSearchInputField = "//input[@title='Search']";
	public static String elmXPGoogleSearchFirstResultTitle = "(//div[contains(@class,'TzHB6b cLjAic ')])[1]/descendant::h3";

}
