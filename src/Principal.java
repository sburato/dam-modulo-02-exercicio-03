import java.util.Arrays;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> valores = Arrays.asList(3, 5, 7, 9, 10, 12, 17);

        CalculadorEstatisticas estatisticas = new CalculadorEstatisticas(valores);

        System.out.printf("A soma dos valores é..........: %.4f \n", estatisticas.calcularSoma());

        System.out.printf("A média dos valores é.........: %.4f \n", estatisticas.calcularMedia());

        System.out.printf("A variância dos valores é ....: %.4f \n", estatisticas.calcularVariancia());

        System.out.printf("O desvio padrão dos valores é : %.4f \n", estatisticas.calcularDesvioPadrao());
    }
}
