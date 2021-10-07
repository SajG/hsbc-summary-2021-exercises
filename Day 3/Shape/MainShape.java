package com.hsbc.Summary;

public class MainShape {

	public static void main(String[] args) {
		System.out.println("Circle instance");
		Circle c=new Circle();
		FindArea.getAllShapes(c);
		System.out.println("Sphere instance");
		Sphere s=new Sphere();
		FindArea.getAllShapes(s);
	}

}
