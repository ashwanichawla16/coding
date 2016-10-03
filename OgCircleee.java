package com.lt.service;

public class OgCircleee {

	public double r;

	public OgCircleee(double r) throws Exception {
		super();
		if (r <= 0)
			throw new Exception("radius must be >0");
		this.r = r;
	}

	public double Area() {
		return Math.PI * r * r;
	}

	public double Peri() {
		return 2 * Math.PI * r;
	}
}
