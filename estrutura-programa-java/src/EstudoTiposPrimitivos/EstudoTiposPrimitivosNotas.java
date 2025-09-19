package EstudoTiposPrimitivos;
/*
 * Tipos primitivos são providos pela linguagem nativamente
 * 
 */
public class EstudoTiposPrimitivosNotas {
    public static void main(String[] args) {
        
        //Caracteres
        char primeiraLetraDoNome = 'B';
        char primeiraLetraDoNomeASCII = 66;

        System.out.println(primeiraLetraDoNome);
        System.out.println(primeiraLetraDoNomeASCII);

        //Tipos inteiros
        byte nota = 127;
        short itensComprados = 2;
        int CiriloIdade = 3713123;
        long DiguinhoIdade = 1213213123;

        System.out.println(nota);
        System.out.println(itensComprados);
        System.out.println(CiriloIdade);
        System.out.println("a idade é " + DiguinhoIdade);

        //Tipos decimais
        float peso = 1.5f;
        double preco = 24.99;
       
        System.out.println(peso);
        System.out.println(preco);


        //Tipos Boolean

        boolean Verdadeiro = false;
        boolean Falso = true;

        System.out.println(Verdadeiro);
        System.out.println(Falso);
    }

}
