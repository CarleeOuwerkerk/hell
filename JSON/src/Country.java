import java.io.Serializable;

/**
 * Created by Carlee on 2016-10-29.
 */
public class Country implements Serializable{

    private String name;
    private String continent;
    private Integer population;

    public Country(String name, String continent, Integer population) {
        this.name = name;
        this.continent = continent;
        this.population = population;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public String getContinent(){
        return this.continent;
    }

    public void setContinent(){
        this.continent = continent;
    }

    public Integer getPopulation(){
        return this.population;
    }

    public void setPopulation(){
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", population=" + population +
                '}';
    }
}
