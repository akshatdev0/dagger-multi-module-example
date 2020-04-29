package com.example.dagger;

import dagger.Component;

@Component(modules = OrganizationServiceModule.class)
public abstract class AppComponent {

  public abstract OrganizationService provideOrganizationService();

  public static AppComponent create() {
    return DaggerAppComponent.create();
  }
}
