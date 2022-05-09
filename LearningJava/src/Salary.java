public class Salary {
    public static double calculateSalary(double hoursWorked, double hourlyRate) {
        double salary = hoursWorked * hourlyRate * 52;
        return salary;
    }

    public static void main(String args[]) {
        double hoursWorked = 40;
        double hourlyRate = 60;

        double salary = calculateSalary(hoursWorked, hourlyRate);
        System.out.println("The salary for " + hoursWorked + " hours per week at " +
                hourlyRate + " per hour is $" + salary + " per year (gross).");
    }
}
