package GitHub;

import java.util.Scanner;

public class Kutija {

	public static void main(String[] args) {
		ZaoblenOblik[] obliciVoKutija = new ZaoblenOblik[10];
		
		obliciVoKutija[0] = new Cilinder(5.00, 10.00);
		obliciVoKutija[1] = new Konus(2.00, 5.00);
		obliciVoKutija[2] = new Topka(3.00);
		obliciVoKutija[3] = new Konus(1.00, 4.00, 60.00);
		obliciVoKutija[4] = new Topka(2.00);
		obliciVoKutija[5] = new Cilinder(2.00, 3.00, 30.00);
		
		// Presmetka na vkupen volumen
		
		double vkVolumen = 0;
		
		for(int i = 0; i < obliciVoKutija.length; i++) {
			if(obliciVoKutija[i] != null) {
				vkVolumen += obliciVoKutija[i].volumen();
			}
		}
		
		System.out.printf("Vkupniot volumen vo kutijata e: %.2f\n", vkVolumen);
		
		// Presmetka na minimalen volumen
		
		double min;
		int minVolIndex = 0;
		
		for(int i = 1; i < obliciVoKutija.length; i++) {

			min = obliciVoKutija[0].volumen();
			
			if(obliciVoKutija[i] != null) {
				if(obliciVoKutija[i].volumen() > min) {
					min = obliciVoKutija[i].volumen();
					minVolIndex = i;
				}
			}
		}
		
		System.out.println("Oblikot so minimalen volumen e: " + obliciVoKutija[minVolIndex].toString());
		
		// Presmetka na suma na visini
		
		double suma = 0;
		
		for(int i = 0; i < obliciVoKutija.length; i++) {
			if(obliciVoKutija[i] != null) {
				if(obliciVoKutija[i].getRadius() < 3) {
					suma += obliciVoKutija[i].visina();
				}
			}
		}
		
		System.out.println("Sumata na oblicite so radius pomal od 3 e: " + suma);

		// Pecatenje na odreden tip na oblici
		
		System.out.println("1. Topka\n2. Cilinder\n3. Konus");
		
		Scanner input = new Scanner(System.in);
		int izbor = input.nextInt();
		
		switch(izbor) {
			case 1:{
				System.out.println("1. Topki\n---------------------\n");
				for(int i = 0; i < obliciVoKutija.length; i++) {
					if(obliciVoKutija[i] != null) {
						if(obliciVoKutija[i] instanceof Topka) {
							System.out.println(obliciVoKutija[i]);
						}
					}
				}
				break;
			}
			case 2:{
				System.out.println("2. Cilindri\n---------------------\n");
				for(int i = 0; i < obliciVoKutija.length; i++) {
					if(obliciVoKutija[i] != null) {
						if(obliciVoKutija[i] instanceof Cilinder) {
							System.out.println(obliciVoKutija[i]);
						}
					}
				}
				break;
			}
			case 3:{
				System.out.println("3. Konusi\n---------------------\n");
				for(int i = 0; i < obliciVoKutija.length; i++) {
					if(obliciVoKutija[i] != null) {
						if(obliciVoKutija[i] instanceof Konus) {
							System.out.println(obliciVoKutija[i]);
						}
					}
				}
				break;
			}
			
			default : System.out.println("Pogreshen izbor!");
		}
	}

}