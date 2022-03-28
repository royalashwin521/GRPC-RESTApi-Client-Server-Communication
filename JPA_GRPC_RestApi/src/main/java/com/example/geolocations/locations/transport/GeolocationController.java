package com.example.geolocations.locations.transport;

import com.example.geolocations.locations.database.GeoLocationEntity;
import com.example.geolocations.locations.database.repositories.MySQLCrudRepository;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.intercept.annotation.DataMethodQueryParameter;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import java.util.List;
import java.util.Optional;

@Controller("/api")
public class GeolocationController {

    @Inject
    private MySQLCrudRepository mySQLCrudRepository;

    @Get(value = "locations/{location}")
    public Optional<GeoLocationEntity> findByLocation(String location){
        return mySQLCrudRepository.findByLocation(location); }

    @Get("locations/id/{id}")
    public Optional<GeoLocationEntity> GetLocationByID(Long id) { return mySQLCrudRepository.findById(id); }

    @Get(value = "locations")
//    @Produces("text/plain")
    public Iterable<GeoLocationEntity> listAllLocation(){
        return mySQLCrudRepository.findAll();
    }

//    @Get(value = "locations/search")
//    public List<GeoLocationEntity> findBySomeLocation(@QueryValue(value = "location",defaultValue = "") String location) {
//        System.out.println(location);
//        var results = mySQLCrudRepository.with
//        var queryResult = mySQLCrudRepository.findBySomeLocation(location);
//        System.out.println(queryResult);
//        return queryResult;
//    }
}

/*
 * [/api/locations]                     - list all locations in db
 * [/api/locations/search?location=<>]  - search all locations using query param search
 * [/api/locations/{id}]                - read geolocation by id
 */
