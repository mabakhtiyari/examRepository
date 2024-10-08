package Space;

import java.util.List;

public class Galaxy {
    private String name;
    private List<Planet> planetList;

    public Galaxy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
}
