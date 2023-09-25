package Practice;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax;

        if (salary > 1000) {
            tax = salary * 0.03;
        } else {
            tax = 0;
        }

        return tax;
    }

    double bonus() {
        double bonus;

        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        } else {
            bonus = 0;
        }

        return bonus;
    }

    double raiseSalary() {
        double raiseSalary;
        int year = 2022 - hireYear;

        if (year < 10) {
            raiseSalary = salary * 0.05;
        } else if (year < 20) {
            raiseSalary = salary * 0.10;
        } else {
            raiseSalary = salary * 0.15;
        }

        return raiseSalary;
    }

    double total() {
        return salary - tax() + bonus() + raiseSalary();
    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Salary = " + salary + "\n" +
                "Work Hours = " + workHours + "\n" +
                "Hire Year = " + hireYear + "\n" +
                "Tax = " + tax() + "\n" +
                "Bonus = " + bonus() + "\n" +
                "Raise Salary = " + raiseSalary() + "\n" +
                "Total Salary = " + total();
    }
}
