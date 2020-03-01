// Generated by Dagger (https://dagger.dev).
package com.example.android.architecture.blueprints.todoapp.tasks;

import dagger.Lazy;
import dagger.MembersInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.DaggerAppCompatActivity_MembersInjector;
import dagger.internal.DoubleCheck;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TasksActivity_MembersInjector implements MembersInjector<TasksActivity> {
  private final Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  private final Provider<TasksPresenter> mTasksPresenterProvider;

  private final Provider<TasksFragment> taskFragmentProvider;

  public TasksActivity_MembersInjector(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TasksPresenter> mTasksPresenterProvider,
      Provider<TasksFragment> taskFragmentProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
    this.mTasksPresenterProvider = mTasksPresenterProvider;
    this.taskFragmentProvider = taskFragmentProvider;
  }

  public static MembersInjector<TasksActivity> create(
      Provider<DispatchingAndroidInjector<Object>> androidInjectorProvider,
      Provider<TasksPresenter> mTasksPresenterProvider,
      Provider<TasksFragment> taskFragmentProvider) {
    return new TasksActivity_MembersInjector(androidInjectorProvider, mTasksPresenterProvider, taskFragmentProvider);}

  @Override
  public void injectMembers(TasksActivity instance) {
    DaggerAppCompatActivity_MembersInjector.injectAndroidInjector(instance, androidInjectorProvider.get());
    injectMTasksPresenter(instance, mTasksPresenterProvider.get());
    injectTaskFragmentProvider(instance, DoubleCheck.lazy(taskFragmentProvider));
  }

  public static void injectMTasksPresenter(TasksActivity instance, Object mTasksPresenter) {
    instance.mTasksPresenter = (TasksPresenter) mTasksPresenter;
  }

  public static void injectTaskFragmentProvider(TasksActivity instance,
      Lazy<TasksFragment> taskFragmentProvider) {
    instance.taskFragmentProvider = taskFragmentProvider;
  }
}
