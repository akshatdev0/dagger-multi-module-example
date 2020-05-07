package com.example.dagger;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = ODataProcessorModule.class)
public abstract class ODataProcessorComponent {

  abstract ODataProcessor provideODataProcessor();

  @Component.Builder
  interface Builder {

    @BindsInstance
    Builder withContext(Context context);

    ODataProcessorComponent build();
  }
}
