package com.example.dagger;

import dagger.Component;

@Component(modules = {
//    OrganizationDynamoDbRepositoryModule.class,
    OrganizationLdapRepositoryModule.class,
    OrganizationServiceModule.class
})
public abstract class AppComponent {

  public abstract OrganizationService provideOrganizationService();

  public static AppComponent create() {
    return DaggerAppComponent.create();
  }
}
