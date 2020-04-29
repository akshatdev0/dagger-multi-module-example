package com.example.dagger;

import javax.inject.Inject;

public class OrganizationDynamoDbRepository implements OrganizationRepository {

    @Inject
    public OrganizationDynamoDbRepository() {

    }

    @Override
    public String getOrganization() {
        return "Getting organization from DynamoDB";
    }
}

