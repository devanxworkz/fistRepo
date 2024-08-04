package com.example.weather.service;

import com.example.weather.model.Weather;
import com.example.weather.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@Service
public class WeatherService {

@Autowired
public WeatherRespository weatherRespository;

    @Override
    public ArrayList getWeather(String city){
        List <Weather> weathersList = weatherRespository.findAll();
        ArrayList<Weather> listOfWeathers = new ArrayList<>();
        return listOfWeathers;
    }

}