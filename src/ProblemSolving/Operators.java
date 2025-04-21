package ProblemSolving;

import java.util.Scanner;

public class Operators {
	
	public static void Area(int radius) {
		System.out.println(3.14*(radius*radius));
	}
	
	public static void main(String[] args) {
		int a =30;
		int b =10;		
		a =a-b;
		b =a+b;
		a =b-a;
		System.out.println(a);
		System.out.println(b);
		
		Scanner sc =new Scanner(System.in);
		int num =sc.nextInt();
		
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);			   //gives the remainder
		
		
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(a);
		
		
		
	}
}
