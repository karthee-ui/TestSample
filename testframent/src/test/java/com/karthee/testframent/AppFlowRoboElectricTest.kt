package com.karthee.testframent



import android.widget.Button
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario.launch
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.runner.AndroidJUnit4


@RunWith(AndroidJUnit4::class)
class AppFlowRoboElectricTest {

//    @get:Rule
//    val rule = Acti(MainActivity::class.java)

    @Test
    fun testAppFlow() {

        // GIVEN
        val scenario = launch(MainActivity::class.java)
        scenario.moveToState(Lifecycle.State.CREATED)
        scenario.moveToState(Lifecycle.State.RESUMED)

        scenario.onActivity {
            activity ->
            val buttonFirst = activity.findViewById<Button>(R.id.button_first)

            buttonFirst.callOnClick()

            val buttonSecond
                    = activity.findViewById<Button>(R.id.button_second)

            assert(buttonSecond.text == "Next")

            buttonSecond.callOnClick()

            val buttonThird
                    = activity.findViewById<Button>(R.id.button_third)

            assert(buttonThird.text == "Next")

            buttonThird.callOnClick()

            val buttonfourth
                    = activity.findViewById<Button>(R.id.button_fourth)

            assert(buttonfourth.text == "To First")

            buttonfourth.callOnClick()

            assert(buttonFirst.text == "Next")


        }
//        val firstButton = onView(withId(R.id.button_first))
//        val secondButton = onView(withId(R.id.button_second))
//        val thirdButton = onView(withId(R.id.button_third))
//        val fourthButton = onView(withId(R.id.button_fourth))
//        firstButton.check(matches(isDisplayed()))
//
//        firstButton.perform(click())
//
//        secondButton.check(matches(isDisplayed()))
//
//        secondButton.perform(click())
//
//        thirdButton.check(matches(isDisplayed()))
//
//        thirdButton.perform(click())
//
//        fourthButton.check(matches(isDisplayed()))
//
//        fourthButton.perform(click())
//
//        firstButton.check(matches(isDisplayed()))
//
//        firstButton.perform(click())
    }
}