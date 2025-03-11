package exercicioss2;

import java.util.Scanner;

public class TemperaturaMedia {
    public static void main(String[] args) {
        double[] temperaturas = new double[7];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite as temperaturas medias dos 7 dias da semana:");

        for (int i = 0; i < 7; i++) {
            System.out.println("Dia" + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < 7; i++) {
            soma += temperaturas[i];
        }
        double media = soma / 7;

        System.out.printf("A temperatura media da semana foi: %.2f C %n",media
        );

    }

}
