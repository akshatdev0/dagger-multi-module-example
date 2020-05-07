package com.example.dagger;

import javax.inject.Inject;

public class ODataStorage {

    private final ODataContext context;

    private final DynamoDbService dynamoDbService;

    @Inject
    public ODataStorage(ODataContext context, DynamoDbService dynamoDbService) {
        this.context = context;
        this.dynamoDbService = dynamoDbService;
    }

    public void read() {
        System.out.println("ODataStorage context:     " + System.identityHashCode(context) + " : " + context);

        dynamoDbService.read();
    }
}
