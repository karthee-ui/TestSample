package com.karthee.testframent



import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario.launch
import org.junit.Test
import org.junit.runner.RunWith
import androidx.test.runner.AndroidJUnit4


@RunWith(AndroidJUnit4::class)
class AppFlowRoboElectricAndAndroidxtestTest {

    @Test
    fun testAppFlow() {

        // GIVEN
        val scenario = launch(MainActivity::class.java)
        scenario.moveToState(Lifecycle.State.CREATED)
        scenario.moveToState(Lifecycle.State.RESUMED)

        scenario.onActivity {
            activity ->

            val buttonFirst = activity.findViewById<Button>(R.id.btnEnterDetails)

            buttonFirst.callOnClick()
            val etOldUsername = activity.findViewById<EditText>(R.id.etOldUsername)
            val etNewUsername = activity.findViewById<EditText>(R.id.etNewUsername)

            etOldUsername.setText("karthee")
            etNewUsername.setText("android")

            val btnSubmit
                    = activity.findViewById<Button>(R.id.btnSubmit)

            btnSubmit.callOnClick()
            val tvSuccess = activity.findViewById<TextView>(R.id.tvSuccess)

            assert(tvSuccess.text == "Success")

        }

        assert(BuildConfig.DEBUG)

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