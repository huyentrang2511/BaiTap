package bai4;

import java.util.Scanner;

public class B4 {
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
		 //nhập giá trị cho a,b,c
		 System.out.println("nhap a:");
		 double a= input.nextDouble();
		 System.out.println("nhap b:");
		 double b= input.nextDouble();
		 System.out.println("nhap c:");
		 double c= input.nextDouble();
		 //check điều kiện a,b,c
		 if(a==0) {
			 if(b==0) {
				 if(c==0) {
					 System.out.println("Phuong trinh co vo so nghiem");
				 }else {
					 System.out.println("Phuong trinh vo nghiem");
				 }
			 }else {
					 double x= -c/b;
					 System.out.println("Phuong trinh co nghiem la x="+x);
				 }
			 }else {
				 double delta = b*b-4*a*c;
				 //xét điều kiện của delta
				 if(delta>0) {
					 double x1=(-b+Math.sqrt(delta))/(2*a);
					 double x2=(-b-Math.sqrt(delta))/(2*a);
					 System.out.println("Phuong trinh co 2 nghiem phan biet: x1="+x1+" va x2="+x2);
				 } else if (delta==0) {
					 double x=-b/(2*a);
					 System.out.println("Phuong trinh co nghiem kep x="+x);
					 
				 }else {
					 System.out.println("Phương trình vô nghiệm thực.");
				 }
			 }
		 }
		 }

