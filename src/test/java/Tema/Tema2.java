package Tema;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tema2 {


    //PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI

    @Test
    public void MetodsTest(){
        Printeaza();
        Varsta();
        Nume();
        Data();
        Rezultat();
        Variabila();
        Produsul();
        Concateneaza();
        Adauga();
        Adauga1();
        Vocala();
        Numere1(20,40,55);
        Afiseaza();
        Numere2();
        Numere3();
        Pozitive();
        SumaNumerelor();
        ProdusulNumerelor();


    }

    public static void Printeaza() {
        System.out.println("Hello World!");

    }


    public static void Varsta(){
        int x = 26;
         System.out.println(x);

    }

    public static void Nume() {
        System.out.println("Raul");
        System.out.println("Oproiu");
    }


    public static void Data() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss ");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

    }


    public static void Rezultat(){
          int result = (2+(3*4)-3)/3;
        System.out.println(result);
    }

    public static void Variabila(){

        double numar1 = 10.9;
        double numar2 = 18.7;
        double numar3 = 36.9;
        double suma = numar1 + numar2 + numar3;

        System.out.println(suma);
    }

    public static void Produsul(){

        int numar1 = 15;
        int numar2 = 25;
        int product = numar1 * numar2;

        System.out.println(product);
    }

    public static void Concateneaza(){

        int numar =375;
        double numar2 = 66.5;
        String text = " Stiu ca am calculat bine";
        String rezultat = numar + numar2 + text;

        System.out.println(rezultat);
    }

    public static void Adauga(){

        String cuvant ="Salut";
        cuvant = cuvant.concat("M");

        System.out.println(cuvant);

    }

    public static void Adauga1(){

        String cuvant ="Hello";
        cuvant="H".concat(cuvant);

        System.out.println(cuvant);
    }

    public static void Vocala(){
        String  propo = "Ana are mere,pere,prune";
        String dupa = "";
        for (int i = 0; i < propo.length(); i++) {
            char c = propo.charAt(i);
            dupa += c;
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||c == 'A') {
                dupa += 'Z';
            }
        }
        System.out.println(dupa);
    }


    public static void Numere1(int numar1,int numar2,int numar3){

        int suma = numar1 + numar2;
        if (suma > numar3) {
            System.out.println("Suma primelor doua numere este mai mare decat al treilea numar. Suma este: " + suma);
        } else {
            System.out.println("Suma primelor doua numere  este mai mica decat al treilea numar.");
        }
    }

    public static void Afiseaza(){

        for(int i = 0; i < 5; i++){

            System.out.print("DA ");
        }


    }


    public static void Numere2(){

        int count = 0;

        for (int i = 1; count < 5; i++){
            if (i % 3 == 0){
                count++;
                System.out.println(i);

            }
        }
    }

    public static void Numere3(){
        int count = 0;

        for (int i = 1; count < 3; i++){
            if (i % 5 == 0){
                count++;
                System.out.println(i);
            }
        }
    }

    public static void Pozitive(){
        int count = 0;

        for (int i = 2; count < 4; i += 2){
            if ( i > 0){
                count++;
                System.out.println(i);
            }
        }

    }

    public static void SumaNumerelor(){
        int suma = 0;

        for (int i = 0; i <= 10; i++){

            suma= suma+i;
        }
        System.out.println(suma);

    }

    public static void ProdusulNumerelor(){
        int produs = 1;

        for(int i = 1; i <= 5; i++){
            produs = produs*i;
        }
        System.out.println(produs);


    }

    }


