package com._28min.collections;


public class Person implements  Comparable<Person> {

	private String name;
	private Double salary;
	public Person(String name, Double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", salary=" + salary + "]";
	}
	
	@Override
	public int compareTo(Person p) {
		return Double.compare(p.salary,this.salary);
	}
	

	
	
}
