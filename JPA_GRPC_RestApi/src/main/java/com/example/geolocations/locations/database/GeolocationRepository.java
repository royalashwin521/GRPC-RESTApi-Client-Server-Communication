package com.example.geolocations.locations.database;

import jakarta.inject.Singleton;

import java.util.Optional;

@Singleton
public interface GeolocationRepository {

    Optional<GeoLocationEntity> readByLocation(String location);

}
