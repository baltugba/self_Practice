package day31_practice.States;

public class States {// parent class
    private String name,abbreviation,politicalParty,Governor,senator;
    private double population,stateTax;

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, double population, double stateTax) {
        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(governor);
        setSenator(senator);
        setPopulation(population);
        setStateTax(stateTax);
    }

    //encapsulate all the fields


    public String getName() {
        if(name==null){
            System.err.println("name can not be null");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {

        if(name.isEmpty() || name.isBlank()){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        if(abbreviation==null){
            System.err.println("Abr=breviation can not be null");
            System.exit(1);
        }
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isEmpty()|| abbreviation.isEmpty()){
            System.err.println("Abbreviation can not be blank or null");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        if(politicalParty==null){
            System.err.println("Polical party can not be null");
            System.exit(1);
        }
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isEmpty() || politicalParty.isBlank()){
            System.err.println("Political party can not be empy or blank");
            System.exit(1);
        }

        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        if(Governor==null){
            System.err.println("Governer can not be null");
            System.exit(1);
        }


        return Governor;
    }

    public void setGovernor(String governor) {
        if(Governor.isEmpty() || Governor.isBlank()){
            System.err.println("Governor can not be empty or blank");
            System.exit(1);
        }
        Governor = governor;
    }

    public String getSenator() {
        if(senator==null){
            System.err.println("Senator can not be null");
            System.exit(1);
        }
        return senator;
    }

    public void setSenator(String senator) {
        if(senator.isEmpty() || senator.isBlank()){
            System.err.println("Senator can not be blank or empty");
            System.exit(1);
        }
        this.senator = senator;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        if(population <= 0){
            System.err.println("Population can not be zero or negative");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {

        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if(stateTax <0){
            System.err.println("State tax can not be negative");
        }

        this.stateTax = stateTax;
    }

    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
/*
 1. Create a class named States:
            variables:
                name, abbreviation, politicalParty, Governor, senator, population, stateTax

            Encapsulate all the fields

            Add a constructor that can set all the fields

                        Conditions:
                            1. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            2. name, abbreviation, politicalParty, Governor, and senator can not be null/empty/blank
                            3. taxRate can not be negative
                            4. Population can not be zero or negative
 */