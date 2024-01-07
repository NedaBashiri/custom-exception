package service;

import entity.Country;
import exception.NullCountryNameException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class App {
    private static final Logger LOGGER = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        Country usa = new Country("United States", "USA", 331000000);
        Country uk = new Country("United Kingdom", "UK", 68000000);
        Country canada = new Country("Canada", "CAN", 38000000);
        Country iran = new Country("Iran", "IR", 84614000);
        Country chin = new Country("Chin", "CN", 1444216107);
        Country india = new Country("India", "IN", 1412140100);
        Country iraq = new Country("", "IQ", 45504579);
        Country pakistan = new Country("", "PK", 242474743);

        Map<String, Country> countryMap = new HashMap<>();
        countryMap.put(usa.getCountryCode(), usa);
        countryMap.put(uk.getCountryCode(), uk);
        countryMap.put(canada.getCountryCode(), canada);
        countryMap.put(iran.getCountryCode(), iran);
        countryMap.put(chin.getCountryCode(), chin);
        countryMap.put(india.getCountryCode(), india);
        countryMap.put(iraq.getCountryCode(), iraq);
        countryMap.put(pakistan.getCountryCode(), pakistan);


        for (Map.Entry<String, Country> entry : countryMap.entrySet()) {
            Country country = entry.getValue();
            try {
                if (country.getName() != null && !country.getName().equals("")) {
                    System.out.println("Abbreviation code: " + entry.getKey() + "\n" + "Country: " + entry.getValue().getName() +
                            ", Code: " + entry.getValue().getCountryCode() +
                            ", Population: " + entry.getValue().getPopulation());
                } else {
                    throw new NullCountryNameException("country name is empty.");
                }
            } catch (NullCountryNameException ex) {
                System.err.println(ex);
                LOGGER.error(ex);
            }
        }

    }
}
