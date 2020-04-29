package com.example.dagger;

public class OrganizationService {

    private final OrganizationRepository repository;

    public OrganizationService(OrganizationRepository repository) {
        this.repository = repository;
    }

    public String getOrganization() {
        return repository.getOrganization();
    }
}
