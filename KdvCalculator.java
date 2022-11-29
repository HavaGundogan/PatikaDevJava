package PatikaDevExamples;

import java.util.Scanner;

public class KdvCalculator {

	double kdv=0.18;
	public void kdvCalculator() {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Lütfen para degerinizi giriniz:");
	double para=input.nextInt();
	
	if(para <=1000) {
		System.out.println("Kdv oraniniz:"+kdv);
		double tutar =para+( para*kdv);
		System.out.println("Kdvli tutariniz:"+tutar);
	}else {
		kdv=0.10;
		System.out.println("Kdv oraniniz:"+kdv);
		double tutar =para+( para*kdv);
		System.out.println("Kdvli tutariniz:"+tutar);
		
	}
	
	}
	public static void main(String[] args) {
		
		KdvCalculator kdv= new KdvCalculator();
		kdv.kdvCalculator();

	}

}
