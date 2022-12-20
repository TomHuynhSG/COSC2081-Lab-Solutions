package tutorialsolution9.exercise4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Collections;
public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployee;

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        listOfEmployee = new ArrayList<>();
    }

    public int estimateBudget(){
        final int MILLI_TO_HOUR = 1000 * 60 * 60;
        int totalHours = (int) (getEndDate().getTime() - getStartDate().getTime()) / MILLI_TO_HOUR;
        int budget=0;
        for (Employee e:getListOfEmployee()){
            budget+=e.getSalaryPerHour()*totalHours;
        }
        return budget;
    }

    @Override
    public String toString() {
        Collections.sort(getListOfEmployee());
        String result="";
        for(Employee e: getListOfEmployee()){
            result+= e.toString();
        }
        return result;
    }

    public ArrayList<Employee> getListOfEmployee() {
        return listOfEmployee;
    }

    public void addEmployee(Employee e) {
        this.listOfEmployee.add(e);
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }


}
