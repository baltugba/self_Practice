package day29_practice.PhoneTask;

public class Phone {
   private String brand,model,size,color;
   private double price;

    public void setInfo(String brand, String model, String size, String color, double price) {
        setBrand(getClass().getSimpleName());// brand is gonna be classname itself
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand==null|| brand.isBlank()|| brand.isEmpty()){
            System.err.println("Brand can not be null or empty or blank");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model==null|| model.isEmpty()|| model.isBlank()){
            System.err.println("Model can nor be null or empty pr blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color==null || color.isBlank()||color.isEmpty()){
            System.err.println("Color can not be null or blank or empty");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <=0){
            System.err.println("Price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }
    public void call(long phoneNumber){
        System.out.println("Calling phone number is: "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("Texting phone number: "+phoneNumber);
    }
    public void freeze(){
        System.out.println(getModel()+ " is freezing");
    }


    public String toString() {
        return getClass().getSimpleName() +"{" +//
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. brand can not be null/empty/blank
						2. model can not be null/empty/blank
						3. Color can not be null/empty/blank
						4. price can not be zero or negative

				Methods:
					setInfo(): sets the brand to "Apple" and rest of the fields will be set based on the given arguments
					call(long phoneNumber)
					text(long phoneNumber)
					faceTime(long phoneNumber)
					faceTime(String email)
					toString(): prints Iphone object info when the object is passed in the print statement
 */