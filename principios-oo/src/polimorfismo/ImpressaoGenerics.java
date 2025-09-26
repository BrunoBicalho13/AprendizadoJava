package polimorfismo;

import java.util.Arrays;

public class ImpressaoGenerics {
    public static void main(String[] args) {
        Trabalhador []trabalhadores ={new Cozinheiro(), new Medico(), new Programador()};


        imprimir(trabalhadores);
        imprimir(new Integer[] {1,2,3});
        imprimir(new String[] {"texto 1", "texto 2"});
    }

    private static <T> void imprimir(T[] trabalhadores){
        System.out.println(Arrays.toString(trabalhadores));
    }
}
