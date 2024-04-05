import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float soma = 0;

        for (int i = 0; i <= 5; i++){
            System.out.printf("Digite a sua nota %d \n", i+1);
            double nota = scan.nextDouble();

            soma += nota;
        }

        double media = soma /5;

        if (media >= 7){
            System.out.println("Aprovado");
        }else if(media < 7 && media > 4){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        scan.close();
    }
}
