package co.grandcircus.weatherapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentObservation {

    @JsonProperty("Date")
    private String date;
    @JsonProperty("Temp")
    private int temp;
    @JsonProperty("Winds")
    private int winds;
    @JsonProperty("Weatherimage")
    private String weatherImage;
    @JsonProperty("Weather")
    private String weatherDescription;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getWinds() {
        return winds;
    }

    public void setWinds(int winds) {
        this.winds = winds;
    }

    public String getWeatherImage() {
        return weatherImage;
    }

    public void setWeatherImage(String weatherImage) {
        this.weatherImage = weatherImage;
    }

    public String getWeatherDescription() {
        return weatherDescription;
    }

    public void setWeatherDescription(String weatherDescription) {
        this.weatherDescription = weatherDescription;
    }

    @Override
    public String toString() {
        return "CurrentObservation [date=" + date + ", temp=" + temp + ", weatherDescription="
                + weatherDescription + ", weatherImage=" + weatherImage + ", winds=" + winds + "]";
    }


}
