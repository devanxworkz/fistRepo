package com.example.weather.model;

import java.time.LocalDate;
import java.util.Currency;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private Location location;
    private Current current;

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Location {
        private String name;
        private String country;
        private String region;

        public String getName(){
            return name;
        }
    
        public void setName(String name){
            this.name = name;
        }
    
        public String getCounter(){
            return country;
        }

        public void setCounter(String country){
            this.country = country;
        }

        public String region(){
            return this.region;
        }

        public void setRegion(String region){
            this.region = region;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Current {
        private int temperature;
        
        @JsonProperty("weather_descriptions")
        private String[] weatherDescriptions;

        public int getTemperature(){
           return this.temperature;
        }

        public void setTemperature(int temperature){
            this.temperature = temperature;
        }
    }

 
    public Location getLocation(){
        return location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public Current getCurrent(){
        return this.current;
    }

    public void setCurrent(Current current ){
        this.current = current;
    }
    
}