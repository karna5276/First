package com.predicate;

import java.util.function.Predicate;

public class StudentExam {
	
	//AND ,OR,Negate

	
	Predicate<String> capmus_exam;
	Predicate<String> DegreeCompleted;
	Predicate<Boolean> opposite;
	
	// And predicate 
	public void Exam() {

		capmus_exam= discussion->discussion.equalsIgnoreCase("yes");
		DegreeCompleted= Degree->Degree.equalsIgnoreCase("yes");
		
		System.out.println("And exam can i do join the exam : "+
		capmus_exam.and(DegreeCompleted).test("yes"));
	}

	// OR predicate 
	public void Exam1() {
		capmus_exam= discussion->discussion.equalsIgnoreCase("yes");
		DegreeCompleted= Degree->Degree.equalsIgnoreCase("yes");
		
		System.out.println("OR exam can i do join the exam  : "+
				capmus_exam.and(DegreeCompleted).test("no"));

	}

	// negate predicate 
	public void negateExam2() {
		opposite=input-> input;
		System.out.println(opposite.negate().test(true));

	}
	
	public static void main(String[] args) {
		StudentExam ex=new StudentExam();
		ex.Exam();
		ex.Exam1();
		ex.negateExam2();
	}
}