package co.grandcircus.weatherapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastResponse {


    private String credit;
    @JsonProperty("currentobservation")
    private CurrentObservation currentObservation;
    @JsonProperty("data")
    private WeatherData weatherData;
    @JsonProperty("location")
    private WeatherLocation weatherLocation;
    @JsonProperty("time")
    private WeatherTime weatherTime;

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public CurrentObservation getCurrentObservation() {
        return currentObservation;
    }

    public void setCurrentObservation(CurrentObservation currentObservation) {
        this.currentObservation = currentObservation;
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void setWeatherData(WeatherData weatherData) {
        this.weatherData = weatherData;
    }

    public WeatherLocation getWeatherLocation() {
        return weatherLocation;
    }

    public void setWeatherLocation(WeatherLocation weatherLocation) {
        this.weatherLocation = weatherLocation;
    }

    public WeatherTime getWeatherTime() {
        return weatherTime;
    }

    public void setWeatherTime(WeatherTime weatherTime) {
        this.weatherTime = weatherTime;
    }


}
