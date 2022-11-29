package tutorialsolution6.exercise2;

public class Main {
    public static void main(String[] args) {
        // Create a generic Person object (Parent class)
        Person myPerson = new Person("Tom", "256 Hai Ba Trung street, District 1, Saigon");
        // Create a Student object (child class)
        Student myStudent = new Student("Jerry", "702 Nguyen Van Linh street, District 7, Saigon", "Software Engineering", 2007, 50000);
        // Create a Staff object (child class)
        Staff myStaff = new Staff("Phong", "521 Kim Ma street, Ngoc Khanh, Ha Noi", "RMIT University", 5000);

        // Testing myPerson object
        System.out.println("Testing myPerson object:");
        System.out.println("Before:"+ myPerson);
        myPerson.setAddress("153 Nguyen Hue, District 1, Saigon");
        System.out.println("After:"+ myPerson);
        System.out.println("---------------------");

        // Testing myStudent object
        System.out.println("Testing myStudent object:");
        System.out.println("Before:"+ myStudent);
        myStudent.setAddress("521 Tran Hung Dao, District 3, Saigon");
        myStudent.setProgram("Information Technology");
        myStudent.setFee(70000);
        System.out.println("After:"+ myStudent);
        System.out.println("---------------------");

        // Testing myStaff object
        System.out.println("Testing myStaff object:");
        System.out.println("Before:"+ myStaff);
        myStaff.setAddress("Parkville, Victoria, Melbourne, Australia");
        myStaff.setSchool("University of Melbourne");
        myStaff.setPay(10000);
        System.out.println("After:"+ myStaff);
        System.out.println("---------------------");
    }
}
