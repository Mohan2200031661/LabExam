package com.klef.jfsd.exam.ConstructorDI;
import java.util.*;

public class Employee {
	 private int id; // primitive
	    private String name; // non-primitive
	    private String department; // non-primitive (corrected typo from 'depaartment')
	    private double salary; // primitive
	    private List<String> skills; // non-primitive
	    
		public Employee(int id, String name, String department, double salary, List<String> skills) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.salary = salary;
			this.skills = skills;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
					+ ", skills=" + skills + "]";
		}
		
		
}
