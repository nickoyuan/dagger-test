package com.example.myapplication

import javax.inject.Inject

class CounterPresenter @Inject constructor() {

    @Inject
    lateinit var counterRepo: CounterRepo

    lateinit var view : CounterView

    fun incrementNumberAndUpdateOnView(count: Int): Int {
       val incrementedCounter = count + 1
       view.updateViewWithCount(incrementedCounter)
        counterRepo.asdf()
        return incrementedCounter
    }

    fun attachView(_view: CounterView) {
        view = _view
    }

}