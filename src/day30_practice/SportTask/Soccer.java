package day30_practice.SportTask;

public class Soccer extends Sport {

    private String goalKeeper;

    public Soccer( int numberOfPlayers, int numberOfReferee, String rules, String goalKeeper) {
        super("Soccer", numberOfPlayers, numberOfReferee, rules);
        setGoalKeeper(goalKeeper);
    }

    public String getGoalKeeper() {
        return goalKeeper;
    }

    public void setGoalKeeper(String goalKeeper) {

        this.goalKeeper = goalKeeper;
    }
}
