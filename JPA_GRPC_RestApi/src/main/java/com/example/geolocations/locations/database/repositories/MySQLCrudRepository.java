package com.example.geolocations.locations.database.repositories;

import com.example.geolocations.locations.database.GeoLocationEntity;
import io.micronaut.data.annotation.Query;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import io.micronaut.http.annotation.QueryValue;

import java.util.List;
import java.util.Optional;

@Repository
public interface MySQLCrudRepository extends CrudRepository<GeoLocationEntity, Long> {

    Optional<GeoLocationEntity> findByLocation(String location);

//    @Query(value = "select gle.location from GeoLocationEntity  gle where gle.location like '%pur%' ")
//    List<GeoLocationEntity> findBySomeLocation(@QueryValue(value = "location") String location);

}
