package com.example.dagger;

import javax.inject.Inject;

public class DynamoDbService {

  private final Context context;

  @Inject
  public DynamoDbService(Context context) {
    this.context = context;
  }

  public void read() {
    System.out.println("DynamoDbService context:  " + System.identityHashCode(context) + " : " + context);
  }
}
