import java.util.Scanner;

class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}

public class Exercicio4TryCatchCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            System.out.print("Digite a operação (+, -, *, /): ");
            char operacao = sc.next().charAt(0);

            int resultado = operacoesMatematicas(num1, num2, operacao);
            System.out.println("Resultado: " + resultado);

        } catch (InvalidOperationException | ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    public static int operacoesMatematicas(int num1, int num2, char operacao) throws InvalidOperationException {
        switch (operacao) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida.");
                }
                return num1 / num2;
            default:
                throw new InvalidOperationException("Operação inválida: " + operacao);
        }
    }
}
