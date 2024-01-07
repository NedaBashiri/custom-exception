package entity;

public class Country {

    private String name;
    private String countryCode;
    private long population;

    public Country() {
    }

    public Country(String name, String countryCode, long population) {
        this.name = name;
        this.countryCode = countryCode;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public long getPopulation() {
        return population;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public Country setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public Country setPopulation(long population) {
        this.population = population;
        return this;
    }
}

