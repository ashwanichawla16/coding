package com.lt.service;

public class Interest {

	public double amt;
	public int yrs;
	public float rate;

	public double calcSI() {
		return amt * yrs * rate / 100;
	}

	public double calcCI() {
		return amt * Math.pow((1 + rate / 100), yrs) - amt;
	}
}
