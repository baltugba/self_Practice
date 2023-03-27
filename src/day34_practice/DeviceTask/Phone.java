package day34_practice.DeviceTask;

public abstract class Phone extends Device{
    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, true, true);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand()+" "+getModel()+" has turned on after pressing and holding the power button");

    }

    @Override
    public void turnOff() {
        System.out.println(getBrand()+" "+getModel()+" has turned off after pressing and holding the power button");

    }

    public void call(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is calling: "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println(getBrand()+" "+getModel()+" is texting: "+phoneNum);

    }
    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                " color='" + getColor() + '\'' +
                " size='" + getSize() + '\'' +
                " has battery=" + isHasBattery() +
                " has power button=" + isHasPowerButton() + '}';

}

}
/*
Extra Methods (none Abstract):
						call(long phoneNum)
						text(long phoneNum)
						toString()
 */