package day29_practice.CarTask;

public class Car {
    private String make,model,color;
    private int year;
    private double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year<=0){
            System.err.println("Year can not be negative or zero");
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Price can not be negative or zero");
        }
        this.price = price;
    }

    public void setInfo(String model, String color, int year, double price) {

        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "make='" + getClass().getSimpleName() + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
