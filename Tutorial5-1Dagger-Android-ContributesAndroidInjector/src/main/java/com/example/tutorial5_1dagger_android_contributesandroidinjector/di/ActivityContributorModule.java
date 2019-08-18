package com.example.tutorial5_1dagger_android_contributesandroidinjector.di;


import com.example.tutorial5_1dagger_android_contributesandroidinjector.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;


/**
 * {@link ActivityContributorModule#contributeMainActivity()} method replaces adding MainActivitySubComponent
 * if SubComponent and it's builder has NO methods.
 *
 */
@Module
public abstract class ActivityContributorModule {

    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();

}
