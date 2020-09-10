package com.projectJava;

public class PhysicTeacher extends Teacher {
	String mainSubject = "Physics";
	 public static void main(String args[]){
			PhysicTeacher obj = new PhysicTeacher();
			System.out.println(obj.collegeName);
			System.out.println(obj.designation);
			System.out.println(obj.mainSubject);
			obj.does();
		   }

}
