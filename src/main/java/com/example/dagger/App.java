package com.example.dagger;

public class App {

  public static void main(String[] args) {
    final Context rootContext = ImmutableContext.builder()
        .username("john")
        .build();

    final ODataProcessorComponent component = DaggerODataProcessorComponent.builder()
        .withContext(rootContext)
        .build();

    final ODataProcessor processor = component.provideODataProcessor();
    processor.readEntity();
  }
}
