package exercicioss2;

public class QualidadeDoAr {
    public static void main(String[] args) {
        int[] indicesQualidadeAr = {85, 120, 98, 110, 75};
        String[] cidades = {"Curitiba", "Joinville", "Sao Paulo", "Belo Horizonte", "Florianopolis"};

        System.out.println("Cidades com indices de qualidade do ar acima de 100:");

        for (int i = 0; i < indicesQualidadeAr.length; i++) {
            if (indicesQualidadeAr[i] > 100) {
                System.out.println(cidades[i] + ": " + indicesQualidadeAr[i]);
            }
        }
    }

    }
