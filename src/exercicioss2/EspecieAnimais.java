package exercicioss2;


import java.util.Scanner;

public class EspecieAnimais {
    public static void main(String[] args) {
        String[] especiesEmPerigo = {"Tigre", "Elefante", "Rinoceronte", "Panda", "Gorila"};

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome de uma especie para verificar se ela esta em risco de extincao: ");
        String especieProcurada = entrada.nextLine();

        boolean encontrada = false;

        for (String especie : especiesEmPerigo) {
            if (especie.equalsIgnoreCase(especieProcurada)) {
                encontrada = true;
                break;
            }
        }
        if (encontrada) {
            System.out.println("A especie" + especieProcurada + "esta em risco de extincao.");
        } else {
            System.out.println("A especie " + especieProcurada + " nao esta na lista de risco de extincao.");
        }
    }
}
