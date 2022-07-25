package co.grandcircus.weatherapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @Autowired
    private WeatherAPIService weatherAPIService;

    @RequestMapping("/")
    public String showSearch() {
        return "index";
    }


    // @RequestMapping("/")
    // public String showForecast(Model model) {
    // model.addAttribute("forecast", weatherAPIService.getForecastResponse());
    // System.out.println();
    // return "showforecast";
    // }

    @PostMapping("/")
    public String showSearch(@RequestParam double longitude, @RequestParam double latitude,
            Model model) {
        model.addAttribute("forecast", weatherAPIService.getForecastResponse(latitude, longitude));
        System.out.println(model.toString());
        return "showforecast";
    }


}
