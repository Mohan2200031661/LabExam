package com.klef.jfsd.exam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.klef.jfsd.exam.AutoWiring.Instructor;
import com.klef.jfsd.exam.ConstructorDI.Employee;
import com.klef.jfsd.exam.SetterDI.EmployeeSetter;

public class ClientDemo {
	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Employee emp=(Employee)context.getBean("empconbean");
		
		System.out.println("Constructor Di Ouput : ");
		System.out.print(emp.toString()+"\n");
		
		
		EmployeeSetter emp1=context.getBean("empbean",EmployeeSetter.class);// at this moment the object will be created at runtime
		
		System.out.println("Setter  Di Ouput :  ");
		System.out.print(emp1.toString()+"\n");
		
		Instructor I=(Instructor)context.getBean("ibean",Instructor.class);
		
		System.out.println("Auto wiring Output : ");
		System.out.println(I.toString());
		
		context.close();
		
	}
}
