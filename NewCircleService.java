package com.lt.service;

public class NewCircleService {

	private double amt;
	private int yrs;
	private float rate;

		
	public double getAmt() throws Exception{
		if(amt<5000)
			throw new Exception("amt must be min 5000");
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	public int getYrs() {
		return yrs;
	}

	public void setYrs(int yrs) throws Exception{
		if(yrs<0)
			throw new Exception("years must be more than 0");
		this.yrs = yrs;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) throws Exception {
		if(rate<=0 ||rate>30)
			throw new Exception("rate must be greater than 0");
		this.rate = rate;
	}

	public double calcSI() {
		return amt * yrs * rate / 100;
	}

	public double calcCI() {
		return amt * Math.pow((1 + rate / 100), yrs) - amt;
	}

}
