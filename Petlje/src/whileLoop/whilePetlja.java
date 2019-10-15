package whileLoop;

import java.util.Scanner;

public class whilePetlja {

	public static void main(String[] args) {
		
	/*	int broj=0;
		
		while (broj<7)  {
			if (broj==5) {
				
				System.out.println("evo ga pet");
				break;
			}else {
				System.out.println(broj); broj++;
				
				
			}
			
			
			
		}*/
		
		
		
		
		int zbir=0;
	
		while (true) {
		System.out.println("unesi: ");
		System.out.println("0-kraj ");
		System.out.println("bilo koji br - sabiranje");
		
		Scanner scanner = new Scanner (System.in);
		
		int unetiBroj= scanner.nextInt();
		
		
		
		if (unetiBroj !=0)	{zbir= zbir+ unetiBroj; System.out.println("nastavi...");}	
		else {
			System.out.println("krajnji zbir je: "+ zbir); 
			scanner.close();
			break;
		}
		
		}
		
		
		
		}
	}
		

	


