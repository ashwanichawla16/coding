package com.lt.service;

public class Emp {

	private String empName;
	//private int age;
	private byte age;
	private String compName = "LnT";

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) throws Exception {
		if (!empName.matches("[a-zA-Z]{3,25}"))
			throw new Exception("name must be only alphabets and must have min 3 letters");
		this.empName = empName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		if (age < 20 || age > 50)
			throw new Exception("age must be between 20 and 50");
		this.age = (byte)age;
	}

	public String getCompName() {
		return compName;
	}

}
