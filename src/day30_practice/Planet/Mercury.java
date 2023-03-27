package day30_practice.Planet;

public class Mercury extends Planet{
    public Mercury( double mass, double radius, double surfaceGravity, double surfaceArea, double volume) {
        super("Mercury", mass, radius, surfaceGravity, surfaceArea, volume, 0);
    }
    public void smallestPlanet(){
        System.out.println(getName()+ " is smallest planet");
    }

}
