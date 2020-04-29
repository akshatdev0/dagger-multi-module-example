package com.example.dagger;

import dagger.Binds;
import dagger.Module;

@Module
public interface OrganizationDynamoDbRepositoryModule {

    @Binds
    OrganizationRepository provideOrganizationRepository(OrganizationDynamoDbRepository organizationDynamoDbRepository);
}
