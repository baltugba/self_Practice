package day28_practice;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;
//encapsulation
    public String getSize() {//getter
        return size;
    }

    public void setSize(String size) {//setter
        if(!size.equalsIgnoreCase("Small") || size.equalsIgnoreCase("Medium")||size.equalsIgnoreCase("Large")) {
            System.err.println("Chosen size must be small or medium or large");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if(numberOfCheeseTopping < 0){
            System.err.println("Number of cheese topping can not be negative");
            System.exit(1);
        }
        if(size.equalsIgnoreCase("small")&& numberOfCheeseTopping > 3){
            System.err.println("For small size pizza maximum topping is 3 ");
            System.exit(1);
        }
        if(size.equalsIgnoreCase("Medium") && numberOfCheeseTopping > 4){
            System.err.println("For medium size pizza maximum topping is 4");
            System.exit(1);
        }
        if(size.equalsIgnoreCase("Large")&& numberOfCheeseTopping > 5){
            System.err.println("For large size pizza maximum topping is 5");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.err.println("Number of pepperoni topping can not be negative");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("Small")&& numberOfPepperoniTopping > 4){
            System.err.println("For small size pizza maximum topping is 4");
            System.exit(1);

        }
        if (size.equalsIgnoreCase("Medium") && numberOfPepperoniTopping > 5){
            System.err.println("For medium size pizza maximum topping is 5");
            System.exit(1);
        }
        if (size.equalsIgnoreCase("Large")&& numberOfPepperoniTopping > 6){
            System.err.println("For large size pizza maximum topping is 6");
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    //constructor to set instance variable by using setter method


    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }
    //instance method
    public double calcCost(){

        double total = 0;
        switch (getSize()){
            case "small":
                total = 10 + 2*getNumberOfCheeseTopping()+getNumberOfPepperoniTopping();
                break;
            case "medium":
                total = 12 + 2* getNumberOfPepperoniTopping()+getNumberOfCheeseTopping();
                break;
            case "large":
                total = 14 + 2*getNumberOfCheeseTopping()+getNumberOfPepperoniTopping();
                break;
            default:
                System.err.println("not valid size");
        }
        return total;


    }

    public String toString() {
        return "Pizza{" +
                "size='" + getSize() + '\'' +
                ", numberOfCheeseTopping=" + getNumberOfCheeseTopping() +
                ", numberOfPepperoniTopping=" + getNumberOfPepperoniTopping() +
                ",totalCost=" +calcCost()+
                '}';
    }

    public static void main(String[] args) {

        Pizza p1 = new Pizza("small",2,2);

        System.out.println(p1);


        System.out.println(p1.getNumberOfPepperoniTopping());
       
    }
}

/*
Create class named Pizza:
                private variables:
                    size, numberOfCheeseTopping, numberOfPepperoniTopping

                Encapsulate all the fields
                        Conditions:
                            size of the pizza can only be small, medium, large. case insensitive

                            Number of cheese topping can not be negative, the maximum number of cheese topping is:
                                        small: 3
                                        medium: 4
                                        large: 5

                            Number of pepperoni topping can not be negative, the maximum number of pepperoni topping is:

                                        small: 4
                                        medium: 5
                                        large: 6

                Add a constructor that allows user to set all the fields when the object is created.
                                (If the arguments not valid it should not be set to the instances)


                Methods:
                    calcCost(): returns the totalCost of the pizza
                    toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()


        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */