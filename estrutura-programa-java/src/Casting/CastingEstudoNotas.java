package Casting;
 /*
  * Casting: Operação de transformar um tipo de dados em outro
  * Widening Casting vs Narrowing Casting
  */
public class CastingEstudoNotas {
    public static void main(String[] args) {
        // Widening Casting(Implícito)

        byte variavelPequena = 1;
        int variavelGrande = variavelPequena;

        short variavelShort = 10;
        int variavelInt = variavelShort;

        System.out.println(variavelGrande);
        System.out.println(variavelInt);

        //Narrowing Casting(Explícito)

        long variavelLong = 65656565L;
        int variavelInt2 = (int)variavelLong;
        System.out.println(variavelInt2);

        // Operações de divisão entre números inteiros
        int numero1 = 9;
        int numero2 = 2;
        float resultadoDivisao =  numero1 / (float) numero2;
        System.out.println(resultadoDivisao);
    }
}
