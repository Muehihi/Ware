package com.example.ware

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry

import org.junit.Test import org.junit.runner.RunWith

import org.junit.Assert.*

/**

Instrumented test, which will execute on an Android device.
See testing documentation. */
@RunWith(AndroidJUnit4::class) class ExampleInstrumentedTest {
    @Test fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.ware", appContext.packageName)
    }
}
