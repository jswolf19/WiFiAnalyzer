/*
 * WiFiAnalyzer
 * Copyright (C) 2015 - 2021 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package com.vrem.wifianalyzer.wifi.band

import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import java.util.*

class WiFiChannelCountryGHZ6Test {
    private val channelsSet: SortedSet<Int> = sortedSetOf(
        1, 5, 9, 13, 17, 21, 25, 29,
        33, 37, 41, 45, 49, 53, 57, 61,
        65, 69, 73, 77, 81, 85, 89, 93
    )

    private val fixture = WiFiChannelCountryGHZ6()

    @Test
    fun testChannelsForWorld() {
        listOf("GB", "XYZ", "US", "AU", "AE")
            .forEach { validateChannels(channelsSet, fixture.findChannels(it)) }
    }

    private fun validateChannels(expected: SortedSet<Int>, actual: SortedSet<Int>) {
        assertEquals(expected.size, actual.size)
        assertTrue(actual.containsAll(expected))
    }

}