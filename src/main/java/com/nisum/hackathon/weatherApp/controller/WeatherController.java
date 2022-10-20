package com.nisum.hackathon.weatherApp.controller;

import com.nisum.hackathon.weatherApp.services.WeatherService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @ApiOperation("Return a JSON object that gives the weather averages.")
    @CrossOrigin(origins = "*")
    @GetMapping(value = "/forecast", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> weatherForecastAverage(@ApiParam("City's name") @RequestParam(required = true) String city) {
        return weatherService.weatherForecastAverage(city);
    }
}