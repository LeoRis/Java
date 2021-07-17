package GitHub;

import java.util.Scanner;
import java.util.Random;

public class Etest {
	
	public static void main(String[] args) {
		OpstoPrasanje[] op_prasanja = new OpstoPrasanje[10];
		IzborPrasanje[] iz_prasanja = new IzborPrasanje[10];
		
		int op_num = 0, iz_num = 0; // Brojaci za toa kolku prasanja ima momentalno

		
		Scanner input = new Scanner(System.in);
		
		int izbor = 1;
		do {
			System.out.println("1. Dodadi prasanje");
			System.out.println("2. Azuriraj prasanje");
			System.out.println("3. Prikazi gi prasanjata");
			System.out.println("4. Izlez");
			System.out.println("---------------------------");
			System.out.println("Vasiot izbor: ");
			input.nextInt();
//			int izbor;
			switch(izbor) {
				case 1:{ // Dodavanje prasanje
					System.out.println("	1. Dodadi opsto prasanje");
					System.out.println("	2. Dodadi prasanje so povekekraten izbor");
					
					int izbor1 = input.nextInt();
					switch(izbor1) {
						case 1:{ // Za opsto prasanje
							int sif;
							boolean ima;
							
							do {
								ima = false;
								System.out.println("Vnesete sifra: ");
								sif = input.nextInt();
								
								for(int i = 0; i < op_num; i++) {
									if(op_prasanja[i].getShifra() == sif) {
										ima = true;
									}else {
										System.out.println("Vnesenata sifra veke postoi");
									}
								}
							}while(ima);
						
						System.out.println("Vnesete oblast od koja e prasanjeto: ");
						String oblast = input.nextLine();
						oblast = input.nextLine();
						System.out.println("Vnesete go tesktot na prasanjeto: ");
						String txt = input.nextLine();
						System.out.println("Vnesete go odgovorot na prasanjeto: ");
						String odgovor = input.nextLine();
						System.out.println("Vnesete kolku poeni nosi prasanjeto: ");
						int poeni = input.nextInt();
						op_prasanja[op_num++] = new OpstoPrasanje(sif, oblast, txt, odgovor, poeni);
						break;
						}
						case 2:{ // Za izbor prasanje
							int sif;
							boolean ima;
							
							do {
								ima = false;
								System.out.println("Vnesete sifra: ");
								sif = input.nextInt();
								
								for(int i = 0; i < iz_num; i++) {
									if(iz_prasanja[i].getShifra() == sif) {
										ima = true;
									}else {
										System.out.println("Vnesenata sifra veke postoi");
									}
								}
							}while(ima);
						
							System.out.println("Vnesete oblast od koja e prasanjeto: ");
							String oblast = input.nextLine();
							oblast = input.nextLine();
							System.out.println("Vnesete go tesktot na prasanjeto: ");
							String txt = input.nextLine();
							int brod;
							System.out.println("Brojot na ponudeni odgovori: ");
							brod = input.nextInt();
							System.out.println("Vnesete gi odgovorite: ");
							Odgovor[] odg = new Odgovor[brod];
							for(int i = 0; i < brod; i++) {
								System.out.println((i + 1) + " odgovor");
								System.out.println("Tekst: ");
								String txt_odg = input.nextLine();
								txt_odg = input.nextLine();
								boolean tocnost;
								int a;
								System.out.println("Tocnost(1 za tocno, 0 za netocno): ");
								a = input.nextInt();
								if(a == 1) {
									tocnost = true;
								}else {
									tocnost = false;
								}
								System.out.println("Poeni: ");
								int poeni = input.nextInt();
								odg[i] = new Odgovor(txt_odg, tocnost, poeni);
							}
							iz_prasanja[iz_num++] = new IzborPrasanje(sif, oblast, txt, brod, odg);
							break;
						}
					}
					break;
				}
				case 2:{ // Za azuriranje prasanje
					boolean ima = false;
					int tip, i, s;
					do {
						System.out.println("Vnesete 1 ako e opsto prasanje\nili 2 za prasanje so izbor;");
						tip = input.nextInt();
					}while(tip != 1 && tip != 2);
					do {
						System.out.println("Vnesete ja sifrata na prasanjeto: ");
						s = input.nextInt();
						
						if(tip == 1) {
							for(i = 0; i < op_num; i++) {
								if(op_prasanja[i].getShifra() == s) {
									break;
								}
							}
						}else {
							for(i = 0; i < iz_num; i++) {
								if(iz_prasanja[i].getShifra() == s) {
									break;
								}
							}
						}
						if(tip == 1 && i < op_num) {
							ima = true;
						}else if(tip == 2 && i < iz_prasanja.length) {
							ima = true;
						}else {
							System.out.println("Vnesenata sifra ne e pronajdena");
						}
					}while(ima);
					if(tip == 1) {
						op_prasanja[i] = izmeniOpPrasanje(op_prasanja[i]);
					}else {
						iz_prasanja[i] = izmeniIzPrasanje(iz_prasanja[i]);
					}
					break;
				}
				case 3:{ // Za listanje na prasanjta
					System.out.println("Opsti prasanja se: ");
					for(int i = 0; i < op_num; i++) {
						op_prasanja[i].Prikazi_Podatoci();
					}
					System.out.println("Prasanja so povekjekraten izbor se: ");
					for(int i = 0; i < iz_num; i++) {
						iz_prasanja[i].Prikazi_Podatoci();
					}
					break;
				}
				case 4:{
					break;
				}
			}
		}while(izbor != 4);
	}
// Kraj na main()
	
	static OpstoPrasanje izmeniOpPrasanje(OpstoPrasanje op) {
		System.out.println("Momentalno prasanjeto e: ");
		op.Prikazi_Podatoci();
		System.out.println("Odgovorot e: " + op.getOdgovor());
		Scanner input = new Scanner(System.in);
		System.out.println("Izmenetata oblast na prasanjeto e: ");
		op.setOblast(input.nextLine());
		System.out.println("Vnesi go izmenetiot tekst na prasanjeto: ");
		op.setPrasanje(input.nextLine());
		System.out.println("Vnesi go odgovorot: ");
		op.setOdgovor(input.nextLine());
		int poeni;
		System.out.println("Vnesi gi poenite na prasanjeto: ");
		poeni = input.nextInt();
		op.setPoeni(poeni);
		return op;
	}
	
	static IzborPrasanje izmeniIzPrasanje(IzborPrasanje iz) {
		System.out.println("Momentalno prasanjeto e: ");
		iz.Prikazi_Podatoci();
		System.out.println("Tocni odgovori se: ");
		Odgovor[] odg = iz.getOdgovori();
		for(int i = 0; i < iz.getBrOdgovori(); i++) {
			if(odg[i].getTocno()) {
				System.out.println((i + 1) + " ");
			}
		}
		Scanner input = new Scanner(System.in);
		System.out.println("Izmenetata oblast na prasanjeto e: ");
		iz.setOblast(input.nextLine());
		System.out.println("Vnesi go izmenetiont tekst na prasanjeto: ");
		iz.setPrasanje(input.nextLine());
		System.out.println("Vnesi broj na odgovori: ");
		iz.setBrOdgovori(input.nextInt());
		Odgovor[] odgn = new Odgovor[iz.getBrOdgovori()];
		for(int i = 0; i < iz.getBrOdgovori(); i++) {
			System.out.println("Tekst: ");
			String txt = input.nextLine();
			txt = input.nextLine();
			System.out.println("Tocnost(0 ili 1): ");
			int j = input.nextInt();
			boolean toc = true;
			j = input.nextInt();
			if(j == 0) {
				toc = false;
			}
			System.out.println("Poeni: ");
			int pp = input.nextInt();
			odgn[i] = new Odgovor(txt, toc, pp);
		}
		iz.setOdgovori(odgn);
		return iz;
	}

}