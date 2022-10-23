package TestObjects;

public class ObjPicker {

	public static String get(String key)
	{
		String res = null;
		switch(key)
		{
		case "Search" : res =  PageObj.elmXPSearchButton; break;
		case "View Price" : res =  PageObj.elmXPFirstViewPrice; break;
		case "First View Price" : res =  PageObj.elmXPFirstViewPrice; break;
		case "Book Now" : res = PageObj.elmXPFirstBookNowButton; break;
		case "Review your booking" : res = PageObj.elmXPReviewYourBookingHeader; break;
		case "Advertisement Close" : res = PageObj.elmXPAdvertiseClose; break;
		case "Lock Price Pop Up" : res = PageObj.elmXPNowLockPricesPopUpCloseOKButton; break;
		
		default : res = "None"; 
		}
		return res;
	}
	
}
