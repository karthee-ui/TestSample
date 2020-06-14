package com.karthee.testsample

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.filters.SdkSuppress
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.uiautomator.By
import androidx.test.uiautomator.UiDevice
import androidx.test.uiautomator.Until
import org.junit.Before
import org.junit.Test

@SdkSuppress(minSdkVersion = 18)
 class ItemListActivityUIAutomatedTest  {

    private lateinit var uiDevice: UiDevice

    private val PACKAGE_NAME = "com.karthee.testsample"
    private val LAUNCH_TIMEOUT = 5000L

    @Before fun initialTest(){

        uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation())

        uiDevice.pressHome()

        val context = ApplicationProvider.getApplicationContext<Context>()

        val intent = context.packageManager.getLaunchIntentForPackage(PACKAGE_NAME)

        context.startActivity(intent)


        uiDevice.wait(Until.hasObject(By.pkg(PACKAGE_NAME).depth(0)), LAUNCH_TIMEOUT)

    }

    @Test
    fun testFragmentInteractions(){

        // First scroll to the position that needs to be matched and click on it.
        Espresso.onView(ViewMatchers.withId(R.id.item_list)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10,
                ViewActions.click()
            ))


        Espresso.onView(ViewMatchers.withText("Details about Item: 11"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}