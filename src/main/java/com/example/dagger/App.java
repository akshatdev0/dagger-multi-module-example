package com.example.dagger;

public class App {

  public static void main(String[] args) {
    final ODataContext rootContext = ImmutableODataContext.builder()
        .username("john")
        .build();

    final ODataProcessorComponent component = DaggerODataProcessorComponent.builder()
        .withODataContext(rootContext)
        .build();

    final ODataProcessor processor = component.provideODataProcessor();
    processor.readEntity();
  }
}
