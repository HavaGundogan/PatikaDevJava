package PatikaDevExamples;

import java.util.Scanner;

public class AvarageCalculator {
	public void avarageCalculator() {
		 Scanner input= new Scanner(System.in);
	     System.out.print("Matematik Notunuz:");
	    double math=input.nextDouble();

	        System.out.print("Fizik Notunuz:");
	    double physic=input.nextDouble();

	        System.out.print("Kimya Notunuz:");
	    double chemistry=input.nextDouble();

	        System.out.print("Turkce Notunuz:");
	    double turkish= input.nextDouble();

	        System.out.print("Tarih Notunuz:");
	    double history= input.nextDouble();

	        System.out.print("Muzik Notunuz:");
	    double music = input.nextDouble();

	    double average= (math+physic+chemistry+turkish+history+music)/6 ;
	        System.out.println("Genel Not Ortalamaniz:"+average);

	    boolean result= average>=60;
	    String str = result ? "Tebrikler,Sinifi Gectiniz." : "Sınıfta Kaldınız.";
	        System.out.println(str);
	}
	public static void main(String[] args) {
		AvarageCalculator avg=new AvarageCalculator();
		avg.avarageCalculator();
	}
	
}
