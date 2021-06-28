package com.unicom.cucumbertest.test;

import io.cucumber.android.runner.CucumberAndroidJUnitRunner;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
        features = "features",
        glue = "com.unicom.cucumbertest.test.steps",
        strict = true
)
public class Runner extends CucumberAndroidJUnitRunner {
}
