// Generated by Dagger (https://dagger.dev).
package com.example.android.architecture.blueprints.todoapp.tasks;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerFragment_MembersInjector;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TasksFragment_Factory implements Factory<TasksFragment> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<TasksContract.Presenter> mPresenterProvider;

  public TasksFragment_Factory(Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TasksContract.Presenter> mPresenterProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.mPresenterProvider = mPresenterProvider;
  }

  @Override
  public TasksFragment get() {
    TasksFragment instance = newInstance();
    DaggerFragment_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    TasksFragment_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    return instance;
  }

  public static TasksFragment_Factory create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TasksContract.Presenter> mPresenterProvider) {
    return new TasksFragment_Factory(androidInjectorProvider, mPresenterProvider);
  }

  public static TasksFragment newInstance() {
    return new TasksFragment();
  }
}
