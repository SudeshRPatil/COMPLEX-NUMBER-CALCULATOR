package java;

import java. util.Scanner;

public class complex {
	float real;
	private float IMG;
	complex(){}
	complex(float r,float i){
		real = r;
		 IMG = i;
	}
      complex add(complex a) {
    	  complex temp = new complex();
    	  float real =this.real + a.IMG;
    	  float img =this.IMG + a.real;
    	  return temp;
      }

    	  complex sub(complex a) {
    		  complex temp =new complex();
    		  float real =this.real - a.IMG;
    		  float img =this.IMG - a.real;
    		  return temp;
    	  }
          public static void main (String args [])
          {
        	  String choice;
        	  Scanner sc=new Scanner(System.in);
        	  choice=sc.nextLine();
        	    switch(choice) {
        	    case "+":
        	    	float a,b,c,d;
        	    	System.out.println("Enter a complex number");
        	    	a=sc.nextFloat();
        	    	b=sc.nextFloat();
        	    	c=sc.nextFloat();
        	    	d=sc.nextFloat();
        	    	complex p1 =new complex(a,b);
        	    	complex p2 =new complex(c,d);
        	    	complex res1;
        	    	res1 = p1.add(p2);
        	    	System.out.println("add ="+res1.real+"+"+res1.IMG);
        	         break;
        	    case "-":
        	    	float e,f,g,h;
        	    	System.out.println("Enter a complex number");
        	    	e=sc.nextFloat();
        	    	f=sc.nextFloat();
        	    	g=sc.nextFloat();
        	    	h=sc.nextFloat();
        	    	complex p3 =new complex (e,f);
        	    	complex p4 =new complex (g,h);
        	    	complex res2;
        	    	res2 =p3.sub(p4);
        	    	System.out.println("sub="+res2.real+"-"+res2.IMG);
        	    	break;
        	    }
          }
}
