package co.grandcircus.weatherapi;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherData {

    private List<Integer> temperature = new ArrayList<>();
    @JsonProperty("weather")
    private List<String> weatherShortDescrip = new ArrayList<>();
    private List<String> iconLink = new ArrayList<>();
    @JsonProperty("text")
    private List<String> weatherLongDescrip = new ArrayList<>();

    public List<Integer> getTemperature() {
        return temperature;
    }

    public void setTemperature(List<Integer> temperature) {
        this.temperature = temperature;
    }

    public List<String> getWeatherShortDescrip() {
        return weatherShortDescrip;
    }

    public void setWeatherShortDescrip(List<String> weatherShortDescrip) {
        this.weatherShortDescrip = weatherShortDescrip;
    }

    public List<String> getIconLink() {
        return iconLink;
    }

    public void setIconLink(List<String> iconLink) {
        this.iconLink = iconLink;
    }

    public List<String> getWeatherLongDescrip() {
        return weatherLongDescrip;
    }

    public void setWeatherLongDescrip(List<String> weatherLongDescrip) {
        this.weatherLongDescrip = weatherLongDescrip;
    }

    @Override
    public String toString() {
        return "WeatherData [iconLink=" + iconLink + ", temperature=" + temperature
                + ", weatherLongDescrip=" + weatherLongDescrip + ", weatherShortDescrip="
                + weatherShortDescrip + "]";
    }

}
