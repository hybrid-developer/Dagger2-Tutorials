package com.smarttoolfactory.tutorial6_4_sucomponentfactory_multipleactivitiesandfragments

import android.app.Application
import com.smarttoolfactory.tutorial6_4_sucomponentfactory_multipleactivitiesandfragments.di.AppComponent
import com.smarttoolfactory.tutorial6_4_sucomponentfactory_multipleactivitiesandfragments.di.DaggerAppComponent


open class MyApplication : Application() {

    // Instance of the AppComponent that will be used by all the Activities in the project
    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        // Creates an instance of AppComponent using its Factory constructor
        // We pass the applicationContext that will be used as Application
        return DaggerAppComponent.factory().create(this)
    }
}