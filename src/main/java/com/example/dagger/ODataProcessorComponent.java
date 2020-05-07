package com.example.dagger;

import dagger.BindsInstance;
import dagger.Component;

import javax.inject.Singleton;

@Component(modules = ODataProcessorModule.class)
public abstract class ODataProcessorComponent {

  abstract ODataProcessor provideODataProcessor();

  @Component.Builder
  interface Builder {

    @Singleton
    @BindsInstance
    Builder withContext(Context context);

    ODataProcessorComponent build();
  }
}
