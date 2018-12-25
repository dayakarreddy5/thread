package com.slokam.clone;

public class Person  implements Cloneable{

	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Person p=(Person)super.clone();
		p.passport=(Passport)passport.clone();
		
		return p;
	}
	
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private int id;
	private String name;
	private int age;
	private Passport passport;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
}
