package java;

public class inherutance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
programmer p=new programmer("sudesh",80000);
p.calculation();
teamleader t=new teamleader("komal",70000);
t.calculation();
apm a=new apm("tejus",60000);
a.calculation();
	}
}
class employee{
	String name,email,address;
	int id,mobileno,bp;
	
	void calculation() {
		float hra,da,pf,sc,gross;
		hra=(0.1f)*bp;
		da=(0.97f)*bp;
		pf=(0.12f)*bp;
		sc=(0.01f)*bp;
		gross=bp+hra+da-pf-sc;
		System.out.print("name"+name);
		System.out.print("basic scalery"+bp);
		System.out.println("gross salary"+gross);
	}
}
class programmer extends employee{
	programmer(String name,int sal){
	this.name=name;
	bp=sal;
}
}
class teamleader extends employee{
	teamleader(String name,int sal){
		this.name=name;
		bp=sal;
	}
}
class apm extends employee{
	apm(String name,int sal){
		this.name=name;
		bp=sal;
	}
}
