package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features" ,
        glue = "stepDefinitions" ,
        tags = "@wip" ,
        dryRun = false
)


public class Runner {



}

/*
Runner class is an empty class in Cucumber Framweor
We need to add to annotations to this class so it can act

@RunWith : This one comes from JUnit Dependency. With this annotation we can run the code by using the class name

@CucumberOptions : with this annotation we can add a lot of different options. But its first purpose is showing the
stepDefinitins path and feature files path.

tags : just like TestNG group names, we can give a tag to  test scenarios, By using these tags we can run them from
runner class. We can run a lot of test scenarios at the same time

dryRun = if we want to define only missing methods, we can run our tags with true option. When we do that, runner class
will not try to execute the code, Instead it will only return missing methods' definitions.
*** if we forget it to change false after creating methods, it will give you "pass" result with out executing the code

if it is false it will execute the code normaly
 */
