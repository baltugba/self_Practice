package day17_practice;

public class Address {
    public String buildingNumber, street, city, state;
    public int zipCode;

    public void setInfo(String buildingNumber, String street, String city, String state, int zipCode) {
        this.buildingNumber = buildingNumber;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }


    public String toString() {
        return "Address{" +
                "buildingNumber='" + buildingNumber + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }

    public void shippingAddress() {
        System.out.println("Shipping address is:"+"\n" + buildingNumber+" " + street+" " + "\n" + city+" " + state+" " + zipCode);
    }


    public static void main(String[] args) {
        Address ship1 = new Address();
        ship1.setInfo("Alpharetta","Cadeleigh","Ga","hgart",3005);
       ship1.shippingAddress();

        //System.out.println(ship1);




}
    }












/*

5. Create a class named Address
    Attributes:
        buildingNumber, street, city, state, zipCode

    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:
                            7925 Jones Branch Dr
                            McLean Va, 22012
 */