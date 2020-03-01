// Generated by Dagger (https://dagger.dev).
package com.example.tutorial2selectcontructorandfieldinjection.di;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferencesModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final SharedPreferencesModule module;

  public SharedPreferencesModule_ProvideSharedPreferencesFactory(SharedPreferencesModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(module);
  }

  public static SharedPreferencesModule_ProvideSharedPreferencesFactory create(
      SharedPreferencesModule module) {
    return new SharedPreferencesModule_ProvideSharedPreferencesFactory(module);
  }

  public static SharedPreferences provideSharedPreferences(SharedPreferencesModule instance) {
    return Preconditions.checkNotNull(instance.provideSharedPreferences(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
