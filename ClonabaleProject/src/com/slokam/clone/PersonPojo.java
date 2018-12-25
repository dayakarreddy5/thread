package com.slokam.clone;

public class PersonPojo implements Cloneable{

	//shallow
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "PersonPojo [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	private int id;
	private String name;
	private int age;
	
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
	
	
}
