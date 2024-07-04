public class Interfaces {
    public class Veiculo {
        private String marca;
        private String modelo;
        private TipoCombustivel combustivel;

        public Veiculo(String marca, String modelo, TipoCombustivel combustivel) {
            this.marca = marca;
            this.modelo = modelo;
            this.combustivel = combustivel;
        }

        public void dirigir() {
            System.out.println("O veículo está sendo dirigido");
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }
        public TipoCombustivel getCombustivel(){
            return combustivel;
        }
    }


 Interfaces.Tudo;

    public interface Manutencao {
        void realizarManutencao();
    }


Interfaces.Tudo;

    public class Carro extends Veiculo implements  Manutencao {
        private int numeroDePortas;

        public Carro(String marca, String modelo, TipoCombustivel combustivel, int numeroDePortas) {
            super(marca, modelo, combustivel); // Chama o construtor da classe base
            this.numeroDePortas = numeroDePortas;
        }

        @Override
        public void dirigir() {
            System.out.println("O carro está sendo dirigido");
        }

        @Override
        public void realizarManutencao() {
            System.out.println("Realizando manutenção no carro");
        }

        public int getNumeroDePortas() {
            return numeroDePortas;
        }

    }


Interfaces.Tudo;

    public enum TipoCombustivel {
        GASOLINA,
        ETANOL,
        DIESEL,
        ELETRICO
    }



Interfaces.Tudo;

    public class Main {
        public static void main(String[] args) {
            Carro meuCarro = new Carro("Toyota", "Corolla", TipoCombustivel.GASOLINA, 4);

            System.out.println("Marca: " + meuCarro.getMarca());
            System.out.println("Modelo: " + meuCarro.getModelo());
            System.out.println("Tipo de Combustível: " + meuCarro.getCombustivel());
            System.out.println("Número de portas: " + meuCarro.getNumeroDePortas());

            meuCarro.dirigir();
            meuCarro.realizarManutencao();
            //Polimorfismo usando a interface
            Manutencao manutCarro = meuCarro;
            manutCarro.realizarManutencao();
        }
    }

}
