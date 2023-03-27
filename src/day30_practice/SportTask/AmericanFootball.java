package day30_practice.SportTask;

public class AmericanFootball extends Sport{
    public AmericanFootball( int numberOfPlayers, int numberOfReferee, String rules) {
        super("Amerikanfootball", numberOfPlayers, numberOfReferee, rules);
    }

    public void wearingSpecialEquipment(){
        System.out.println(getName()+ " is wearing spacial equipment for protect hisself ");
    }

}
