package tutorialsolution9.exercise4;

public class Employee implements Comparable<Employee> {
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;

    public Employee(String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
    }

    public int calculateWeeklySalary(){
        return getSalaryPerHour()*8*
                (5-getNoOfLeavingDay()+getNoOfTravelDay()/2);
    }

    public int compareTo(Employee obj){
        final int RANK_LOWER = -1;
        final int RANK_EQUAL = 0;
        final int RANK_HIGHER = 1;
        if (this.getNoOfTravelDay()>obj.getNoOfTravelDay()){
            return RANK_HIGHER;
        } else if (this.getNoOfTravelDay()==obj.getNoOfTravelDay()){
            if (this.getNoOfLeavingDay()<obj.getNoOfLeavingDay()){
                return RANK_HIGHER;
            } else {
                return RANK_LOWER;
            }
        } else{
            return RANK_LOWER;
        }
    }

    @Override
    public String toString() {
        return String.format("[Name:%s = Salary Per Hour: %d - Weekly Salary:%d]\n",
                getEmployeeName(),getSalaryPerHour(), calculateWeeklySalary());
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(int salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public int getNoOfLeavingDay() {
        return noOfLeavingDay;
    }

    public void setNoOfLeavingDay(int noOfLeavingDay) {
        this.noOfLeavingDay = noOfLeavingDay;
    }

    public int getNoOfTravelDay() {
        return noOfTravelDay;
    }

    public void setNoOfTravelDay(int noOfTravelDay) {
        this.noOfTravelDay = noOfTravelDay;
    }
}
