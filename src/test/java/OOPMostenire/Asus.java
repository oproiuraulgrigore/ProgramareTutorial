package OOPMostenire;

import java.util.List;

public class Asus extends Laptop {

    public String Difuzoare;
    public List<String> Accesorii;

    public Asus(String brand, String model, String culoare, Integer dimensiuneEcran, String tip,String Difuzoare,List<String> Accesorii) {

        super(brand, model, culoare, dimensiuneEcran, tip);
        this.Difuzoare = Difuzoare;
        this.Accesorii = Accesorii;

    }

    public void InfoAsus(){
        InfoLaptop();
        System.out.println("Difuzoarele sunt "+Difuzoare);
        System.out.println("Accesorile sunt "+Accesorii);
    }
}
