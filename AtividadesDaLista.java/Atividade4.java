import java.util.Scanner;

public class Atividade4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o tamanho da lista = ");

        int aux;
        int X = 0;
        int N = in.nextInt();

        int[] Lista = new int[N];

        System.out.println("Insira " + N + " numero binario: ");

        for (int i = 0; i < Lista.length; i++) {

            Lista[i] = in.nextInt();
        }

        // Transformando

        aux = Lista.length - 1;

        for (int i = 0; i < Lista.length; i++) {

            X += (Lista[i] *= Math.pow(2, aux));

            aux -= 1;

        }
        System.out.println("valor X: " + X);
        in.close();
    }

}