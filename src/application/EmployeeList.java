package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Employee;

public class EmployeeList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employyes will be registered? ");
		int N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println("\nEmployee " + i + ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextInt();
			list.add(new Employee(id,name,salary));
		}
		
		System.out.print("\nEnter the empployee ID that will have salary increase: ");
		int id = sc.nextInt();
		boolean confirmation = false;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId() == id) {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				list.get(i).increaseSalary(percentage);
				confirmation = true;
			}
		}
		if (!confirmation)
			System.out.println("This ID does not exist!");
		
		for (Employee x:list) {
			System.out.println("\n" + x);
		}
		sc.close();
	}
}
