package day17_practice;

public class SalaryCalculator {
    public double hourlyRate,stateTaxRate,federalTaxRate,weeklyHours,stateTax,federalTax,salary,salaryAfterTax;


// set info
    public void setInfo(double hourlyRate, double stateTaxRate, double federalTaxRate, double weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;

    }
    public double salary(){
        salary= weeklyHours * hourlyRate * 52;
        return salary;
    }
    public double federalTax(){
         federalTax = salary() * stateTaxRate / 100;
        return federalTax;
    }
    public double stateTax(){
         stateTax= salary() * stateTaxRate / 100;
        return stateTax;
    }
    public double salaryAfterTax(){
         salaryAfterTax=stateTax()+federalTax()-salary();
        return salaryAfterTax;
    }

//to string
    public String toString() {
        return "SalaryCalculator{" +
                "hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                ", weeklyHours=" + weeklyHours +
                ", stateTax=" + stateTax +
                ", federalTax=" + federalTax +
                ", salary=" + salary +
                ", salaryAfterTax=" + salaryAfterTax +
                '}';
    }

    public static void main(String[] args) {
        SalaryCalculator calculate1 = new SalaryCalculator();
        calculate1.setInfo(15.9,7.5,8.5,35);
        calculate1.salary();
        calculate1.federalTax();
        calculate1.stateTax();
        calculate1.salaryAfterTax();
        System.out.println(calculate1);


    }
}
/*
. Create a custom class named SalaryCalculator
        Attributes:
            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

            (stateTaxRate and federalTaxRate will be given as percentage, you will responsible for converting them to decimals)

        Actions:
            setInfo(): sets all the fields of SalaryCalculator object
            salary(): calculates the salary ( hourlyRate * weeklyHour * 52) and returns it as double
            stateTax(): calculates the total state tax, and returns it as double
            federalTax(): calculates the total federal tax, and returns it as double
            salaryAfterTax(): calculates the salary after tax, and returns it as double
            toString(): when a SalaryCalculator object is passed in print statement,
            	it should displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */