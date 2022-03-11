package com.sarvika.geolocation.grpc;

import com.sarvika.geolocation.LocationSearchServiceGrpc;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class RunningServer extends LocationSearchServiceGrpc.LocationSearchServiceImplBase {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(6000)
                .addService(new com.sarvika.geolocation.grpc.LocationSearchServiceGrpc())
                .build();

        server.start();
        System.out.println("Server has started ========");
        server.awaitTermination();
    }
}



