package day29_practice.PhoneTask;

public class TestPhone {
    public static void main(String[] args) {

        IPhone iphone1 = new IPhone();
        iphone1.setInfo("IPhone","14 pro","max","Blue",1200);

        Samsung sam1 = new Samsung();
        sam1.setInfo("Samsung","Galaxy","max","Black",1000);

        Nokia nok1 = new Nokia();
        Nokia nok2 = new Nokia();
        nok1.setInfo("Nokia","5252","xxl","Gray",450);
        nok2.setInfo("","bd","med","red",250);


        System.out.println(iphone1);
        System.out.println(sam1);
        System.out.println(nok1);
        System.out.println(nok2);

        nok1.selfDefense();
        nok1.call(123456789);


        iphone1.faceTime(12345674);
        iphone1.call(123456789);
        iphone1.faceTime("gf@gh.com");



        sam1.freeze();
        sam1.call(123456789);


    }
}
