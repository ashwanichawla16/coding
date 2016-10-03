package com.lt.client;

import com.lt.service.Circle;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ob = new Circle();
		ob.r = 1;

		System.out.println("Area=" + ob.Area());
		System.out.println("Peri=" + ob.Peri());
	}

}
