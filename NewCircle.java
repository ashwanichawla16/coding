package com.lt.client;

import java.util.Scanner;

import com.lt.service.NewCircleService;

public class NewCircle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the principle amt");
		double amt = scan.nextDouble();
		System.out.println("enter the years");
		int yrs = scan.nextInt();
		System.out.println("enter the rate");
		float rate = scan.nextFloat();

		// TODO Auto-generated method stub
		NewCircleService obj = new NewCircleService();
		try {
			obj.setAmt(amt);
			obj.setYrs(yrs);
			obj.setRate(rate);

			System.out.println("SI=" + obj.calcSI());
			System.out.println("CI=" + obj.calcCI());

		} catch (Exception ex) {
			System.out.println(ex.getMessage());

		}

	}

}
