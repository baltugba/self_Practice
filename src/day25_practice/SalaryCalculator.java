package day25_practice;

public class SalaryCalculator {

    public double hourlyRate;
    public double weeklyHours;
    public double stateTaxRate;
    public double federalTaxRate;

    public SalaryCalculator(double hourlyRate, double weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary(){
        double salary =  hourlyRate * weeklyHours * 52;
        return salary;
    }
    public double stateTax(){
        double stateTaxTotal = salary() * stateTaxRate/100;
        return stateTaxTotal;
    }
    public double federalTax(){
        double federalTaxTotal = salary() * federalTaxRate/100;
        return federalTaxTotal;
    }
    public double salaryAfterTax(){
        double salaryAfterTax= (federalTax()+stateTax())-salary();
        return salaryAfterTax;
    }


    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", salary="+ salary()+
                "stateTax = "+ stateTax()+
                "federalTax = "+ federalTax()+
                " salaryAfterTax = "+ salaryAfterTax()+
                '}';
    }
}
/*
Create a custom class named SalaryCalculator:
        1.1 Create a class named Salary calculator:
                Attributes:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate

                Add a constructor to set all the fields

                Actions:
                    salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
                    stateTax(): calculates the total state tax
                    federalTax(): calculates the total federal tax
                    salaryAfterTax(): calculates the salary after tax
                    toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */