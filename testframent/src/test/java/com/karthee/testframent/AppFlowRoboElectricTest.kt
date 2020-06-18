package com.karthee.testframent


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.runner.AndroidJUnit4


@RunWith(AndroidJUnit4::class)
class AppFlowRoboElectricTest {

    @get:Rule
    val rule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testAppFlow() {
        val firstButton = onView(withId(R.id.button_first))
        val secondButton = onView(withId(R.id.button_second))
        val thirdButton = onView(withId(R.id.button_third))
        val fourthButton = onView(withId(R.id.button_fourth))
        firstButton.check(matches(isDisplayed()))

        firstButton.perform(click())

        secondButton.check(matches(isDisplayed()))

        secondButton.perform(click())

        thirdButton.check(matches(isDisplayed()))

        thirdButton.perform(click())

        fourthButton.check(matches(isDisplayed()))

        fourthButton.perform(click())

        firstButton.check(matches(isDisplayed()))

        firstButton.perform(click())



    }
}