package com.example.dagger;

import dagger.Binds;
import dagger.Module;

@Module
public interface OrganizationLdapRepositoryModule {

    @Binds
    OrganizationRepository provideOrganizationRepository(OrganizationLdapRepository organizationLdapRepository);
}
