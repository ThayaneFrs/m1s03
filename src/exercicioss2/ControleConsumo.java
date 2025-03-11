package exercicioss2;

import java.util.ArrayList;
import java.util.Scanner;

public class ControleConsumo {
    public static void main(String[] args) {
        ArrayList<Double> consumoEnergia = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);
        double limiteSustentavel = 200.0;

        System.out.println("Digite o consumo mensal de energia em kWh para cada um dos 12 meses do ano: ");

        for (int i = 0; i < 12; i++) {
            System.out.println("Mes " + (i + 1) + ": ");
            double consumo = entrada.nextDouble();
            consumoEnergia.add(consumo);
        }

        double somaConsumo = 0;
        for (double consumo : consumoEnergia) {
            somaConsumo += consumo;
        }
        double mediaConsumo = somaConsumo / consumoEnergia.size();

        System.out.printf("O consumo medio de energia no ano foi: %.1f KWh %n", mediaConsumo);
        if (mediaConsumo > limiteSustentavel) {
            System.out.printf("A casa está consumindo mais energia do que o limite sustentável de %.1f kWh.", limiteSustentavel);
        } else {
            System.out.println("O consumo de energia está dentro do limite sustentável.");
        }

    }
}

