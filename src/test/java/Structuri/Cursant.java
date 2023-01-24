package Structuri;

import org.junit.Test;

public class Cursant {
    // Structuri repetitive: for, while , do while , for each





    @Test
    public void MetodeTest(){
        //NumereFor();
        //NumereWhile();
        //NumereDoWhile();
        //Numerediv();
        Numereimp(50);


    }

    //Afisam primele 10 numere;

    public void NumereFor(){

        for (int i = 0 ; i < 10; i++){
            System.out.println(i);
        }
    }


    public void NumereWhile(){

        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }
    }

    public void NumereDoWhile(){

        int i = 0;

        do {
            System.out.println(i);
            i++;
        }
        while (i<10);
    }

    public void Numerediv(){

        for ( int i = 0; i < 20;i++){
            if (i%3 == 0){
                System.out.println(i);
            }
        }
    }

    //Afisam numerele impare si divizibile cu 5 ( interval random)

    public void Numereimp(int x){

        for (int i =0; i < x ; i++){
            if (i%5 == 0 && i%2 == 1){
                System.out.println(i);
            }
        }


    }
}

