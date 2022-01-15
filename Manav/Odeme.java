package Manav;

import java.util.Scanner;

public class Odeme {
	
	protected static void odeme() {
		Scanner scan = new Scanner(System.in);
		double tutar1=Methodlar.tutar;		
		System.out.println("Toplam Borcunuz => " + tutar1);
		
		for(int i=1;i>0;i++) {
			
		System.out.println("Odeme yapacaginiz tutari giriniz : ");
		double odeme=scan.nextDouble();
		
		if(odeme==tutar1) {
			System.out.println("Odemeniz basariyla yapildi");
			break;
		}else if(odeme>tutar1) {
			System.out.println("Para ustu => "+(odeme-tutar1));
			System.out.println("Odemeniz basariyla yapildi");
			break;
		}else if(odeme<tutar1) {
			tutar1=tutar1-odeme;
			System.out.println("Odeme yapacaginiz tutar => "+tutar1);			
		}
						
		}
		Methodlar.cikis();
		scan.close();
	}

}
