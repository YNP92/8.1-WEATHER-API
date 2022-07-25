package co.grandcircus.weatherapi;

import java.util.ArrayList;
import java.util.List;

public class WeatherTime {

    private List<String> startPeriodName = new ArrayList<String>();
    private List<String> tempLabel = new ArrayList<String>();

    public List<String> getStartPeriodName() {
        return startPeriodName;
    }

    public void setStartPeriodName(List<String> startPeriodName) {
        this.startPeriodName = startPeriodName;
    }

    public List<String> getTempLabel() {
        return tempLabel;
    }

    public void setTempLabel(List<String> tempLabel) {
        this.tempLabel = tempLabel;
    }

    @Override
    public String toString() {
        return "WeatherTime [startPeriodName=" + startPeriodName + ", tempLabel=" + tempLabel + "]";
    }


}
