package com.example.dagger;

import javax.inject.Inject;
import javax.inject.Provider;

public class ODataProcessor {

    private final Context context;

    private final Provider<ODataStorageComponent.Builder> oDataStorageComponentProvider;

    @Inject
    public ODataProcessor(Context context, Provider<ODataStorageComponent.Builder> oDataStorageComponentProvider) {
        this.context = context;
        this.oDataStorageComponentProvider = oDataStorageComponentProvider;
    }

    public void readEntity() {
        System.out.println("ODataProcessor context:   " + System.identityHashCode(context) + " : " + context);

        final ODataContext requestContext = ImmutableODataContext.builder()
            .from(context)
            .odataPath("/odata/global")
            .build();

        final ODataStorageComponent component = oDataStorageComponentProvider.get()
            .withODataContext(requestContext)
            .build();
        final ODataStorage storage = component.provideODataStorage();
        storage.read();
    }
}

