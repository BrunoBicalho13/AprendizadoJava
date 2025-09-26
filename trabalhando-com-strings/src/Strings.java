import java.util.Arrays;

public class Strings {
    public static void main(String[] args) {
        String texto1 = "Texto customizado";
        String texto2 = "Texto customizado";
        String outroTexto = new String("Texto customizado"); // menos eficiente - usa mais memoria
        System.out.println(texto1);
        System.out.println(outroTexto);

        System.out.println(texto1 == outroTexto);
        System.out.println(texto1.equals(outroTexto));

        System.out.println(texto1 == texto2);

        //primeira maneira
       char[]texto1Array = texto1.toCharArray();
       for(char letra: texto1Array){
            if(letra == 'a'){
                System.out.println("Encontrou o a!");
            }
       }


       //segunda maneira
       for(char letra2: texto2.toCharArray()){
        if(letra2 == 'y'){
            System.out.println("Encontrou o y!");
        }
       }

       System.out.println(texto1.charAt(0));//primeiro char
       System.out.println(texto1.charAt(texto1.length() - 1)); // ultimo char


       System.out.println(texto1.toLowerCase());
       System.out.println(texto1.toUpperCase());


       String [] palavras = texto1.split(" ");
       String nomes = "Bruno, Ane, Pedro";
       System.out.println(Arrays.toString(palavras));
       System.out.println(Arrays.toString(nomes.split(", ")));


       String idade = "20";
       Integer idadeInt = Integer.valueOf(idade);
       idadeInt += 20;
       String idadeString = String.valueOf(idadeInt);
       idadeString += " de Idade";

       System.out.println(idadeInt);
       System.out.println(idadeString);

       String concatenacao = "Ela " + "é " + "muito " + "comum.";
       System.out.println(concatenacao);

       StringBuilder builder = new StringBuilder(); //normalmente mais eficiente
       builder.append("Ela ");
       builder.append("é ");
       builder.append("muito ");
       builder.append("comum.");
       System.out.println(builder.toString());


       String nome = "Bruno";
       String username = "bruno";
       String email = "bruno@email.com";

       String textoFormatado = "Olá, eu sou " + nome + ", meu usuário é " + username + ", e meu email é " + email;
       System.out.println(textoFormatado);

        String textoFormatado2 = """
        Olá, eu sou %s , meu usuário é %s e meu email é %s
        Eu posso ter 
        múltiplas linhas
        """
        .formatted(nome,username,email);
       System.out.println(textoFormatado2);

       
    }
}
