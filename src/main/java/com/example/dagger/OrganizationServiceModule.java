package com.example.dagger;

import dagger.Module;
import dagger.Provides;

@Module(includes = {
    OrganizationDynamoDbRepositoryModule.class,
//    OrganizationLdapRepositoryModule.class,
})
public class OrganizationServiceModule {

    @Provides
    public OrganizationService provideOrganizationService(OrganizationRepository organizationRepository) {
        return new OrganizationService(organizationRepository);
    }
}
