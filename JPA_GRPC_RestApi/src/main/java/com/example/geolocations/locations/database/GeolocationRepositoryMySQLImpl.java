package com.example.geolocations.locations.database;
import com.example.geolocations.locations.database.repositories.MySQLCrudRepository;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import java.util.Optional;

@Singleton
public class GeolocationRepositoryMySQLImpl implements GeolocationRepository {

    @Inject
    MySQLCrudRepository mySQLCrudRepository;

    @Override
    public Optional<GeoLocationEntity> readByLocation(String location) {
        return mySQLCrudRepository.findByLocation(location);
    }


    //NOT usable as you dont have type use crud repos
//    @ReadOnly
//    @Override
//    public List<GeoLocationEntity> readByLocation(String location) {
//        String sqlQuery = "SELECT gl FROM GeoLocationEntity gl WHERE location = '" + location + "'";
//        List<GeoLocationEntity> response =  entityManager.createQuery(sqlQuery).getResultList();
//        System.out.println(response);


//        TypedQuery<GeoLocationEntity> typedQuery = entityManager.createQuery(sqlQuery, GeoLocationEntity.class);
//        TypedQuery<GeoLocationEntity> typedQuery = (TypedQuery<GeoLocationEntity>) entityManager.createQuery(sqlQuery);//, GeoLocationEntity.class);
//        System.out.println(typedQuery.toString());
//        return typedQuery.g;

//        GeoLocationEntity sub_geoLocationEntity;
//        response = entityManager.createNativeQuery(sqlQuery).getResultList();
//        System.out.println(response);
//        sub_geoLocationEntity.setCoordinateX(response.);
//        return null;
//    }
}
