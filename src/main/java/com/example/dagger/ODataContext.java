package com.example.dagger;

import javax.annotation.Nullable;
import org.immutables.value.Value;

@Value.Immutable
public interface ODataContext extends Context {

  @Nullable
  String odataPath();
}
