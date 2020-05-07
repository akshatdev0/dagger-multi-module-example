package com.example.dagger;

import org.immutables.value.Value;

@Value.Immutable
public interface Context {

  String username();
}
