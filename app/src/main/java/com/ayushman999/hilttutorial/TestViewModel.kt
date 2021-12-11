package com.ayushman999.hilttutorial

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import javax.inject.Named

class TestViewModel @ViewModelInject constructor(       //Instead of @Inject we use ViewModelInject in Viewmodels
    @Named("String2") testString2:String

): ViewModel() {

    init {
        Log.d("ViewModel","Test String from MainActivity: $testString2")
    }


}