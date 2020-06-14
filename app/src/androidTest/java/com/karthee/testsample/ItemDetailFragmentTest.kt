package com.karthee.testsample

import android.os.Bundle
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import org.junit.Assert.*
import org.junit.Test
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ItemDetailFragmentTest{

    @Test
    fun itemDetailFragmentTest1(){

        val args: Bundle = Bundle().apply {
            putString("item_id", "11")
        }

        val scenario =
            launchFragmentInContainer<ItemDetailFragment>(args)

        Espresso.onView(ViewMatchers.withText("Details about Item: 11"))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}