package com.proyecto.models;

public class Empleado {
    private int employeeId;
    private String employeeName;
    private String jobTitle;
    private String branch; // Puedes cambiar a un objeto Sucursal si lo deseas

    
    public int getEmployeeId() {
		return employeeId;
	}
    public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
    
    public String getEmployeeName() {
		return employeeName;
	}
    public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
    
    public String getJobTitle() {
		return jobTitle;
	}
    public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
    
    public String getBranch() {
		return branch;
	}
    public void setBranch(String branch) {
		this.branch = branch;
	}
}
