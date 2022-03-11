package com.sarvika.geolocation.grpc;
import com.sarvika.geolocation.GeolocationService;
import io.grpc.stub.StreamObserver;

public class LocationSearchServiceGrpc extends com.sarvika.geolocation.LocationSearchServiceGrpc.LocationSearchServiceImplBase {

    @Override
    public void search(GeolocationService.SearchRequest request, StreamObserver<GeolocationService.Coordinates> responseObserver) {
        System.out.println("searching for location - " + request.getLocation());

        GeolocationService.Coordinates coordinates = GeolocationService.Coordinates.newBuilder().setX(123).setY(456).build();

        responseObserver.onNext(coordinates);
        responseObserver.onCompleted();
    }






}
