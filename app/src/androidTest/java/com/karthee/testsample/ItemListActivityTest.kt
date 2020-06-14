package com.karthee.testsample

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ItemListActivityTest{

    @get:Rule
    val activityTest = ActivityScenarioRule(ItemListActivity::class.java)

    @Test
    fun testFragmentInteractions(){

        // First scroll to the position that needs to be matched and click on it.
        onView(withId(R.id.item_list)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(10,click()))


        onView(withText("Details about Item: 11")).check(matches(isDisplayed()))
    }
}