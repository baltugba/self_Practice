package day30_practice.Device;

public class MyDevice {
    public static void main(String[] args) {

        IPhone iPhone = new IPhone("IPhone","13 pro","Black","medium",1200,true,true);

        Samsung samsung = new Samsung("Samsung","Galaxy","Blue","Medium",1100,true,true);

        Nokia nokia = new Nokia("Nokia","n85","Gray","small",50,true,true);

        BlackBerry blackBerry =new BlackBerry("BlackBerry","Berry","Pink","Small",950,true,true);

        Google google = new Google("Google","pixar","Black","Large",1200,true,true);

        PersonalComputer percom = new PersonalComputer("Lg","lgx","Black","Small",1100,false,true);

        Deskop deskc = new Deskop("Lg","lgXL","Black","Medium",1000,true,true);

        LapTop lapTop = new LapTop("Lenovo","Ryzen","gray","Meduim",1400,true,true);

        SmartTv smartTv = new SmartTv("Sony","SonyS","Black","Large",4000,false,true);

        System.out.println(blackBerry);
        System.out.println(nokia);
        System.out.println(iPhone);
        System.out.println(samsung);
        System.out.println(google);

        System.out.println(percom);
        System.out.println(lapTop);
        System.out.println(deskc);
        System.out.println(smartTv);

        iPhone.call();
        samsung.text();

        smartTv.channelDown();

    }
}
