package com.example.dagger;

import dagger.Component;

@Component(modules = OrganizationServiceModule.class, dependencies = OrganizationRepositoryComponent.class)
public abstract class OrganizationServiceComponent {

  public abstract OrganizationService provideOrganizationService();
}
