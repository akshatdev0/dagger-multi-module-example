package com.example.dagger;

public class OrganizationService {

    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    private void getOrganization() {
        System.out.println(repository.getOrganization());
    }
}
