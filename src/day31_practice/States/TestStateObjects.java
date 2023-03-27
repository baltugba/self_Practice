package day31_practice.States;

public class TestStateObjects {
    public static void main(String[] args) {

        California c = new California("California","CA","Democrat","Gavin Newson","Benjamin Allen",39.24,7.25);

        Florida f = new Florida("Florida","Fl","Republican","Ron Desantis","Marco Ruboo",21.00,6.0);

        Texas t = new Texas("Texas","Tx","Republican","Greg Abbot","Ted Cuz",29.00,6.25);

        Virginia v =new Virginia("Virginia","VA","Democrat","Glen youngkin","Mark Varner",86.42,5.3);

        System.out.println(f);
        System.out.println(c);
        System.out.println(t);
        System.out.println(v);
    }
}
