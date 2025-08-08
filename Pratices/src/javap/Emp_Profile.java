package javap;

public class Emp_Profile {
//	ctrl + space then write main

    public static void main(String[] args) {

        // Employee profile Report Generation
        StringBuffer report = new StringBuffer();
        report.append("Employee Name: Ajay\n");
        report.append("Employee ID: 1025\n");
        report.append("Department: Software Development\n");
        report.append("Designation: Software Engineer\n");
        report.append("Location: Noida\n");
        report.append("Experience: 2 years\n");

        // Print the report
        System.out.println("===== Employee Profile Report =====");
        System.out.println(report.toString());
        
       
    }
}
