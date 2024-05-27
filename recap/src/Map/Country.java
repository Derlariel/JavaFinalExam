package Map;

public class Country {
    private String Country , City;

    public Country(String country, String city) {
        Country = country;
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Country{");
        sb.append("Country='").append(Country).append('\'');
        sb.append(", City='").append(City).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
