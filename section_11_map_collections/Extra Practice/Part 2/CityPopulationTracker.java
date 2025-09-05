import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker() {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String cityName) {
        return new City(cityPopulations.get(cityName));
    }

    public void setCity(City newCity) {
        cityPopulations.put(newCity.getName(), new City(newCity));
    }

    public void addCity(City city) {
        cityPopulations.put(city.getName(), new City(city));
    }

}
