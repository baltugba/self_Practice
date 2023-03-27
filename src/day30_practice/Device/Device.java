package day30_practice.Device;

public class Device {
    private String brand,model,color,size;
    private double price;
    private static boolean hasBattery= true;
    private static boolean hasPowerButton = true;

    public Device(String brand, String model, String color, String size, double price,boolean hasBattery,boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null){
            System.err.println("Brand can not be null");
            System.exit(1);
        }
        if(brand.isEmpty()|| brand.isBlank()){
            System.err.println("Brand can not be empty or blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null){
            System.err.println("Model can not be null");
            System.exit(1);
        }
        if(model.isBlank()|| model.isBlank()){
            System.err.println("Model can not be empty or blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price can not be negative or zero");
        }
        this.price = price;
    }

    public static boolean isHasBattery() {
        return hasBattery;
    }

    public static void setHasBattery(boolean hasBattery) {
        Device.hasBattery = hasBattery;
    }

    public static boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public static void setHasPowerButton(boolean hasPowerButton) {
        Device.hasPowerButton = hasPowerButton;
    }
    public void turnOn(){
        System.out.println(brand+ model+" is turning on");
    }
    public void turnOff(){
        System.out.println(brand+model+" is turning off");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ",hasBatery"+hasBattery+
                ",hasPowerButton"+ hasPowerButton+
                '}';
    }
}
/*
1. Create a class named Device
			Variables:
				brand, model, color, size, price
				hasBattery, hasPowerButton

			Encapsulate all the fields
					Conditions:
						1. brand, model can not be null (
						2. brand, model can not be empty or blank
						3. price can not be zero or negative

			Methods
				turnOn()
				turnOff()
				toString(
 */