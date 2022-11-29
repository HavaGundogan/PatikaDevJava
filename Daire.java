package PatikaDevExamples;

import java.util.Scanner;

public class Daire {
	void daire() {
		final double pi=3.14;
		Scanner input = new  Scanner(System.in);
		System.out.println("yaricapi girin:");
		Double r=input.nextDouble();
		System.out.println("aci olcusunu girin:");
		double açiOlcusu=input.nextDouble();
		double alan= (pi*r*r*açiOlcusu)/360;
		System.out.println("alan:"+alan);
		
	}
	
	
	
	
public static void main(String[] args) {
		
	Daire d= new Daire();
	d.daire();

	}
}
