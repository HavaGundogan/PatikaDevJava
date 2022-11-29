package PatikaDevExamples;

import java.util.Scanner;

public class Manav {

	double Armut = 2.14;
	double Elma = 3.67;
	double Domates = 1.11;
	double Muz= 0.95;
	double Patlican = 5.00;
	void manav() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kac kg armut aldınız:");
		double armut= input.nextDouble();
		
		System.out.print("Kac kg elma aldınız:");
		double elma= input.nextDouble();
		
		System.out.print("Kac kg domates aldınız:");
		double domates= input.nextDouble();
		
		System.out.print("Kac kg muz aldınız:");
		double muz= input.nextDouble();
		
		System.out.print("Kac kg patlican aldınız:");
		double patlican= input.nextDouble();
		
		double toplam =(Elma*elma)+(Armut*armut)+(domates*Domates)+(muz*Muz)+(patlican*Patlican);
	
		System.out.println("Toplam odeyeceginiz tutar:"+toplam);
	
	
	}
	public static void main(String[] args) {
		Manav mnv= new Manav();
		mnv.manav();

	}

}
