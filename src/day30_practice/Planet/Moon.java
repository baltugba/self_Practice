package day30_practice.Planet;

public class Moon extends Planet{
    public Moon( double mass, double radius, double surfaceGravity, double surfaceArea, double volume, long population) {
        super("Moon", mass, radius, surfaceGravity, surfaceArea, volume, 0);
    }
    public void earthsSatellite(){
        System.out.println(getName()+ " is earths satellite ");
    }
}
