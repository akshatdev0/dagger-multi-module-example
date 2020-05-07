package com.example.dagger;

import javax.inject.Inject;

public class ODataProcessor {

    private final ODataContext context;

    @Inject
    public ODataProcessor(ODataContext context) {
        this.context = context;
    }

    public void readEntity() {
        System.out.println("Reading OData entity in ODataProcessor with context: " + context);
    }
}

