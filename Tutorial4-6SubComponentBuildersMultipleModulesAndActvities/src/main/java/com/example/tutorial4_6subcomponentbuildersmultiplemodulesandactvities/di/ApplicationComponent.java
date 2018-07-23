package com.example.tutorial4_6subcomponentbuildersmultiplemodulesandactvities.di;


import android.app.Application;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

// This is parent component
@Component(modules = ApplicationModule.class)
@Singleton
public interface ApplicationComponent {

    // Calls SubComponent Builder from MainActivity using ApplicationComponent
    ToastMakerSubComponent.Builder toastMakerBuilder();

    DummyDependencyComponent.Builder dummyDependencyBuilder();

    @Component.Builder
    interface Builder {

        ApplicationComponent build();

        @BindsInstance
        Builder application(Application application);

    }
}