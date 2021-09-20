package com.example.myapplication

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Test


class CounterPresenterTest {

    val view : CounterView = mock()
    private val presenter = CounterPresenter(view)

    @Test
    fun should_add_one_count_if_addition_button_is_pressed_and_update_view() {
        val count = 0
        val incrementedCount = presenter.incrementNumberAndUpdateOnView(count)
        verify(view).updateViewWithCount(incrementedCount)
        assertEquals(count + 1, incrementedCount)
    }
}