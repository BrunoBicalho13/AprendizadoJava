import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionBasics{
    public static void main(String[] args) {
        //String [] nomes = {"Bruno","Ane","Pedro"};
        //ArrayList<String> nomesArrayList = new ArrayList<>();
        List<String> nomesArrayList2 = new ArrayList<>(); //Boa prática
        nomesArrayList2.add("1");
        nomesArrayList2.add("2");
        nomesArrayList2.add("3");
        System.out.println(nomesArrayList2);

        
        // Outro Modo
        List<String> nomesArrayList3 = new ArrayList<>(){{
            add("1");
            add("2");
            add("3");
        }};
        System.out.println(nomesArrayList3);

        //Get
            
       /*  System.out.println(nomesArrayList3.get(0));
        System.out.println(nomesArrayList3.get(1));
        System.out.println(nomesArrayList3.get(2)); */
        
        //Insert / Update

        nomesArrayList3.set(0,"3");
        nomesArrayList3.set(1,"2");
        nomesArrayList3.set(2,"1");
        nomesArrayList3.add("0");
        System.out.println(nomesArrayList3);


        /* //Delete

        nomesArrayList3.remove(1);
        nomesArrayList3.remove("3");
        System.out.println(nomesArrayList3); */

        //Sort

        Collections.sort(nomesArrayList3);
        System.out.println(nomesArrayList3);


        for(String nome: nomesArrayList3){
            System.out.println(nome);
        }

        Iterator<String> it = nomesArrayList3.iterator();
        while(it.hasNext()){
            String itemAtual = it.next();
            System.out.println(itemAtual);
        }


        List<String> listadeNomes = List.of("Bruno","Ane","Pedro");
        System.out.println(listadeNomes);

        String[] arrayDeNomes = {"Bruno","Ane","Pedro"};
        List<String> listaConvertida = Arrays.asList(arrayDeNomes);
        System.out.println(listaConvertida);

        String[] arrayConvertido = listaConvertida.toArray(new String[0]);
        System.out.println("Array: " + Arrays.toString(arrayConvertido));


        Map<String, String> mapaDeUsuarios = new HashMap<>();
        mapaDeUsuarios.put("bruno","Bruno");
        mapaDeUsuarios.put("ane","Ane");
        mapaDeUsuarios.put("pedro","Pedro");
        System.out.println(mapaDeUsuarios);

        Map<String, String> mapaDeUsuarios2 = new HashMap<>(){{
            put("bruno","Bruno");
            put("ane","Ane");
            put("pedro","Pedro");  
        }};

        System.out.println(mapaDeUsuarios2);

        //get
        
        System.out.println(mapaDeUsuarios2.get("bruno"));
        System.out.println(mapaDeUsuarios2.get("ane"));
        System.out.println(mapaDeUsuarios2.get("pedro"));

        //Update
        
        mapaDeUsuarios2.put("bruno","Bruno Bicalho");
        System.out.println(mapaDeUsuarios2);

        // delete

        //mapaDeUsuarios2.remove("pedro");
        // System.out.println(mapaDeUsuarios2);

        for(String valores : mapaDeUsuarios2.values()){
            System.out.println(valores);
        }

        for(String chaves: mapaDeUsuarios2.keySet()){
            System.out.println(chaves);
        }
    }
}