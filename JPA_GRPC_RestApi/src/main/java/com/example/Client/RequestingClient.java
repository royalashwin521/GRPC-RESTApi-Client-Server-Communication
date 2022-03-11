package com.example.Client;

import com.example.JpagrpcReply;
import com.example.JpagrpcRequest;
import com.example.JpagrpcServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;


public class RequestingClient {
        public static void main(String[] args) {
            ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
            JpagrpcServiceGrpc.JpagrpcServiceBlockingStub stub = JpagrpcServiceGrpc.newBlockingStub(channel);
            JpagrpcReply coordinates = stub.send(JpagrpcRequest.newBuilder().setLocation("Jaipur").build());
            System.out.println(coordinates);

        }
    }

