package day25_practice;

public class Pizza {

    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    public double calcCost(){
        double totalCost=0;
        if(size=='S'){
            totalCost +=10+(2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping);
        }
        if(size=='M'){
            totalCost+= 12+(2*numberOfCheeseTopping)+(2*numberOfPepperoniTopping);
        }
        if(size=='L'){
            totalCost+=14+(2*numberOfPepperoniTopping)+(2*numberOfCheeseTopping);
        }
        return totalCost;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ",total cost of pizza is: "+ calcCost()+
                '}';
    }
}
/*
 Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */