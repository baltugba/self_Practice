package day30_practice.SportTask;

public class TestSportObject {
    public static void main(String[] args) {



        Baseball baseball = new Baseball(8,4,"player needs to run fast");

        Soccer soccer = new Soccer(12,6,"you must use you foot","has more responsibility");

        AmericanFootball americanFootball= new AmericanFootball(2,3,"There is no offside");

       Basketball basketball = new Basketball(6,8,"Player must bounce");

        System.out.println(soccer);
        System.out.println(basketball);
        System.out.println(baseball);
        System.out.println(americanFootball);

    }
}
