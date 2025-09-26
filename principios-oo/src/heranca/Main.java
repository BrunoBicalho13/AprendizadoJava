package heranca;

import heranca.superherois.HomemAranha;
import heranca.superherois.HomemDeFerro;
import heranca.superherois.SuperHeroi;
import heranca.superherois.ViuvaNegra;
import heranca.superherois.Avenger;

public class Main {
    public static void main(String[] args) {
        SuperHeroi[] superHerois = {
            new HomemAranha("Roupa Vermelha com Teias", new String[] {"Lançar teia"}),
            new HomemDeFerro("Armadura de Ferro", new String[] {"Ser Rico"}),
            new ViuvaNegra("Roupa de Couro Preta", new String[] {"Lutar Bem"}),
            //new SuperHeroi("meu traje", new String[] {"Contar Piada"})
        };

       System.out.println(SuperHeroi.tendencia);

        Avenger avenger = new HomemAranha("Roupa Vermelha com Teias", new String[] {"Lançar teia"});
        avenger.enterBuilding();
        
        validar(superHerois);

        for(SuperHeroi superHeroi : superHerois){
            System.out.println(superHeroi.getTraje());
            superHeroi.usarSuperPoder(0);
        }
    }

    static void validar(SuperHeroi[] superHerois){
        if (superHerois[0] instanceof HomemAranha){
            System.out.println("Lógica de validação do Homem Aranha");
        }
    }
}
