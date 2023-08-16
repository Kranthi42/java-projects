package com.y4j.oops.project;

public class Main {

	public static void main(String[] args) {

		
		        EmployeeInfo[] employees = {
		            new EmployeeInfo("Ranveer", "Kapoor", 1200000, "M", "Mumbai, India", "Hyderabad"),
		            new EmployeeInfo("Pawan", "Kalyan", 1500000, "M", "Vizag, Andhra Pradesh", "Pune"),
		            new EmployeeInfo("Yash", "Kumar", 3500000, "M", "Bangalore, Karnataka", "Hyderabad"),
		            new EmployeeInfo("Tamannah", "Bhatia", 2500000, "F", "Bangalore, Karnataka", "Pune")
		        };

		        double employeePFRate = 9.0;

		     
		     
		            for (EmployeeInfo employee : employees) {
		                System.out.println("Name: " + employee.getFullName());
		                System.out.println("Gender: " + employee.getGender());
		                System.out.println("Salary/Month: " + employee.getMonthlySalary());
		                System.out.println("Address: " + employee.getAddress());
		                System.out.println("OfficeLocation: " + employee.getOfficeLocation());
		                System.out.println("Salary take home: " + employee.calculateSalaryAfterPFDeduction(employeePFRate));
		                System.out.println();
		            }
		        }
		    }
		





	


	


