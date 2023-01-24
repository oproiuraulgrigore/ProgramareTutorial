package OOPMostenire;

import java.util.List;

public class Audi extends Masina {


    public List<String> DotariExterioare;
    public List<String> DotariInterioare;
    public Audi(String brand, String model, String transmisie, Integer pret, List<String> DotariExterioare,List<String> DotariInterioare) {

        super(brand, model, transmisie, pret);
        this.DotariExterioare = DotariExterioare;
        this.DotariInterioare = DotariInterioare;
    }

    public void InfoAudi(){
        InfoMasina();
        System.out.println("Dotarile interioare sunt " + DotariInterioare);
        System.out.println("Dotarile exterioare sunt " + DotariExterioare);


    }

    //Suprascriem Metoda

    public  void ConducMasina(){
        System.out.println("Audi se conduce pe dreapta");
    }

}
