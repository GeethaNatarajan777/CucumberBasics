package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFolder", glue= {"StepDefinitionss","Hook"}, dryRun= false, strict= false 
, monochrome= true, plugin = {"html:report/WebReport", "json:report/json_report.json", "junit:report/xmlreport.xml"},
tags= {"@BackgroundExample"} )



public class Run {

}
