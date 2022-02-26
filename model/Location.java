package com.laioffer.staybooking.model;

import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.GeoPointField;

import java.io.Serializable;

@Document(indexName = "loc")
//in elastic search, one index (the counterpart is database in the SQL) only has one type (table as the counterpart in the SQL);
public class Location implements Serializable {
    private static final long serialVersionUID = 1L;

    //the searching results of the elastic search is a list of stay id which will be used to pick out all the needed stays from the data base;
    @Field(type = FieldType.Long)
    private Long id;

    @GeoPointField
    private GeoPoint geoPoint;

    public Location(Long id, GeoPoint geoPoint) {
        this.id = id;
        this.geoPoint = geoPoint;
    }

    public Long getId() {
        return id;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

}
