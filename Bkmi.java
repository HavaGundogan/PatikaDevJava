package PatikaDevExamples;

import java.util.Scanner;

public class Bkmi {

	Scanner input= new Scanner(System.in);
    void bkmi() {
    	System.out.println("Boyunuzu giriniz(m):");
    	double a=input.nextDouble();
    	System.out.println("Kilonuzu giriniz(kg):");
    	double b=input.nextDouble();
    	double bkm= b/(a*a);
    	System.out.println("vucut kitle indeksiniz:"+bkm);
    	
    	
    }
    public static void main(String[] args) {
		
    	Bkmi b = new Bkmi();
    	b.bkmi();

    	}


}
