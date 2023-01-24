package Multimi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {


    @Test
    public void MetodaTest(){
        //MultimeArray();
        //MultimeList();
        //MultimeValori();
        Orase();

    }


    //Array

    public void MultimeArray() {

        String[] nume = new String[5];

        nume[0] = "Radu";
        nume[1] = "Andreea";
        nume[2] = "Marius";
        nume[3] = "Cristian";
        nume[4] = "Florin";

        for ( int i = 0; i < nume.length; i++){
            System.out.println(nume[i]);
        }
    }

    // Lista

    public void MultimeList(){

        List<String> nume = new ArrayList<>();

        nume.add("Raul");
        nume.add("Andreea");
        nume.add("Irina");
        nume.add("Flavius");

        for (int i = 0; i < nume.size(); i++){
            System.out.println(nume.get(i));
        }
    }

    //hashmap
    //key = value

    public void MultimeValori(){
        //folbal, cana , acadea

        HashMap<String , String> Obiecte = new HashMap<>();

        Obiecte.put("Sport","folbal");
        Obiecte.put("Obiect","cana");
        Obiecte.put("Dulciuri","acadea");


        for (String Key: Obiecte.keySet()){
            System.out.println(Key+" " +Obiecte.get(Key));
        }


    }

    //Tari -Orase

    public void Orase() {

        List<String> OraseRO = new ArrayList<>();

        OraseRO.add("Cluj");
        OraseRO.add("Timisoara");
        OraseRO.add("Deva");


        List<String> OraseIT = new ArrayList<>();

        OraseIT.add("Napoli");
        OraseIT.add("Roma");
        OraseIT.add("Milano");


        List<String> OraseSP = new ArrayList<>();

        OraseSP.add("Barcelona");
        OraseSP.add("Madrid");
        OraseSP.add("Valencia");

        HashMap<String, List<String>> Tari = new HashMap<>();

        Tari.put("Romania", OraseRO);
        Tari.put("Italia", OraseIT);
        Tari.put("Spania", OraseSP);

        for (String Key : Tari.keySet()) {
            System.out.println(Key + " " + Tari.get(Key));
        }
    }


}
