package VariabilaMetoda;

import org.junit.Test;

public class Masina {

    public String Marca;

    public String Model;

    public Integer CaiPutere;

    @Test
    public  void MetodaTest(){
        PrezentareMasina("Opel","Astra",100);
        PrezentareMasina("Audi","A5",200);

    }
    // O metoda poate sa primeasca parametrii.

    public void PrezentareMasina(String par1, String par2, int par3){

        Marca = par1;

        Model = par2;

        CaiPutere = par3;

        System.out.println(Marca);
        System.out.println(Model);
        System.out.println(CaiPutere);





    }

}
