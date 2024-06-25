
        import java.util.Scanner;
        public class OitavoExercício {
            public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Digite um número decimal: ");
                int decimal = sc.nextInt();

                String binario = "";

                int Calculotemp = decimal;

                if (Calculotemp == 0) {
                    binario = "0";
                } else {
                    while (Calculotemp > 0) {
                        int resto = Calculotemp % 2;
                        binario = resto + binario;
                        Calculotemp = Calculotemp / 2;
                    }
                }

                System.out.println("O número " + decimal + " em binário é: " + binario);

            }
        }




