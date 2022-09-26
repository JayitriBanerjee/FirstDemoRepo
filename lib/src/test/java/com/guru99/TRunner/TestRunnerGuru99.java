package com.guru99.TRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\guru99Demo.feature", tags="@tag5",
glue = "com.guru99.stepdef")
public class TestRunnerGuru99 {

	

}
