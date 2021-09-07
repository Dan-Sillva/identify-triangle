package application;

import forms.Triangle;

public class Program {

	public static void main (String[] args) {
		
		Triangle t1 = new Triangle(2, 4, 1);
		Triangle t2 = new Triangle(7, 2, 3);
		Triangle t3 = new Triangle(6, 6, 2);
		
		System.out.println("--T1:");
		print(t1);
		
		System.out.println("--T2:");
		print(t2);
		
		System.out.println("--T3:");
		print(t3);
		
		calcLargeArea(t1, t2, t3);
	}
	
	private static void print(Triangle triangle) {
		System.out.println("Tipo: "+triangle.getType()+" - Área: "+ triangle.getArea() );
		System.out.printf("\n------------------------------\n\n");
	}
	
	private static void calcLargeArea(Triangle t1, Triangle t2, Triangle t3) {
		
		if(t1.getArea() > t2.getArea() && t1.getArea() > t3.getArea()) {
			System.out.println("A maior área é a do T1");
		}
		
		if(t2.getArea() > t1.getArea() && t2.getArea() > t3.getArea()) {
			System.out.println("A maior área é a do T2");
		}
		
		if(t3.getArea() > t2.getArea() && t3.getArea() > t1.getArea()) {
			System.out.println("A maior área é a do T3");
		}
		
	}
	
}
