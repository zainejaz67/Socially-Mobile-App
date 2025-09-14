package com.ZainIjaz.i210753

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivity2 {

    @get:Rule
    var activityRule = ActivityScenarioRule(mainpage::class.java)

    @Test
    fun clickButton_opensNextActivity() {
        onView(withId(R.id.profile)).perform(click())

        onView(withText("54")).check(matches(isDisplayed()))
    }
}
