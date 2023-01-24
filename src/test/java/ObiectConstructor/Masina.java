package ObiectConstructor;

import java.util.List;

public class Masina {


    public String Brand;
    public String Model;
    public Integer AnFabricatie;
    public List<String> Caracteristici;
    public Double Pret;



    public Masina(String brand, String model, Integer anFabricatie, List<String> caracteristici) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        Caracteristici = caracteristici;

    }

    public Masina(String brand, String model, Integer anFabricatie, List<String> caracteristici, Double pret) {
        Brand = brand;
        Model = model;
        AnFabricatie = anFabricatie;
        Caracteristici = caracteristici;
        Pret = pret;
    }

    public void VechimeMasina(){

        if(AnFabricatie >= 2018){
            System.out.println("Masina este in garantie ");
        }
        if (AnFabricatie >=2013 && AnFabricatie <= 2018){
            System.out.println("Itp-ul este valabil cate 2 ani ");
        }
        if (AnFabricatie<2013){
            System.out.println("Itp-ul trebuie facut in fiecare an ");
        }
    }
    public void PretMasina(){

        if (Pret!=null){
            System.out.println(Pret);
        }
        else {
            System.out.println("Masina este de expozitie ");
        }

    }
    public void DiscountMasina(Double Reducere) {

        if (Pret!=null){
            Double Diferenta = (Pret * Reducere) / 100;
            Double PretNou = Pret - Diferenta;
            System.out.println("Pretul masinii este cu discount-ul Rabla " + PretNou);
        }
        else {
            System.out.println("Masina este de expozitie ");
        }

    }



}
