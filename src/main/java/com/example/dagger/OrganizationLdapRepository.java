package com.example.dagger;

import javax.inject.Inject;

public class OrganizationLdapRepository implements OrganizationRepository {

    @Inject
    public OrganizationLdapRepository() {

    }

    @Override
    public String getOrganization() {
        return "Getting organization from ActiveDirectory";
    }
}

