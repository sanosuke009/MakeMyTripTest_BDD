package TestObjects;

public class ObjPicker {

	public static String get(String key)
	{
		String res = null;
		switch(key)
		{
		case "Login Button Popup" : res = PageObj.elmXPLoginButtonPopup; break;
		case "Search" : res =  PageObj.elmXPSearchButton; break;
		case "View Price" : res =  PageObj.elmXPFirstViewPrice; break;
		case "First View Price" : res =  PageObj.elmXPFirstViewPrice; break;
		case "Book Now" : res = PageObj.elmXPFirstBookNowButton; break;
		case "Review your booking" : res = PageObj.elmXPReviewYourBookingHeader; break;
		case "Advertisement Close" : res = PageObj.elmXPAdvertiseClose; break;
		case "Lock Price Pop Up" : res = PageObj.elmXPNowLockPricesPopUpCloseOKButton; break;

		case "Google Search" : res = PageObj.elmXPGoogleSearchInputField; break;
		case "First Search Result" : res = PageObj.elmXPGoogleSearchFirstResultTitle; break;
		
		default : res = "None"; 
		}
		return res;
	}
	
}
