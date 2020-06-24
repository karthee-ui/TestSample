package com.karthee.testframent

import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_third.*
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric.buildActivity
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class AppFlowWithOnlyRoboelectricTest {
    @Test
    fun appflowTest() {
        // GIVEN
        val controller = buildActivity(MainActivity::class.java)
        val activity = controller.get()

        // WHEN
        controller.create().start()

        // THEN
        activity.apply {

            assert(title == "First Fragment")

            assert(btnEnterDetails != null)

            btnEnterDetails.callOnClick()

            assert(title == "Second Fragment")

            etOldUsername.setText("karthee")
            etNewUsername.setText("android")

            btnSubmit.callOnClick()

            assert(title == "Third Fragment")

            assert(tvSuccess.text == "Success")

        }

        assert(BuildConfig.DEBUG)
    }
}