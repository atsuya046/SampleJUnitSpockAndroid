package com.example.nobu.samplejunitspock;

import android.widget.TextView;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 23)
public class MainActivityTest {

    @Test
    public void testOnCreate() throws Exception {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        String text = ((TextView) activity.findViewById(R.id.main_text)).getText().toString();

        Assert.assertEquals(text, "Buzz");
    }
}