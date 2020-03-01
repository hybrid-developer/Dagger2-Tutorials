// Generated by Dagger (https://dagger.dev).
package com.example.tutorial5_2dagger_android_subcomponents3.di;

import android.app.Application;
import android.content.SharedPreferences;
import com.example.tutorial5_2dagger_android_subcomponents3.MainActivity;
import com.example.tutorial5_2dagger_android_subcomponents3.MainActivity_MembersInjector;
import com.example.tutorial5_2dagger_android_subcomponents3.MyApplication;
import com.example.tutorial5_2dagger_android_subcomponents3.SecondActivity;
import com.example.tutorial5_2dagger_android_subcomponents3.SecondActivity_MembersInjector;
import com.example.tutorial5_2dagger_android_subcomponents3.ToastMaker;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication_MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.DispatchingAndroidInjector_Factory;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.MapBuilder;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppComponent implements AppComponent {
  private Provider<ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent.Factory> mainActivitySubcomponentFactoryProvider;

  private Provider<ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent.Factory> secondActivitySubcomponentFactoryProvider;

  private Provider<Application> applicationProvider;

  private Provider<SharedPreferences> provideSharedPreferencesProvider;

  private DaggerAppComponent(Application applicationParam) {

    initialize(applicationParam);
  }

  public static AppComponent.Builder builder() {
    return new Builder();
  }

  private Map<Class<?>, Provider<AndroidInjector.Factory<?>>> getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(
      ) {
    return MapBuilder.<Class<?>, Provider<AndroidInjector.Factory<?>>>newMapBuilder(2).put(MainActivity.class, (Provider) mainActivitySubcomponentFactoryProvider).put(SecondActivity.class, (Provider) secondActivitySubcomponentFactoryProvider).build();}

  private DispatchingAndroidInjector<Object> getDispatchingAndroidInjectorOfObject() {
    return DispatchingAndroidInjector_Factory.newInstance(getMapOfClassOfAndProviderOfAndroidInjectorFactoryOf(), Collections.<String, Provider<AndroidInjector.Factory<?>>>emptyMap());}

  @SuppressWarnings("unchecked")
  private void initialize(final Application applicationParam) {
    this.mainActivitySubcomponentFactoryProvider = new Provider<ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent.Factory>() {
      @Override
      public ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent.Factory get(
          ) {
        return new MainActivitySubcomponentFactory();}
    };
    this.secondActivitySubcomponentFactoryProvider = new Provider<ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent.Factory>() {
      @Override
      public ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent.Factory get(
          ) {
        return new SecondActivitySubcomponentFactory();}
    };
    this.applicationProvider = InstanceFactory.create(applicationParam);
    this.provideSharedPreferencesProvider = DoubleCheck.provider(AppModule_ProvideSharedPreferencesFactory.create(applicationProvider));
  }

  @Override
  public void inject(MyApplication arg0) {
    injectMyApplication(arg0);}

  private MyApplication injectMyApplication(MyApplication instance) {
    DaggerApplication_MembersInjector.injectAndroidInjector(instance, getDispatchingAndroidInjectorOfObject());
    return instance;
  }

  private static final class Builder implements AppComponent.Builder {
    private Application application;

    @Override
    public Builder application(Application application) {
      this.application = Preconditions.checkNotNull(application);
      return this;
    }

    @Override
    public AppComponent build() {
      Preconditions.checkBuilderRequirement(application, Application.class);
      return new DaggerAppComponent(application);
    }
  }

  private final class MainActivitySubcomponentFactory implements ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent.Factory {
    @Override
    public ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent create(
        MainActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new MainActivitySubcomponentImpl(arg0);
    }
  }

  private final class MainActivitySubcomponentImpl implements ActivityContributorModule_ContributeMainActivity.MainActivitySubcomponent {
    private Provider<MainActivity> arg0Provider;

    private Provider<ToastMaker> provideToastMakerProvider;

    private MainActivitySubcomponentImpl(MainActivity arg0Param) {

      initialize(arg0Param);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final MainActivity arg0Param) {
      this.arg0Provider = InstanceFactory.create(arg0Param);
      this.provideToastMakerProvider = DoubleCheck.provider(MainActivityModule_ProvideToastMakerFactory.create((Provider) arg0Provider));
    }

    @Override
    public void inject(MainActivity arg0) {
      injectMainActivity(arg0);}

    private MainActivity injectMainActivity(MainActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      MainActivity_MembersInjector.injectSharedPreferences(instance, DaggerAppComponent.this.provideSharedPreferencesProvider.get());
      MainActivity_MembersInjector.injectToastMaker(instance, provideToastMakerProvider.get());
      return instance;
    }
  }

  private final class SecondActivitySubcomponentFactory implements ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent.Factory {
    @Override
    public ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent create(
        SecondActivity arg0) {
      Preconditions.checkNotNull(arg0);
      return new SecondActivitySubcomponentImpl(arg0);
    }
  }

  private final class SecondActivitySubcomponentImpl implements ActivityContributorModule_ContributeSecondActivity.SecondActivitySubcomponent {
    private Provider<SecondActivity> arg0Provider;

    private Provider<ToastMaker> provideToastMakerProvider;

    private SecondActivitySubcomponentImpl(SecondActivity arg0Param) {

      initialize(arg0Param);
    }

    @SuppressWarnings("unchecked")
    private void initialize(final SecondActivity arg0Param) {
      this.arg0Provider = InstanceFactory.create(arg0Param);
      this.provideToastMakerProvider = DoubleCheck.provider(SecondActivityModule_ProvideToastMakerFactory.create((Provider) arg0Provider));
    }

    @Override
    public void inject(SecondActivity arg0) {
      injectSecondActivity(arg0);}

    private SecondActivity injectSecondActivity(SecondActivity instance) {
      DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, DaggerAppComponent.this.getDispatchingAndroidInjectorOfObject());
      SecondActivity_MembersInjector.injectSharedPreferences(instance, DaggerAppComponent.this.provideSharedPreferencesProvider.get());
      SecondActivity_MembersInjector.injectToastMaker(instance, provideToastMakerProvider.get());
      return instance;
    }
  }
}
