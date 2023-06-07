package listaDeAtividade;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String [] agr) {
		
		Scanner in = new Scanner(System.in);
		
		int a,b,c;
		double Pa,Pb,Pc;
		
		System.out.println("Escreva 3 valores :" );
		
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        
        Pa = DefinirPeso(a);
        Pb = DefinirPeso(b);
        Pc = DefinirPeso(c);
        
        System.out.println("o valor da media é: "  + Pa + " " + Pb +" " + Pc);
        
        System.out.println("o valor da media é: " + Mediaponderada(a,b,c,Pa,Pb,Pc));
       
        in.close();
	}
	
	public static double  DefinirPeso(int n) {
		double Peso =0;
		if (n < 6) {
			Peso = 2.5;
		}else{
			Peso = 5; 
		}
		
		return Peso;
	}
	
	public static double Mediaponderada(int a, int b, int c, double Pa, double Pb, double Pc) {
		
		double MD;
		MD = (a*Pa)+(b*Pb)+(c*Pc)/(Pa+Pb+Pc);
		return MD;
	}
}
