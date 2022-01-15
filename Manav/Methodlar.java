package Manav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Methodlar {
	
	static List<String> list = new ArrayList<>(Arrays.asList("Domates", "Limon", "Pattes", "Sogan", "Turp", "Marul"));
    static List<Double> fiyat = new ArrayList<>(Arrays.asList(5.0, 3.2, 4.8, 6.3, 2.1, 1.9));
    static List<String> sepetListe=new ArrayList<>();    
	static int tercih;
	static double tutar;
	
	protected static void start() {
		System.out.println("HOSGELDINIZ\n");
		karsilama();
	}
	
	public static void karsilama() {
		Scanner scan=new Scanner(System.in);
		System.out.println("==== MANAV REYONU =====");
		
		for(int i=0;i<list.size();i++) {
			System.out.println((i+1) + ". Urun=> "+list.get(i) + " " + fiyat.get(i));
		}
		
		System.out.println("\nUrun seciniz : ");
		tercih=scan.nextInt()-1;
		System.out.println("Kac kg almak istiyorsunuz : ");
		double kg=scan.nextDouble();
		
		hesapla(tercih,kg);	
		scan.close();
	}

	private static void hesapla(int t, double kg) {
		tutar += fiyat.get(t) * kg;	
		String kova = "Urun ismi: " + list.get(t) +" Fiyati: "+ fiyat.get(t)+" Miktar: "+kg +
				" kg "+" Tutar => "+fiyat.get(t)*kg;
		sepetListe.add(kova);
		System.out.println("Sepetinizde ki Urunler ");
		sepetListe.stream().forEach(x-> System.out.println(x));
		System.out.println("Toplam tutar : " + tutar);
		devamMi();
		
	}

	private static void devamMi() {
		Odeme odm= new Odeme();
		Scanner scan=new Scanner(System.in);
		System.out.println("\t1-)Alisverise devam etmek istiyorum "
				+ "\n\t2-)Odeme yapmak istiyorum "
				+ "\n\t3-)Cikis "
				+ "\n Tercihinizi yapiniz : ");
		tercih=scan.nextInt();
		
		switch (tercih) {
		case 1:
			karsilama();
			break;
		case 2:
			odm.odeme();
			break;
		case 3:
			cikis();
			break;

		default:
			System.out.println("Hatali giris");
			devamMi();
			break;
		}
		scan.close();
		
		
	}

	public static void cikis() {
		System.out.println("GULE GULE");
		
	}

}
