package com.example.dagger;

import dagger.BindsInstance;
import dagger.Subcomponent;

import javax.inject.Singleton;

@Subcomponent
public abstract class ODataStorageComponent {

  abstract ODataStorage provideODataStorage();

  @Subcomponent.Builder
  interface Builder {

    @Singleton
    @BindsInstance
    Builder withODataContext(ODataContext odataContext);

    ODataStorageComponent build();
  }
}
