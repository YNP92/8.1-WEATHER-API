package co.grandcircus.weatherapi;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherAPIService {
    private RestTemplate request = new RestTemplate();

    public ForecastResponse getForecastResponse(double latitude, double longitude) {
        String url = "https://forecast.weather.gov/MapClick.php?lat=" + latitude + "&lon="
                + longitude + "&FcstType=json";
        System.out.println(url);
        ForecastResponse response = request.getForObject(url, ForecastResponse.class);
        System.out.println(response.getCredit());
        return response;
    }

    // public ForecastResponse getForecastResponse() {
    // String url =
    // "https://forecast.weather.gov/MapClick.php?lat=42.3831&lon=-83.1022&FcstType=json";
    // ForecastResponse response = request.getForObject(url, ForecastResponse.class);
    // return response;
    // }

}
