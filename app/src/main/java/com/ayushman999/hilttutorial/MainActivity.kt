package com.ayushman999.hilttutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint //to inject something, to inject something in a Fragment add @AndroidEntryPoint in both Activity and fragment
class MainActivity : AppCompatActivity() {
    @Inject
    @Named("String1")
    lateinit var testString:String

    private val viewModel: TestViewModel by viewModels()            //lazy initialization
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivity","Test String from MainActivity: $testString")
        viewModel
    }
}