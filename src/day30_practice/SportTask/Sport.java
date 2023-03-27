package day30_practice.SportTask;

public class Sport{
    private String name;
    private int NumberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public Sport(String name, int numberOfPlayers, int numberOfReferee, String rules) {
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return NumberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if(numberOfPlayers <= 0){
            System.err.println("Number of players can not be zero or negative");
            System.exit(1);
        }
        NumberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if(numberOfReferee <= 0){
            System.err.println("Number of referee");
        }
        this.numberOfReferee = numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }
    public void play(){
        System.out.println(name+" is playing with " + NumberOfPlayers);
    }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", NumberOfPlayers=" + NumberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}
