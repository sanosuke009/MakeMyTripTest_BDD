# MakeMyTripTest_BDD
Open Flight Booking Page of MakeMyTrip and Book A Flight. Validate Review Booking.

cucumber maven report generation:

1. In testRunner, add plugin = {"json:Results/cucumberjson/cucumber.json"} inside @CucumberOptions
to generate usual report
2. plugin = {"pretty",
    "html:target/report/cucumber.html",
    "json:target/report/cucumber.json"} 
    to generate a different type of report
3. 