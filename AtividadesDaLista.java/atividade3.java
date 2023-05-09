
import java.util.Scanner;

public class atividade3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] lista = new int[10];
        int X;

        System.out.println("Informe os valores da lista");
        for (int i = 0; i < 10; i++) {
            lista[i] = in.nextInt();
        }

        imprimir(lista);
        System.out.println("soma: " + Soma(lista));
        System.out.println("media: " + Media(lista));
        System.out.println("maior: " + Maior(lista));
        System.out.println("menor: " + Menor(lista));

        System.out.println("Qual numero quer consultar? ");
        X = in.nextInt();
        System.out.println(Consultar(lista, X));
        in.close();
    }

    // metodos

    public static void imprimir(int[] l) {
        System.out.println("**Resultado**");
        for (int i = 0; i < 10; i++) {
            System.out.println("|      " + l[i] + "     |");
        }
        System.out.println("******");
    }

    public static int Soma(int[] s) {
        int X = 0;
        for (int i = 0; i < 10; i++) {
            X += s[i];
        }
        return X;
    }

    public static float Media(int[] s) {
        float X = 0;
        float Z;

        for (int i = 0; i < 10; i++) {
            X = (X + s[i]);
        }
        Z = X / 10;
        return Z;
    }

    public static int Maior(int[] s) {
        int X = 0;
        for (int i = 0; i < 10; i++) {

            if (i == 0) {

                X = s[i];

            }
            if (s[i] > X) {

                X = s[i];

            }
        }
        return X;
    }

    public static int Menor(int[] s) {
        int X = 0;
        for (int i = 0; i < 10; i++) {

            if (i == 0) {

                X = s[i];

            }
            if (s[i] < X) {

                X = s[i];
            }
        }
        return X;

    }

    public static String Consultar(int[] s, int X) {

        for (int i = 0; i < 10; i++) {
            if (s[i] == X) {
                return "Está na lista. ";
            }

        }
        return "Não esta na lista. ";
    }

}
