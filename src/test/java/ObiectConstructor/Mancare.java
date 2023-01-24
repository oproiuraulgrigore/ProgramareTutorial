package ObiectConstructor;

import java.util.List;

public class Mancare {

    // Constructor = are ca rol sa initializeze variabilele unei clase
    // Constructorul are mereu acelas nume cu clasa
    // Intr-o clasa putem sa avem o multime de constructori ( delimitati prin nr / tip parametrii )
    // De cele mai multre ori constructorul este public
    // Daca intr-o clasa nu am declarat un constructor => Exista unul by default care nu are parametri

    // Obiect = Instanta unei clase
    // Dintr-o clasa putem face o multime de obiecte
    // Obiectele se diferenteaza prin numele lor
    // In momentul in care initializam un obiect => se apeleaza constructorul clasei


    public String Nume;

    public String Descriere;

    public List<String> Ingrediente;

    public Integer Calorii;


    // Declaram un constructor cu parametrii

    public Mancare (String Nume , String Descriere , List<String> Ingrediente , Integer Calorii){

        this.Nume = Nume;
        this.Descriere = Descriere;
        this.Ingrediente = Ingrediente;
        this.Calorii = Calorii;


    }

    public void InfoMancare (){

        System.out.println("Numele mancarii este"+Nume);
        System.out.println("Descrierea mancarii este "+Descriere);
        System.out.println("Incredientele pentru mancare sunt");
        for (int index = 0; index < Ingrediente.size(); index++) {
            System.out.println(Ingrediente.get(index));
        }
        System.out.println("Caloriile pentru mancare sunt "+Calorii);




    }





}
