package com.nadjemni.bmicalculator;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        androidx.test.platform.app.ApplicationProvider.getApplicationContext();
        String appContext = InstrumentationRegistry.getInstrumentation().getTargetContext().getPackageName();
        assertEquals("com.nadjemni.bmicalculator", appContext);
    }
}
