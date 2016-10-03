package com.lt.client;

import com.lt.service.Emp;

public abstract class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp = new Emp();
		try {
			emp.setEmpName("ram");
			emp.setAge(45);
			System.out.println(emp.getEmpName());
			System.out.println(emp.getAge());
			System.out.println(emp.getCompName());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
