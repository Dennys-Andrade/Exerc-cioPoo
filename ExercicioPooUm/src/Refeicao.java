abstract class Refeicao {
    private  String nome;
    private Double preco;

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void ValorTotal ();

    public abstract void ImprimirDetalhes();

}

