
package testejob;

/**
 *
 * @author Marlon Milliorini
 */
public class teste03 {
    public static void main(String[] args) {
        double[] faturamento = {900.0, 1200.0, 600.0, 2000.0, 2200.0, 1450.0, 1700.0, 2400.0, 1500.0, 2300.0, 2600.0, 1750.0};
        double menor = faturamento[0];
        double maior = faturamento[0];
        double soma = 0.0;
        int count = 0;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] < menor) {
                menor = faturamento[i];
            }
            if (faturamento[i] > maior) {
                maior = faturamento[i];
            }
            soma += faturamento[i];
        }

        double media = soma / faturamento.length;

        for (int i = 0; i < faturamento.length; i++) {
            if (faturamento[i] > media) {
                count++;
            }
        }

        System.out.println("Menor valor de faturamento diário: " + menor);
        System.out.println("Maior valor de faturamento diário: " + maior);
        System.out.println("Número de dias com faturamento diário acima da média: " + count);
    }
}

