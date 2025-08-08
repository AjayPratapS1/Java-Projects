package com.sorting.d;

import java.util.*;

public class EmployeeSort {

	public static void main(String[] args) {

		Employee[] employees = { new Employee("Ajay", 50000), new Employee("Jai", 20000),
				new Employee("Gojo", 40000), new Employee("Karan", 45000) };

		Arrays.sort(employees, (a, b) -> (int) (a.salary - b.salary));

		for (Employee e : employees) {
			e.display();
		}

	}

}
