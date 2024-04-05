import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int soma = 0, i;
        double media;

        for (i = 0; i < 8; i++) {
            System.out.printf("Digite o %d° número: ",i + 1);
            int numero = scan.nextInt();

            soma += numero;
        }

        media = (float)soma / i;

        System.out.println("A soma do número é: " + soma);
        System.out.printf("A média dos números é: %.2f", media);

        scan.close();



    }

}

