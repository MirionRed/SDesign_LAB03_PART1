package studentapp.ui;

import java.util.Scanner;
import java.util.ArrayList;
import studentapp.domain.*; // import from studentapp.domain

// package (* means all classes)

public class StudentApp {
	private static ArrayList<Student> studentList;
	private static Scanner scanner;
	private static StudentList students;
	
	public static void main(String[] args) {
		students = new StudentList();
		studentList = new ArrayList<Student>();
		scanner = new Scanner(System.in);
		int choice;
		boolean error;
		
		do {
			System.out.println("Do you want to:");
			System.out.println("1. Create new Student object");
			System.out.println("2. Search for a Student object");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (1-3): ");
			choice = scanner.nextInt();
			error = false;
			switch(choice) {
				case 1: addStudent(); break;
				case 2: searchStudent(); break;
				case 3: break;
				default: error = true; break;
			}
			
			if (error) {
				System.out.println("Invalid choice. Please enter again");
			}
			System.out.println();	
			
		} while (choice != 3);
	}



	public static void addStudent() {
		System.out.print("Enter student name: ");
		// clear previous input before input name
		String skip = scanner.nextLine();
		String theName = scanner.nextLine();
		
		students.addStudent(theName);
	}
	
	
	
	public static void searchStudent() {
		if (students.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			System.out.print("Enter name of student: ");
			// clear previous input before input name
			String skip = scanner.nextLine();
			String theName = scanner.nextLine();
			
			if (students.searchStudent(theName))
				System.out.println("The student is in the list");
			else
				System.out.println("No student with that name found");
			System.out.println();
		}
	}

}
