package com.karthee.testframent


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
    fun testHelloWorldOnTextView() {
      //  onView(withId(R.id.hello)).check(matches(withText("Hello World!")))
    }
}