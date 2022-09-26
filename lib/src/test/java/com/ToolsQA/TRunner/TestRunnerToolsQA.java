package com.ToolsQA.TRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\ToolsQA.feature", 
glue = "com.ToolsQA.steps")

public class TestRunnerToolsQA {

}
