package OOPMostenire;

public class Masina {

    //OOP = Programare orientata obiect
    //Mostenire , Abstractizare , Incapsulare , Polimorfism = 4 concepte
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa ( Bunicii <= Nepoti )
    //Clasa care mosteneste se numeste clasa copil
    //Clasa care e mostenita se numeste clasa parinte
    //Mostenirea se face cu cuvantul extends
    //In Java o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa => trebuie sa apelam prima data constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa => Putem accesa orice variabila/ metoda din clasa parinte


    //Aplicam conceptul de incapsulare a datelor
    //Incapsularea datelor este conceptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam
    //Private = access control care restrictioneaza vizibilitatea variabilei la nivel de clasa , unde ii declarata
    //Ca sa accesam - modificam valorile unor variabile private ne folosim de conceptul get & set

    //Polimorfism = conceptul prin care o metoda poate avea mai multe forme
    //Este de 2 tipuri : dinamic ( override ) static ( overload )
    //Dinamic = intr=o ierarhie de clase obtinute prin mostenire o metoda poate avea mai multe implementari
    //Se aplica mereu cu mostenirea
    //Static = o metoda se poate diferentia prin numarul sau tipul parametrilor


    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul este "+Brand);
        System.out.println("Modelul este "+Model);
        System.out.println("Transmisia este "+Transmisie);
        System.out.println("Pretul este "+Pret);

    }

    //Polimorfism dinamic

    public void ConducMasina(){
        System.out.println("Masina se poate conduce");
    }



}
