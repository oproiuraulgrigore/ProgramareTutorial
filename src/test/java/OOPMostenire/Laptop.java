package OOPMostenire;

public class Laptop {

    public String Brand;
    public String Model;
    public String Culoare;
    public Integer DimensiuneEcran;
    public String Tip;

    public Laptop(String brand, String model, String culoare, Integer dimensiuneEcran, String tip) {
        Brand = brand;
        Model = model;
        Culoare = culoare;
        DimensiuneEcran = dimensiuneEcran;
        Tip = tip;
    }


    public void InfoLaptop() {

        System.out.println("Brandul este "+Brand);
        System.out.println("Modelul este "+Model);
        System.out.println("Culoarea este "+Culoare);
        System.out.println("DimensiuneaEcranului este"+DimensiuneEcran);
        System.out.println("Tipul laptopului este "+Tip);
    }
}
