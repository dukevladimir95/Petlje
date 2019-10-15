package forLoop;

import java.util.Scanner;

public class VezbanjeForPetlje {

	public static void main(String[] args) {
		
		
		
		int brojac=0;
		int ukupnoBrojeva=0;
		int neparni =0;
		
		Scanner skener= new Scanner (System.in);  
		
		System.out.println("Unesite pocetnu vrednost: ");
		
		int pocVrednost=skener.nextInt();
		
		System.out.println("unesi krajnju:");
		
		int krajnjaVrednost=skener.nextInt();
		
		skener.close();
		if (krajnjaVrednost>pocVrednost) {
			for(int i =pocVrednost; i<=krajnjaVrednost; i++) {if (i%2==0) {brojac++;}else {neparni++;}
			
			ukupnoBrojeva ++;
				}
			 
		
	          System.out.println("parnih ima "+ brojac); 
			System.out.println("ukupno " +ukupnoBrojeva);
			System.out.println("neparnih je "+ neparni);
			
		}
		else {System.out.println("ne radi");
			
		}  
		
		
		
		
		
		
		
		
		
		
      }

}
