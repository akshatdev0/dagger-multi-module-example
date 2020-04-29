package com.example.dagger;

import dagger.Component;

@Component(modules = {
//    OrganizationDynamoDbRepositoryModule.class,
    OrganizationLdapRepositoryModule.class
})
public abstract class OrganizationRepositoryComponent {

  public abstract OrganizationServiceComponent provideOrganizationServiceComponent(OrganizationServiceModule organizationServiceModule);
}
