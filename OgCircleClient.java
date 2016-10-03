package com.lt.client;

import java.util.*;

import com.lt.service.Circle;

public class OgCircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius");
		double rad = sc.nextDouble();

		try {
			Circle ob = new Circle();
			ob.r = 1;

			System.out.println("Area=" + ob.Area());
			System.out.println("Peri=" + ob.Peri());

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
