package com.example.dagger;

import dagger.BindsInstance;
import dagger.Component;

@Component
public abstract class ODataProcessorComponent {

  abstract ODataProcessor provideODataProcessor();

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder withODataContext(ODataContext odataContext);

    ODataProcessorComponent build();
  }
}
