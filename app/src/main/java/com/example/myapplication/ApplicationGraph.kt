package com.example.myapplication

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface ApplicationGraph {
    // This tells Dagger that MainActivity requests injection so the graph needs to
    // satisfy all the dependencies of the fields that LoginActivity is requesting.
    fun inject(activity: MainActivity)
}

open class MyApplication : Application() {

    lateinit var component: ApplicationGraph

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationGraph.create()
    }
}