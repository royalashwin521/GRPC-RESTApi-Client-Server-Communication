package com.example.geolocations.locations.transport;

import com.example.JpagrpcReply;
import com.example.JpagrpcRequest;
import com.example.JpagrpcServiceGrpc;
import com.example.geolocations.locations.database.GeolocationRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
public class GeolocationGRPCTransport extends JpagrpcServiceGrpc.JpagrpcServiceImplBase {

    @Inject
    private GeolocationRepository geolocationRepository;

    @Override
    public void send(JpagrpcRequest request, StreamObserver<JpagrpcReply> responseObserver) {
        final var locationOptional = this.geolocationRepository.readByLocation(request.getLocation());

        if (locationOptional.isEmpty()) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("location not found").asException());
            return;
        }

        final var location = locationOptional.get();
        final var result = JpagrpcReply.newBuilder()
                .setXCoordinate(location.getCoordinateX())
                .setYCoordinate(location.getCoordinateY())
                .build();

        responseObserver.onNext(result);
        responseObserver.onCompleted();
    }

}

