package com.karthee.testframent

import android.widget.Button
import androidx.test.runner.AndroidJUnit4
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_fourth.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.buildActivity

@RunWith(AndroidJUnit4::class)
class Test2 {
    @Test
    fun appflowTest() {
        // GIVEN
        val controller = buildActivity(MainActivity::class.java)
        val activity = controller.get()

        // WHEN
        controller.create().start()

        // THEN

        val buttonFirst = activity.button_first

        assert(buttonFirst != null)

        buttonFirst.callOnClick()

        val buttonSecond = activity.button_second

        assert(buttonSecond.text == "Next")

        buttonSecond.callOnClick()

        val buttonThird = activity.button_third

        assert(buttonThird.text == "Next")

        buttonThird.callOnClick()

        val buttonfourth = activity.button_fourth

        assert(buttonfourth.text == "To First")

        buttonfourth.callOnClick()

        assert(buttonFirst.text == "Next")
    }
}