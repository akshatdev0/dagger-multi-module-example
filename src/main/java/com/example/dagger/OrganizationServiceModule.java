package com.example.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class OrganizationServiceModule {

    @Provides
    public OrganizationService provideOrganizationService(OrganizationRepository organizationRepository) {
        return new OrganizationService(organizationRepository);
    }
}
