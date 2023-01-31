package com.olufemi.questionone;

public class Employee {

    private int salary;
    private int numOfHoursWorkedPerDay;

    public void getInfo(int salary, int numOfHoursWorkedPerDay){
        this.salary = salary;
        this.numOfHoursWorkedPerDay = numOfHoursWorkedPerDay;
        System.out.println(salary);
        System.out.println(numOfHoursWorkedPerDay);
    }

    public void addSal(){
        if(this.salary < 500){
            this.salary = this.salary + 10;
        }
        System.out.println(this.salary);
    }

    public void addWork(){
        if(this.numOfHoursWorkedPerDay > 6){
            this.salary = this.salary +5;
        }
        System.out.println(this.salary);
    }

    public static void main(String[] args) {

        Employee employeeOne = new Employee();
        employeeOne.getInfo(10_000, 10);
        employeeOne.addSal();
        employeeOne.addWork();

        Employee employeeTwo = new Employee();
        employeeTwo.getInfo(100, 1);
        employeeTwo.addSal();
        employeeTwo.addWork();

        Employee employeeThree = new Employee();
        employeeThree.getInfo(400, 7);
        employeeThree.addSal();
        employeeThree.addWork();


    }

}
