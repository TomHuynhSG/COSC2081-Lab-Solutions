package tutorialsolution9.exercise4;

import java.util.Calendar;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Project myProject = new Project("A101", new Date(2021,Calendar.APRIL,01), new Date(2021,Calendar.APRIL,04));
        Employee e1 = new Employee("E101","Jerry",500,1,4);
        Employee e2 = new Employee("E102","Tom",200,2,3);
        Employee e3 = new Employee("E103","Gary",300,1,2);
        Employee e4 = new Employee("E104","Jess",200,1,5);
        Employee e5 = new Employee("E105","Sinh",600,1,1);
        Employee e6 = new Employee("E106","Khanh",800,4,3);
        Employee e7 = new Employee("E107","Tu",300,1,3);
        myProject.addEmployee(e1);
        myProject.addEmployee(e2);
        myProject.addEmployee(e3);
        myProject.addEmployee(e4);
        myProject.addEmployee(e5);
        myProject.addEmployee(e6);
        myProject.addEmployee(e7);
        System.out.printf("My Project Budget Estimation: %d.\n",
                myProject.estimateBudget());
        System.out.printf("My Project Employee List based on their travel days and leaving days:\n%s\n",
                myProject);
    }
}
