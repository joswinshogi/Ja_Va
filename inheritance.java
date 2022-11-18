package inheritance;

import java.util.Scanner;

class employee{
	String name,address;
	int age;
	long phn_no;
	double salary;
	employee(String n,int a,long phn,String ad,double sal)
	{
		name=n;
		address=ad;
		age=a;
		phn_no=phn;
		salary=sal;
	}
	void salary()
	{
		System.out.println("salary:"+salary);
	}
	
}
class officer extends employee{
	String sp;
	officer(String n,int a,long phn,String ad,double sal,String s){
		super(n,a,phn,ad,sal);
		sp=s;
	}
	void display() {
		System.out.println("Officer details");
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("phn_no:"+phn_no);
		System.out.println("address:"+address);
		super.salary();
		System.out.println("Specilzation:"+sp);
	}
}
class manager extends employee{
	String dep;
	manager(String n,int a,long phn,String ad,double sal,String d){
		super(n,a,phn,ad,sal);
		dep=d;
	}
	void display() {
		System.out.println("manager details");
		System.out.println("Name:"+name);
		System.out.println("age:"+age);
		System.out.println("phn_no:"+phn_no);
		System.out.println("address:"+address);
		super.salary();
		System.out.println("Dapartment:"+dep);
	}
}

public class inh {

	public static void main(String[] args) {
		System.out.println("Enter officer details\n");
		Scanner sc=new Scanner(System.in);
		System.out.println("name:");
		String n=sc.next();
		System.out.println("age:");
		int a=sc.nextInt();
		System.out.println("phone number:");
		long phn=sc.nextLong();
		Scanner scj=new Scanner(System.in);
		System.out.println("Address:");
		String ad=scj.next();
		System.out.println("Salary:");
		double sal=sc.nextDouble();
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter specilization:\n");
		String sp=scc.next();
		officer of=new officer(n,a,phn,ad,sal,sp);
		System.out.println("Enter manager details\n");
		Scanner sc1=new Scanner(System.in);
		System.out.println("name:");
		String na=sc1.next();
		System.out.println("age:");
		int ag=sc1.nextInt();
		System.out.println("Phone number:");
		long ph=sc1.nextLong();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Address:");
		String addd=sc2.next();
		System.out.println("salary:");
		double sala=sc2.nextDouble();
		Scanner sc5=new Scanner(System.in);
		System.out.println("Enter department:");
		String dep=sc5.next();
		manager ma=new manager(na,ag,ph,addd,sala,dep);
		of.display();
		ma.display();
		
		
		
		
		
		
	}

}




















