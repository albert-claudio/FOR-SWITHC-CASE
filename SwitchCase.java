import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Conferir saldo da conta: ");
        System.out.println("Usuario cadastrado: ");
        System.out.println("Transferir para a atendente: ");
        System.out.println("Digite 1 para primeira opção, 2 para segunda e 3 para terceira.");
        float option = scan.nextFloat();

        switch ((int) option) {
            case 1:
                System.out.println("Saldo da conta R$20.000.00");
                break;
            case 2:
                System.out.println("Nome do usuario Lucas Almeida da Souza.");
                break;
            case 3:
                System.out.println("Transferir dados para a atendente? Sim ou não: ");
                String yesOrNot = scan.next();
                if ("sim".equalsIgnoreCase(yesOrNot)) {
                    System.out.println("Dados transferidos com sucesso");
                } else {
                    System.out.println("Dados não transferidos");
                }
                break;
            default:
                System.out.println("Resposta inválida");
                break;
        }
    }
}
