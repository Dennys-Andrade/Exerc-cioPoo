public class Polimorfismo {
    public class Bicicleta extends Veiculo{
        @Override
        public void mover(){
            System.out.println("A bicicleta está se movendo com duas rodas.");
        }
    }

    public class Carro extends Veiculo {
        @Override
        public void mover(){
            System.out.println("O carro está se movendo com 04 rodas.");
        }
    }


    public class Veiculo {
        public void mover(){
            System.out.println("O veículo está se movendo");
        }
    }


Polimorfismo;

    public class Main {
        public void main(String[] args) {
            Veiculo meuVeiculo;

            //Polimorfismo em ação
            meuVeiculo = new Carro();
            meuVeiculo.mover();
            ////Polimorfismo em ação
            meuVeiculo = new Bicicleta();
            meuVeiculo.mover();

            meuVeiculo = new Veiculo();
            meuVeiculo.mover();


            Calculadora calc = new Calculadora();

            System.out.println("Somando dois inteiros: " + calc.somar(10,10,5,7,9,11,99, -150));


            DiaDaSemana hoje = DiaDaSemana.TERCA;
            switch(hoje){
                case DOMINGO:
                    System.out.println("Hoje é domingo");
                    break;
                case TERCA:
                    System.out.println("Hoje é Terça-Feira");
                    break;
                default:
                    System.out.println("Dia Inválido");
            }

            Prioridade status = Prioridade.ALTA;
            System.out.println("Prioridade " + status);
            System.out.println("Nível " + status.getNivel());

        }
    }


Polimorfismo;

    public class Calculadora {

        // //Método para adição de dois inteiros
        // public int somar(int a, int b){
        //     return a + b;
        // }
        // //Método para adição de três inteiros
        // public int somar(int a, int b, int c){
        //     return a + b + c;
        // }
        //Método de adição com número variável de inteiros
        public int somar(int... numeros){
            int soma = 0;
            for(int num : numeros){
                soma+= num;
            }
            return soma;
        }
        //Método para adição dois números com decimais
        public Double somar(Double a, Double b){
            return a + b;
        }
    }


 Polimorfismo;

    public enum Prioridade {
        BAIXA(1),
        MEDIA(2),
        ALTA(3);

        private int nivel;
        //Construtor
        Prioridade (int nivel){
            this.nivel = nivel;
        }
        //Método getter
        public int getNivel(){
            return nivel;
        }
    }

Polimorfismo;

    public enum DiaDaSemana {
        DOMINGO,
        SEGUNDA,
        TERCA,
        QUARTA,
        QUINTA,
        SEXTA,
        SÁBADO
    }

}
