package Runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@Cucumber.Options(features="features",glue={"Es"})
/*@Options(features="features",glue={"Es"})*/
public class TestRunner {

}
