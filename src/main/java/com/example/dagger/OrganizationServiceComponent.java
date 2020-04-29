package com.example.dagger;

import dagger.Subcomponent;

@Subcomponent(modules = OrganizationServiceModule.class)
public abstract class OrganizationServiceComponent {

  public abstract OrganizationService provideOrganizationService();
}
