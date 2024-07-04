package Aula_teste;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nomePessoaFisica = "Denny";
        p1.idadePessoaFisica = 25;
        p1.emailPessoaFisica = "denny@gmail.com";
        Pessoa p2 = new Pessoa();
        p2.nomePessoaFisica = "João";
        p2.idadePessoaFisica = 25;
        p2.emailPessoaFisica = "joao@gmail.com";
        System.out.println("O nome da pessoa da pessoa é:" + p1.nomePessoaFisica);
        System.out.println("A idade da pessoa da pessoa é:" + p1.idadePessoaFisica);
        System.out.println("O email da pessoa da pessoa é:" + p1.emailPessoaFisica);
        System.out.println("O nome da pessoa da pessoa é:" + p2.nomePessoaFisica);
        System.out.println("A idade da pessoa da pessoa é:" + p2.idadePessoaFisica);
        System.out.println("O email da pessoa da pessoa é:" + p2.emailPessoaFisica);
        System.out.println(p1);
    }
}
