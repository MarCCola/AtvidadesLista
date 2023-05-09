import java.util.Scanner;

public class Atividade7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Escreva um numero para transfomar em binario: ");

        int N = in.nextInt();

        while (N >= 1) {

            N /= 2;
            int X = N % 2;

            System.out.print(X);
        }

        in.close();

    }
}