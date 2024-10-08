package Space;

public class Planet {
    private String name;
    private PlanetType planetType;
    private String distanceToSun;
    private int moonCount;


    public Planet(String name) {
        this.name = name;
        this.planetType = planetType;
        this.distanceToSun = distanceToSun;
        this.moonCount = moonCount;
    }

    public Planet(String planetName, String galaxy, String planetType, String moonCount, String distanceToSun, String hasLife, String resource) {
    }

    public Planet(String zohre, String milky_way, PlanetType rock, String moonCount, String distanceToSun, boolean b, boolean b1) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlanetType getPlanetType() {
        return planetType;
    }

    public void setPlanetType(PlanetType planetType) {
        this.planetType = planetType;
    }

    public String getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(String distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public int getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(int moonCount) {
        this.moonCount = moonCount;
    }

    public void addMoon(int a){
        setMoonCount(a);
    }

}
