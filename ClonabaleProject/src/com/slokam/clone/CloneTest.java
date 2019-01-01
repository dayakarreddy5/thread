package com.slokam.clone;

import javax.management.PersistentMBean;

public class CloneTest {

	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		//deep cloning
		
		Person p=new Person();
		
		p.setId(1);
		p.setName("sai");
		p.setAge(24);
		
		
		Passport pass=new Passport();
		
		pass.setPassNum("2324daya");
		
		p.setPassport(pass);
		Person p1=(Person) p.clone();
		
		
		p1.setName("shyam");
		pass.setPassNum("vinay2432");
		
		System.out.println(p1);
		System.out.println(p);
		System.out.println(p1==p);
		
		System.out.println(p.getName()+" "+p.getPassport().getPassNum());
		System.out.println(p1.getName()+" "+p1.getPassport().getPassNum());
	
	}
	
	public static void main2(String[] args) throws CloneNotSupportedException {
//
		//shallow
		//one object two reference is called shallow
		PersonPojo p = new PersonPojo();

		p.setId(1);
		p.setName("daya");
		p.setAge(24);

		PersonPojo p1 =(PersonPojo) p.clone();

		p1.setName("shyam");

		System.out.println(p1==p);
		System.out.println(p);
		System.out.println(p1);
		
	}
}












