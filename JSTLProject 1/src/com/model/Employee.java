package com.model;

public class Employee {
	private long emlpoyeeId;
	private String employeeName ;
	
	
	public Employee() {
		super();
		
	}
	
	public Employee(long emlpoyeeId, String employeeName) {
		super();
		this.emlpoyeeId = emlpoyeeId;
		this.employeeName = employeeName;
	}


	public long getEmlpoyeeId() {
		return emlpoyeeId;
	}
	public void setEmlpoyeeId(long emlpoyeeId) {
		this.emlpoyeeId = emlpoyeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	

}
