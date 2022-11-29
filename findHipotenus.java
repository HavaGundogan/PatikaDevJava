package PatikaDevExamples;

import java.util.Scanner;

public class findHipotenus {

	void findHipotenus() {
		Scanner input= new Scanner(System.in);
		System.out.println("Ucgenin birinci kenarını giriniz:");
		int a=input.nextInt();
		System.out.println("Ucgenin ikinci kenarını giriniz:");
		int b=input.nextInt();
		System.out.println("Ucgenin ucuncu kenarını giriniz:");
		int c=input.nextInt();
		double u = (a+b+c)/2;
		double alanKare= u*(u-a)*(u-b)*(u-c);
		double sonuc=Math.sqrt(alanKare);
		System.out.println("Ucgenin alanı:"+sonuc);
			
	}
	public static void main(String[] args) {
		findHipotenus fnd= new findHipotenus();
		fnd.findHipotenus();

	}

}
