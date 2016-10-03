package com.lt.client;

import com.lt.service.Interest;

public class InterestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest obj = new Interest();
		obj.amt = 1000;
		obj.yrs = 2;
		obj.rate = 2.5f;

		System.out.println("SI=" + obj.calcSI());
		System.out.println("CI=" + obj.calcCI());
	}

}
