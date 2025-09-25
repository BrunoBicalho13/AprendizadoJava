public class Matematica{
    public static final Double LIMITE_OPERACAO = 100.0;
    public static Double limite;

    static{
        limite = 100.0;
    } //Nao recomendado usar bloco static

    public static Double soma(double n1, double n2){
        double soma = n1 + n2;
        
        if(soma > LIMITE_OPERACAO){
            return LIMITE_OPERACAO;
        } else {
            return soma;
        }
    }

    public Double somaNaoEstatica(double n1, double n2){
       double soma = n1 + n2;
        
        if(soma > LIMITE_OPERACAO){
            return LIMITE_OPERACAO;
        } else {
            return soma;
        }
    }
}