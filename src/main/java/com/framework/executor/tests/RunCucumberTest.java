/**
 * 
 */
package com.framework.executor.tests;

/**
 * @author surendrane
 *
 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue={"classpath:com/framework/executor/stepdefintions"}, plugin = {"pretty", "html:target/cucumber"})
public class RunCucumberTest {
}