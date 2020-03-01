// Generated by Dagger (https://dagger.dev).
package com.example.tutorial2selectcontructorandfieldinjection.model;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MySharedPreferences_Factory implements Factory<MySharedPreferences> {
  private final Provider<SharedPreferences> mSharedPreferencesProvider;

  public MySharedPreferences_Factory(Provider<SharedPreferences> mSharedPreferencesProvider) {
    this.mSharedPreferencesProvider = mSharedPreferencesProvider;
  }

  @Override
  public MySharedPreferences get() {
    return newInstance(mSharedPreferencesProvider.get());
  }

  public static MySharedPreferences_Factory create(
      Provider<SharedPreferences> mSharedPreferencesProvider) {
    return new MySharedPreferences_Factory(mSharedPreferencesProvider);
  }

  public static MySharedPreferences newInstance(SharedPreferences mSharedPreferences) {
    return new MySharedPreferences(mSharedPreferences);
  }
}
