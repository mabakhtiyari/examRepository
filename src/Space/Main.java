package Space;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Planet zohre = new Planet("zohre","Milky way",PlanetType.Rock,"1","5000",false,false);
        zohre.addMoon(10);

        SpecialPlanet earth2 = new SpecialPlanet("earth2",PlanetType.Rock,"2000",3,true,true);
        SpecialPlanet mars2 = new SpecialPlanet("mars2",PlanetType.Rock,"1000",20,false,true);
        earth2.checkResources();
        earth2.checkLifeStyle();

        mars2.checkLifeStyle();
        mars2.checkResources();



        Scanner s = new Scanner(System.in);
        viewPlanets();
        String planet = addPlanet(s);
    }

    public static void viewPlanets(){
        File planetFile = new File("D:\\test111111\\Planets.txt");
        try {
            try (Scanner scanner = new Scanner(planetFile)) {
                while (scanner.hasNextLine()) {
                    String planetString = scanner.nextLine();
                    String planetName = planetString.split(",")[0];
                    String galaxy = planetString.split(",")[1];
                    String planetType = planetString.split(",")[2];
                    String moonCount = planetString.split(",")[3];
                    String distanceToSun = planetString.split(",")[4];
                    String hasLife = planetString.split(",")[5];
                    String resource = planetString.split(",")[6];
                    Planet planet = new Planet(planetName,galaxy,planetType,moonCount,distanceToSun,hasLife,resource);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static String addPlanet (Scanner scanner) {
        System.out.println("Enter Planet data:");
        String planetString = scanner.nextLine();
        String planetName = planetString.split(",")[0];
        String galaxy = planetString.split(",")[1];
        String planetType = planetString.split(",")[2];
        String moonCount = planetString.split(",")[3];
        String distanceToSun = planetString.split(",")[4];
        String hasLife = planetString.split(",")[5];
        String resource = planetString.split(",")[6];
        Planet planet = new Planet(planetName,galaxy,planetType,moonCount,distanceToSun,hasLife,resource);

        return planetString;
    }
}
