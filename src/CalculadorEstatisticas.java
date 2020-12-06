import java.util.List;

public class CalculadorEstatisticas {
    private final List<Integer> valores;

    public CalculadorEstatisticas(List<Integer> valores) {
        this.valores = valores;
    }

    public double calcularSoma() {
        return this.valores.stream().reduce(0, Integer::sum);
    }

    public double calcularMedia() {
        double total = this.calcularSoma();
        double media = 0;
        if (valores.size() > 0) {
            media = total / valores.size();
        }
        return media;
    }

    public double calcularVariancia() {
        double media = this.calcularMedia();
        double diferenca = 0;
        for (int valor: this.valores) {
            diferenca += (valor - media) * (valor - media);
        }
        return diferenca / valores.size();
    }

    public double calcularDesvioPadrao() {
        double variancia = this.calcularVariancia();
        return Math.sqrt(variancia);
    }
}