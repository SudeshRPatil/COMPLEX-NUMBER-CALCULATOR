package java;

import java. util.Scanner;
public class areaa {

	public static void main(String args []) {
	     shapes t=new triangle();
	     t.input();
	     t.compute_area();
	     
	     shapes r=new rec();
	     r.input();
	     r.compute_area();

	}
}
abstract class shapes{
	double v1,v2;
	void input() {
		Scanner ss=new Scanner(System.in);
		System.out.println("enter value");
		v1=ss.nextDouble();
		Scanner sd=new Scanner(System.in);
		System.out.println("enter value2");
		v2=sd.nextDouble();
	}
	abstract void compute_area();
	}
	 class triangle extends shapes{
		void compute_area() {
			double area;
			area=0.5*v1*v2;
			System.out.println("area of tringle"+area);
			System.out.println("height="+v2);
			System.out.println("base is"+v1);
		}
}
	class rec extends shapes{
		void compute_area() {
			double area;
			area=v1*v2;
			System.out.println("area of tringle"+area);
			System.out.println("height="+v2);
			System.out.println("base is"+v1);
	
		}
	}


