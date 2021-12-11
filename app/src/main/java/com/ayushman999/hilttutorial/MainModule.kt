package com.ayushman999.hilttutorial

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class) //tells how are we going to scope them eg. ActivityComponent, ApplicationComp...
object MainModule {  //These are containers for dependencies that live for a particular amount of time

//Giving a blue print how are we going to construct a dependency

    @ActivityScoped     //Singleton won't work because it works in ApplicationComponent equivalent of @Singleton
    @Provides
    @Named("String2")
    fun provideTestString2(
        @ApplicationContext context: Context,
        @Named("String1") testString1: String
    )= "${context.getString(R.string.string_to_inject)} - $testString1"


}