package com.example.dagger;

import javax.inject.Inject;

public class ODataStorage {

    private final ODataContext context;

    @Inject
    public ODataStorage(ODataContext context) {
        this.context = context;
    }

    public void read() {
        System.out.println("Reading from ODataStorage with context: " + context);
    }
}
