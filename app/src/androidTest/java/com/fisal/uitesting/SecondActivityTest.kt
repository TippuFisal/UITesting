package com.fisal.uitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class SecondActivityTest{

    @get: Rule
  val activityRule = ActivityScenarioRule(SecondActivity::class.java)

    @Test
    fun testActivityView() {
        onView(withId(R.id.secondactivity)).check(matches(isDisplayed()))
    }

    @Test
    fun testActivityTextButton() {
        onView(withId(R.id.secondactivity_button)).check(matches(isDisplayed()))

        onView(withId(R.id.secondactivity_textview)).check(matches(withEffectiveVisibility(Visibility.VISIBLE)))

    }

    @Test
    fun testActivityString() {
        onView(withId(R.id.secondactivity_textview)).check(matches(withText(R.string.SecondActivity)))
        onView(withId(R.id.secondactivity_button)).check(matches(withText(R.string.Backbtn)))
    }
}