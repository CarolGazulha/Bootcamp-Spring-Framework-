import java.util.Locale;
import java.util.Scanner;


public class Test2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso1 = 2, peso2 = 3, peso3 = 5;

        int casos = sc.nextInt();
        int cont = 0;
        while (cont < casos) {

            double a = sc.nextDouble() * peso1;
            double b = sc.nextDouble() * peso2;
            double c = sc.nextDouble() * peso3;

            double media = (a + b + c) / (peso1 + peso2 + peso3);
            System.out.printf("%.1f%n", media);

            cont++;
        }
        sc.close();
    }
}
