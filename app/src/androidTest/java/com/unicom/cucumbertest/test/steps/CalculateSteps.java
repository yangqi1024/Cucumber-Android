package com.unicom.cucumbertest.test.steps;

import androidx.test.core.app.ActivityScenario;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import com.unicom.cucumbertest.MainActivity;
import com.unicom.cucumbertest.R;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class CalculateSteps {

    @Given("打开计算界面")
    public void 打开计算界面() {
        ActivityScenario.launch(MainActivity.class);
    }

    @Given("设置第一个加数为{string}")
    public void 设置第一个加数为(String number) {
        onView(withId(R.id.first_number)).perform(typeText(number));
    }

    @Given("设置第二个加数为{string}")
    public void 设置第二个加数为(String number) {
        onView(withId(R.id.second_number)).perform(typeText(number));
    }

    @When("执行相加操作")
    public void 执行相加操作() {
        onView(withId(R.id.calc)).perform(click());
    }

    @Then("两数相加结果为{string}")
    public void 两数相加结果为(String result) {
        onView(withId(R.id.sum)).check(matches(withText(result)));
    }
}
