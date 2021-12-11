package com.ayushman999.hilttutorial

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class) //tells how are we going to scope them eg. ActivityComponent, ApplicationComp...
object AppModule {  //These are containers for dependencies that live for a particular amount of time

//Giving a blue print how are we going to construct a dependency

    @Singleton  //Will make this a singleton else everytime we inject this string an instance is created
    @Provides
    @Named("String1")
    fun provideTestString1() = "This is a string we will inject"

}