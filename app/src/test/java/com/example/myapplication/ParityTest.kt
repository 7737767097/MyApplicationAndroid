package com.example.myapplication

import android.provider.Telephony.Mms.Part
import androidx.lifecycle.Lifecycle
import org.junit.Assert.*

import org.junit.Test

class ParityTest {

    @Test
    fun values() {
        assert(Parity.values()[0] == Parity.Even)
    }

    @Test
    fun valueOf() {
        assert(Parity.valueOf("Even") == Parity.Even)
    }

    @Test
    fun `test even`() {
        assertNotNull(Parity.valueOf("Even"))
    }
}