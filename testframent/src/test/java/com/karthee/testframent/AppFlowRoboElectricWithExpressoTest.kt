package com.karthee.testframent



import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class AppFlowRoboElectricWithExpressoTest {


    @get:Rule
    val activityTest = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun testAppFlow() {

        assert(BuildConfig.DEBUG)

        val enterDetails = onView(withId(R.id.btnEnterDetails))

        val submitDetails = onView(withId(R.id.btnSubmit))
        val oldUsername = onView(withId(R.id.etOldUsername))
        val newUserName = onView(withId(R.id.etNewUsername))
        val success = onView(withId(R.id.tvSuccess))

        enterDetails.check(matches(isDisplayed()))

        enterDetails.perform(click())

        oldUsername.check(matches(isDisplayed()))

        oldUsername.perform(typeText("karthee"))

        newUserName.check(matches(isDisplayed())).perform(typeText("android"))

        submitDetails.perform(click())

        success.check(matches(isDisplayed()))

        success.check(matches(withText("Success")))

    }
}