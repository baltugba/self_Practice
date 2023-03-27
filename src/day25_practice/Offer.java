package day25_practice;

public class Offer {
    public String location,companyName,jobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO,isWTH,isFullTime;

    public Offer(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWTH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWTH = isWTH;
        this.isFullTime = isFullTime;
    }


    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWTH=" + isWTH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
/*
Create a custom class named Offer
            Attributes:
                    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

                Add a constructor that can set all the fields

            Actions:
                toString(): returns the full info of the Offer Object

 */