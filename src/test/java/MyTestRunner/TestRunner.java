package MyTestRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.testng.TestNGCucumberRunner;



@CucumberOptions(
    features = "src/test/resources/MyFeatures/GoogleSearch.feature" 
    ,glue= {"StepDefinitions"}
    ,plugin = {"json:Results/cucumberjson/cucumber.json"}
    /* , plugin = {"pretty",
    "html:target/report/cucumber.html",
    "json:target/report/cucumber.json"} */
    //plugin = {"json:Results/cucumberjson/cucumber.json"}
    )

public class TestRunner extends AbstractTestNGCucumberTests{
    
	//private TestNGCucumberRunner testNGCucumberRunner;
 
    /* @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        
    }
 
    @AfterSuite(alwaysRun = true)
    public void teardownClass() throws Exception
    {
    	
    } */
    
    // @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    // public void feature(CucumberFeatureWrapper cucumberFeature) {
    //     testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    // }
 
    @DataProvider
    public Object[][] features() {
        //return testNGCucumberRunner.provideScenarios();
        return super.scenarios();
    }
 
    /* @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        testNGCucumberRunner.finish();
    } */
}
