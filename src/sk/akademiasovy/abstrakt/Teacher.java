package sk.akademiasovy.abstrakt;

public class Teacher extends Person {
    @Override
    public void info()
    {

        System.out.println("I am teacher");

    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
