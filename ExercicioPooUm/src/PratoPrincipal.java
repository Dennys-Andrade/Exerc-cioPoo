import java.util.List;

public class PratoPrincipal extends Refeicao implements descontosEofertasEspeciais {
    public PratoPrincipal(double v, String pratoPrincipal) {
        super();
    }

    @Override
    public void ValorTotal() {

    }

    @Override
    public void ImprimirDetalhes() {

    }

    @Override
    public double getValorDesconto() {
        return 0;
    }

    @Override
    public List<String> getDescricaoDesconto() {
        return List.of();
    }
}
