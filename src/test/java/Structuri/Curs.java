package Structuri;

import org.junit.Test;

public class Curs {

    //Structurile in programare sunt de 2 feluri: Alternative / Repetitive

    //Structuri Alternative se pot realiza folosind : if / then / else, swich case
    // Structuri repetitive se pot realiza folosind : for , while , for each

    @Test
    public void MetodsTest(){

        //Verificarenumar(15);
        //Verificarenumar(10);
        //Verificarenumar(3);
        //VerificareNumarParPozitiv(15);
        //VerificareNumarParPozitiv(12);
        //VerificareNumarParPozitiv(-3);
        //VerificareNumarParPozitiv(0);

        ZiuaSaptamana(4);
        ZiuaSaptamana(2);

    }

    // Verificam daca un nr este mai mare decat 10

    public void Verificarenumar(int numar){
        if (numar>10){

            System.out.println("Numarul este mai mare ca 10");
        }
        else {
            System.out.println("Numarul nu este mai mare ca 10");
        }
    }

    //Verificam daca un nr este par si pozitiv

    public void VerificareNumarParPozitiv(int numar) {

        if (numar > 0) {
            if (numar % 2 == 0) {
                System.out.println("Numarul "+numar+" este pozitiv si par");
            } else {
                System.out.println("Numarul "+numar+" este impar si pozitiv");
            }
        }

        else if (numar !=0){
            if (numar % 2 == 0) {
                System.out.println("Numarul "+numar+" este negativ si par");
            } else {
                System.out.println("Numarul "+numar+" este impar si negativ");
            }
        }
        if (numar ==0){
            System.out.println("Numarul "+numar+" este egal cu zero");
        }
        }



        //Facem o metoda cu swich case

        //Afisam ziua curenta din saptamana

    public void ZiuaSaptamana(int numar){

        switch (numar){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            default:
                System.out.println("Sfarsit");
        }
    }





    }

