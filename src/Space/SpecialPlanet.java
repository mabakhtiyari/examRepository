package Space;

public class SpecialPlanet extends Planet implements PlanetMethodes{

    private boolean hasLife;
    private boolean hasResource;

    public SpecialPlanet(String name, PlanetType planetType, String distanceToSun, int moonCount, boolean hasLife, boolean hasResource) {
        super(name);
        this.hasLife = hasLife;
        this.hasResource = hasResource;
    }

    public boolean isHasLife() {
        return hasLife;
    }

    public void setHasLife(boolean hasLife) {
        this.hasLife = hasLife;
    }

    public boolean isHasResource() {
        return hasResource;
    }

    public void setHasResource(boolean hasResource) {
        this.hasResource = hasResource;
    }

    @Override
    public void checkLifeStyle() {
        if(hasLife==true){
            System.out.println("The Planet Has Life");
        }
        else {
            System.out.println("The Planet Has not Life");
        }

    }

    @Override
    public void checkResources() {
        if(hasResource==true){
            System.out.println("The Planet Has Resource");
        }
        else {
            System.out.println("The Planet Has not Resource");
        }

    }

    }

