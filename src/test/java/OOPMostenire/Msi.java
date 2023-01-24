package OOPMostenire;

import java.util.List;

public class Msi extends Laptop{

    public Boolean Luminite;
    List<String> Accesorii;

    public Msi(String brand, String model, String culoare, Integer dimensiuneEcran, String tip,Boolean Luminite,List<String> Accesorii) {
        super(brand, model, culoare, dimensiuneEcran, tip);
        this.Luminite = Luminite;
        this.Accesorii = Accesorii;
    }


    public void InfoMsi(){
        InfoLaptop();
        System.out.println("Are Luminite ? ");
        System.out.println("Accesorile sunt ");
    }
}
