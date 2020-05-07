package com.example.dagger;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent
public abstract class ODataStorageComponent {

  abstract ODataStorage provideODataStorage();

  @Subcomponent.Builder
  interface Builder {

    @BindsInstance
    Builder withODataContext(ODataContext odataContext);

    ODataStorageComponent build();
  }
}
