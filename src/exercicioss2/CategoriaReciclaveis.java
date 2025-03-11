package exercicioss2;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoriaReciclaveis {
    public static void main(String[] args) {
        ArrayList<String> categorias = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Adicione ate 5 categorias de itens reciclaveis.");

        for (int i = 0; i<5; i++) {
            System.out.println("Digite a categoria #" + (i+ 1) + ": ");
            String categoria = entrada.nextLine();
            categorias.add(categoria);

            if (i<4){
                System.out.println("Deseja adicionar mais uma categoria? (sim/nao): ");
                String resposta = entrada.nextLine().trim().toLowerCase();
                if (resposta.equals("nao")) {
                    break;

                }
            }

        }
        System.out.println("Categorias de itens reciclaveis cadastradas:");
        for (String categoria : categorias) {
            System.out.println(categoria);
        }
    }
}
