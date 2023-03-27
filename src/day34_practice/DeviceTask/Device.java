package day34_practice.DeviceTask;

public abstract class Device {
    private final String brand,model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
   private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if(model==null|| model.isEmpty()){
            System.err.println("Model can not be null or empty");
            System.exit(1);
        }
        if(getClass().getSimpleName()==null|| getClass().getSimpleName().isEmpty()){
            System.err.println("Brand can not be null or empty");
            System.exit(1);
        }
        this.brand = brand;
        this.model = model;
        setPrice(price);
        setColor(color);
        if(size== null|| size.isEmpty()){
            System.err.println("Size can not be null or empty");
            System.exit(1);
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color== null|| color.isEmpty()){
            System.err.println("Color can not be null or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {

        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }
    //abstract methods
    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
 */