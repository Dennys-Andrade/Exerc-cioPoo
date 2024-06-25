package aulaJava01;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
//        System.out.println("Digite o seu nome:");
//        String nome = teclado.nextLine();
//        System.out.println("Você gosta de estudar?");
//        System.out.println("Digite o seu e-mail:");
//        String email = teclado.nextLine();
//        System.out.println("Digite a sua idade:");
//        System.out.println("Digite a sua nota:");
//        float nota = teclado.nextFloat();
//        System.out.println("Digite o seu telefone:");
//        String telefone = teclado.nextLine();
//        System.out.println("Digite o seu endereço:");
//        System.out.println(10+6);
//        System.out.println(10-5);
//        System.out.println("Bem vindo ao sistema do BoraCodar!");
//        // Cria um objeto Scanner para ler a entrada do teclado
//        Scanner scanner = new Scanner(System.in);

        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt

        // Solicita se o usuário é amigo do dono
        System.out.print("Você é amigo do dono? (sim/nao): ");
        String amigoDoDonoResposta = scanner.nextLine();
        boolean amigoDoDono = amigoDoDonoResposta.equalsIgnoreCase("sim");

        // Solicita se o usuário possui voucher
        System.out.print("Você possui um voucher? (sim/nao): ");
        String voucherResposta = scanner.nextLine();
        boolean voucher = voucherResposta.equalsIgnoreCase("sim");

        // Verifica as condições de entrada
        if (idade >= 18) {
            System.out.println("Pode entrar na festa.");
        } else if (amigoDoDono) {
            System.out.println("Pode entrar na festa.");
        } else if (voucher) {
            System.out.println("Pode entrar na festa.");
        } else {
            System.out.println("Acesso não autorizado.");
        }

        // Verifica as condições de entrada usando operador ternário
        //String resultado = (idade >= 18 && (amigoDoDono || voucher)) || (amigoDoDono && voucher) ? "Pode entrar na festa." : "Acesso não autorizado.";

        // Imprime o resultado
        //System.out.println(resultado);

        // Contador de condições satisfeitas
        int condicoesSatisfeitas = 0;

        // Verifica cada condição e incrementa o contador
        if (idade >= 18) {
            condicoesSatisfeitas++;
        }
        if (amigoDoDono) {
            condicoesSatisfeitas++;
        }
        if (voucher) {
            condicoesSatisfeitas++;
        }

        // Verifica as condições de entrada usando switch
        String resultado;
        switch (condicoesSatisfeitas) {
            case 2:
            case 3:
                resultado = "Pode entrar na festa.";
                break;
            default:
                resultado = "Acesso não autorizado.";
                break;
        }

        // Fecha o Scanner
        scanner.close();
    }
}
