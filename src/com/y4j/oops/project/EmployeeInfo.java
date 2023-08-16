package com.y4j.oops.project;

public class EmployeeInfo {

	
	
	     String firstName;
	     String lastName;
	    double salaryPerYear;
	     String gender;
	     String address;
	     String officeLocation;

	    
	    public EmployeeInfo(String firstName, String lastName, double salaryPerYear, String gender, String address, String officeLocation) {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.salaryPerYear = salaryPerYear;
	        this.gender = gender;
	        this.address = address;
	        this.officeLocation = officeLocation;
	    }

	    
	     String getFullName() {
	        return firstName + " " + lastName;
	    }

	     String getGender() {
	        return gender;
	    }

	     double getMonthlySalary() {
	        return salaryPerYear / 12;
	    }

	     String getAddress() {
	        return address;
	    }

	     String getOfficeLocation() {
	        return officeLocation;
	    }

	    
	    public double calculateSalaryAfterPFDeduction(double employeePFRate) {
	        double employeePF = salaryPerYear * (employeePFRate / 100);
	        return salaryPerYear - employeePF;
	    }
	}
