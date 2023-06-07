package listaDeAtividade;
import java.util.Scanner;


public class Atividade1 {
 
	public static void main (String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("digite um número : " );
		int n = in.nextInt();
		
		verficarNumPerfeito(n);
		
		in.close();
	}
	
	public static void verficarNumPerfeito(int n) {
		int aux = 0;
		for (int i = 1; i < n; i++) {
			if (i / n == 0) {
				//System.out.println("Somando " + aux);
				aux += i ;
				//System.out.println("Somando " + aux);
				if(aux == n) {
					
				}
			}
			if ( aux == n ) {
				System.out.println("numero perfeito");
				break;
				
			}
			
		}
		
	}
}
