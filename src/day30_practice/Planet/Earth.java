package day30_practice.Planet;

public class Earth extends Planet{
    public static boolean hasOxygen = true;
    public static boolean hasLife = true;
    public static boolean hasWater = true;

    public Earth( double mass, double radius, double surfaceGravity, double surfaceArea, double volume) {
        super("Earth", mass, radius, surfaceGravity, surfaceArea, volume, 0);
    }

    public static boolean isHasOxygen() {
        return hasOxygen;
    }

    public static void setHasOxygen(boolean hasOxygen) {
        Earth.hasOxygen = hasOxygen;
    }

    public static boolean isHasLife() {
        return hasLife;
    }

    public static void setHasLife(boolean hasLife) {
        Earth.hasLife = hasLife;
    }

    public static boolean isHasWater() {
        return hasWater;
    }

    public static void setHasWater(boolean hasWater) {
        Earth.hasWater = hasWater;


    }
}
