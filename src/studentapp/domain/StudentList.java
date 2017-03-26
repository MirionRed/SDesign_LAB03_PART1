package studentapp.domain;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
	private static ArrayList<Student> studentList;
	
	public StudentList(){
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(String theName){
		Student aStudent = new Student();
		aStudent.setName(theName);
		studentList.add(aStudent);
		System.out.println("Student " + theName + " added");
		System.out.println();
	}
	
	public boolean searchStudent(String theName){
		boolean found = false;
		int i = 0;
		while (i<studentList.size() && !found) {
			Student theStudent = studentList.get(i);
			if (theStudent.getName().equals(theName)) {
				found = true;
			} else {
				i++;
			}
		}
		return found;
	}
	
	public boolean isEmpty (){
		return studentList.isEmpty();
	}
}
