package com.example.myapplication

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CounterRepo @Inject constructor(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
)

{


    fun asdf() : String {
        return "hello"
    }

}
