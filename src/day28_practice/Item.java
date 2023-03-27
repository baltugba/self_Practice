package day28_practice;

public class Item {
    //attributes
    //instance variable
    private String name;
    private double unitPrice;
    private int quantity;

    //encapsulation of instance variable
    public String getName() {//getter
        return name;
    }

    public void setName(String name) {//setter
        if(name.isEmpty()|| name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(1
            );
        }
        for (char each :name.toCharArray()){
            if(!Character.isLetter(each) && each!=' '){
                System.err.println("name can not contain any special characters");
                System.exit(1);

            }
            if(!Character.isLetter(name.charAt(0))){
                System.err.println("Name must start with letters");
                System.exit(1);
            }
            this.name=name;
        }

    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice < 0){
            System.err.println("Unit price can not be negative number");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {//getter
        return quantity;
    }

    public void setQuantity(int quantity) {//setter
        if(quantity < 0){
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }
        if(getName().equalsIgnoreCase("toilet Paper")&& quantity > 1){
            System.err.println("Invalid quantity for " + name + " "+ quantity);
            System.exit(1);
        }
        this.quantity = quantity;
    }
//parametrized construcktor to set all instance variables
    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
       setQuantity(quantity);
    }
    //action
    //instance methos
    public double cost(){
        return getQuantity()*getUnitPrice();
    }

    public String toString() {
        return "Item{" +
                "name='" + getName() + '\'' +
                ", unitPrice=" + getUnitPrice() +
                ", quantity=" + getQuantity() +
                ",totalCost="+cost()+
                '}';
    }

    public static void main(String[] args) {

        Item item1 = new Item("apple",2,2);
        System.out.println(item1);
        System.out.println(item1.quantity);
        System.out.println(item1.getUnitPrice());
        System.out.println(item1.cost());

        Item item2 = new Item("toilet paper",5,3);
        System.out.println(item2);
        System.out.println(item2.getUnitPrice());


    }
}
/*
create a class called Item
        private variables:
            name, unitPrice, quantity

        Encapsulate all the fields:
            Conditions:
                name can not be empty or blank
                name can not contain any special characters other than space
                name must start with letters
                unit price can not be negative
                quantity can not be negative
                if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


        Add a constructor that allows user to set all the fields when the object is created.
                (If the arguments not valid it should not be set to the instances)

        Methods:
            calcCost(): returns the total cost
            toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()
 */