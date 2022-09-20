package com.mindex.challenge.data;

public class ReportingStructure {
    private Employee employee;
    private int countOfReports;

    public ReportingStructure(Employee employee, int countOfReports) {
        this.employee = employee;
        this.countOfReports = countOfReports;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getCountOfReports() {
        return this.countOfReports;
    }

    public void setCountOfReports(int numberOfReports) {
        this.countOfReports = countOfReports;
    }

    public ReportingStructure employee(Employee employee) {
        this.employee = employee;
        return this;
    }

    public ReportingStructure countOfReports(int countOfReports) {
        this.countOfReports = countOfReports;
        return this;
    }


}
