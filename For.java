import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numDenotas = 3;
        double TotaldeNotas = 0;

        for (int i = 1; i <= numDenotas; i++){
            System.out.println("Digite sua nota: " + i);
            double nota = scan.nextDouble();
            TotaldeNotas = nota;
        }

        double media = TotaldeNotas / numDenotas;

        System.out.println("A media dos alunos é: " + media);

        scan.close();
    }
}
