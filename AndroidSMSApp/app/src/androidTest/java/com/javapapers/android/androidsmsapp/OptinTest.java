package com.javapapers.android.androidsmsapp;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewInteraction;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Before;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ricardo on 02/07/15.
 */
public class OptinTest extends ActivityInstrumentationTestCase2<SendSmsActivity> {

    private SendSmsActivity sendSmsActivity;

    public OptinTest(Class<SendSmsActivity> activityClass) {
        super(activityClass);
    }

    @Before
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
        sendSmsActivity = getActivity();
    }

    @Test
    public void testSimpleSms() {
        onView(withId(R.id.btnInbox)).perform(click());



    }


}
