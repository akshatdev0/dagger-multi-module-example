package com.example.dagger;

public class App {

  public static void main(String[] args) {
    final AppComponent component = AppComponent.create();
    final OrganizationService organizationService = component.provideOrganizationService();

    final String organization = organizationService.getOrganization();
    System.out.println(organization);
  }
}
