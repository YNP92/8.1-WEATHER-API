package co.grandcircus.weatherapi;

import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherLocation {

    private BigDecimal latitude;
    private BigDecimal longitude;
    @JsonProperty("areaDescription")
    private String cityState;

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    // may need to change this back to areaDescription
    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    @Override
    public String toString() {
        return "WeatherLocation [areaDescription=" + cityState + ", latitude=" + latitude
                + ", longitude=" + longitude + "]";
    }


}
