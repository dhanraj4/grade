package com.grade;

import java.util.Scanner;

public class Grading {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	double totalmarks;
	double obtainedmarks;
	double percentage;
	

	totalmarks=s.nextDouble();
	obtainedmarks=s.nextDouble();
	percentage=(obtainedmarks/totalmarks)*100;
	if(percentage>=70) {
		System.out.println("A");
	}
	else if(percentage>=50){
		System.out.println("B");
	}
	else if(percentage>=40) {
		System.out.println("C");
	}
	else {
		System.out.println("D");
	}
	

}
}
