package com.fisal.uitesting

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{
    @Test
    fun testActivityNavigation() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.mainactivity_button)).perform(click())
        onView(withId(R.id.secondactivity)).check(matches(isDisplayed()))

    }

    //    @Test
//    fun testActivityVisble() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//
//        onView(withId(R.id.mainactivity)).check(matches(isDisplayed()))
//    }
//
//    @Test
//    fun testActivity_button_text() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.mainactivity_textview)).check(matches(isDisplayed()))
//
//       // onView(withId(R.id.mainactivity_button)).check(matches(isDisplayed()))
//
//        onView(withId(R.id.mainactivity_button))
//            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//    }
//
//    @Test
//    fun testActivityStringTest() {
//
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
//        onView(withId(R.id.mainactivity_button))
//            .check(matches(withText(R.string.Nextbtn)))
//
//        onView(withId(R.id.mainactivity_textview))
//            .check(matches(withText(R.string.hello)))
//    }
}