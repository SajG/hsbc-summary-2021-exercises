package com.hsbc.Summary;

public class Circle implements Shape{

	public String area(int radius) {
		// TODO Auto-generated method stub
		double  area_circle=radius*radius*Math.PI;;
		return "Area of the circle is: "+area_circle;
	}

	
}
