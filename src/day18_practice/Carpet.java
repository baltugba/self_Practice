package day18_practice;

public class Carpet {
    public double width,length,unitePrice;
    public boolean isPersian;

    public void setInfo(double width, double length, double unitePrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitePrice = unitePrice;
        this.isPersian = isPersian;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitePrice=" + unitePrice +
                ", isPersian=" + isPersian +
                '}';
    }
    public double calculateCost(){
        double totalPrice = (width*length)*unitePrice;
        if(isPersian){
            totalPrice+=200*unitePrice;
        }
       return totalPrice;
    }

    public static void main(String[] args) {
        Carpet carpet1 = new Carpet();
        carpet1.setInfo(2.5,3.5,10,true);

        System.out.println(carpet1);
        carpet1.calculateCost();

        System.out.println(carpet1.calculateCost());


    }
}
/*

4. Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice
 */