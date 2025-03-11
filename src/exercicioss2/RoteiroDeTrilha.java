package exercicioss2;

import java.util.ArrayList;
import java.util.Scanner;

public class RoteiroDeTrilha {
    public static void main(String[] args) {
        ArrayList<String> paradas = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cadastro de Paradas na Trilha Ecologica");

        while (true) {
            System.out.println("Digite o nome da parara ou 'sair' para encerrar: ");
            String parada = entrada.nextLine();

            if (parada.equalsIgnoreCase("sair")) {
                break;
            }
            ;
            System.out.println("Digite a posicao em que deseja inserir a parada (1 a " + (paradas.size() + 1) + "): ");
            int posicao;
            try {
                posicao = Integer.parseInt(entrada.nextLine());
                if (posicao < 1 || posicao > paradas.size() + 1) {
                    System.out.println("Posicao invalida. A parada sera adicionada no final");
                    paradas.add(parada);
                } else {
                    paradas.add(posicao - 1, parada);
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. A parada sera adicionada no final.");
                paradas.add(parada);
            }
        }
        System.out.println("Itinerario completo da trilha ecologica:");
        for (int i = 0; i < paradas.size(); i++) {
            System.out.println((i + 1) + ". " + paradas.get(i));
        }
    }
}
