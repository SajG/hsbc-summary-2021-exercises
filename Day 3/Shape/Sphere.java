package com.hsbc.Summary;

public class Sphere implements Shape{

	public String area(int radius) {
		double area_sphere=4*Math.PI*(radius*radius);  
		return "Area of the sphere is: "+area_sphere;
	}

	
}
