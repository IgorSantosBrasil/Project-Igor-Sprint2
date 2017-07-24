package com.project.igor.runtests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by dell on 24.7.2017 г..
 * On this class will run
 */

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        tags = {"@Igor1"},
        features = "src/test/resources/features",
        glue = {"com.project.igor.stepsdefs"})


public class RunTest {
}
