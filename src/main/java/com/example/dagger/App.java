package com.example.dagger;

public class App {

  public static void main(String[] args) {
    final OrganizationRepositoryComponent organizationRepositoryComponent =
        DaggerOrganizationRepositoryComponent.create();

    final OrganizationServiceModule organizationServiceModule = new OrganizationServiceModule();
    final OrganizationServiceComponent organizationServiceComponent =
        DaggerOrganizationServiceComponent.builder()
            .organizationServiceModule(organizationServiceModule)
            .organizationRepositoryComponent(organizationRepositoryComponent)
            .build();

    final OrganizationService organizationService = organizationServiceComponent.provideOrganizationService();
    final String organization = organizationService.getOrganization();
    System.out.println(organization);
  }
}
