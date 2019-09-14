package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/deleteBooking.feature"},
		glue = {"bindings"}
)
public class BookingTestRunner
{

}
