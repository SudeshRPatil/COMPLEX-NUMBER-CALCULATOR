package java;

import java.util.*;
public class class1 {
	float real , img;
	class1(){}
	class1 (float r , float i){
		real = r;
		img = i;
	}
	class1 add(class1 a) {
		class1 temp = new class1();
		temp.real = this.real + a.real;
		temp.img = this.img + a.img;
		return temp;
	}
	class1 sub(class1 a) {
		class1 temp = new class1();
		temp.real = this.real + a.real;
		temp.img = this.img + a.img;
		return temp;
	}
	public static void main(String[] args) {
		String choice;
		Scanner sc=new Scanner(System.in);
		choice= sc.nextLine();
		switch(choice) {
		case "+":
			float a,b,c,d;
			System.out.println("Enter Complex Number: ");
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			d=sc.nextFloat();
			class1 p1 = new class1 (a,b);
			class1 p2 = new class1 (c,d);
			class1 res1;
			res1 = p1.add(p2);
			System.out.println("Addition  = " +res1.real +" + " +res1.img );
			break;
		case "-":
			float e,f,g,h;
			System.out.println("Enter Complex Number: ");
			e=sc.nextFloat();
			f=sc.nextFloat();
			g=sc.nextFloat();
			h=sc.nextFloat();
			class1 res2;
			class1 p3 = new class1 (e,f);
			class1 p4 = new class1 (g,h);
			res2 = p3.sub(p4);
			System.out.println("Substraction = " +res2.real +" - " +res2.img );		
			
		}
			
		
	}
}