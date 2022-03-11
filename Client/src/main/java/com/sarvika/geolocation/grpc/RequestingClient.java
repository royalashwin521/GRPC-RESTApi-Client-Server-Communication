package com.sarvika.geolocation.grpc;

import com.sarvika.geolocation.GeolocationService;
import com.sarvika.geolocation.LocationSearchServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class RequestingClient  {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",6000).usePlaintext().build();

        LocationSearchServiceGrpc.LocationSearchServiceBlockingStub stub = LocationSearchServiceGrpc.newBlockingStub(channel);

        GeolocationService.Coordinates coordinates = stub.search(GeolocationService.SearchRequest.newBuilder().setLocation("Jaipur").build());
        System.out.println(coordinates);

    }
}
