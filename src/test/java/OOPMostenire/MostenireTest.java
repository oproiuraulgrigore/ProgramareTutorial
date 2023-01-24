package OOPMostenire;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTest {


    @Test
    public void MetodaTest(){

        System.out.println("==obiecteDacia==");
        //Facem un obiect Dacia

        List<String> DotariExterioareLogan = Arrays.asList("geamuri electrice","aer conditionat");
        Dacia Logan = new Dacia("Dacia","Logan","Manuala",20000,"Alba",DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalculPretFinal();
        Logan.ConducMasina();

        List<String> DotariExterioareSandero = Arrays.asList("Oglinzi electrice","trapa panoramica");
        Dacia Sandero = new Dacia("Dacia","Sandero","Automata",10000,"Neagra",DotariExterioareSandero);
        Sandero.InfoDacia();

        System.out.println("==obiecteAudi==");

        List<String> DotariExterioareA3 = Arrays.asList("folie protectie vopsea","frane ventilate");
        List<String> DotariInterioareA3 = Arrays.asList("sistem sonorizare Bose","Scaune S-line");
        Audi A3 = new Audi("Audi","A3","automata",26000,DotariExterioareA3,DotariInterioareA3);
        A3.InfoAudi();
        A3.ConducMasina();

        List<String> DotariExterioareA6 = Arrays.asList("geamuri fumurii","bare portbagaj");
        List<String> DotariInterioareA6 = Arrays.asList("sistem sonorizare Harman Kardon","Scaune incalzite");
        Audi A6 = new Audi("Audi","A6","automata",43000,DotariExterioareA6,DotariInterioareA6);
        A6.InfoAudi();


        System.out.println("==obiecteBMW==");

        BMW X3 = new BMW("BMW","X3","automata",50000,true);
        X3.InfoBMW();
        X3.AfisareMasini();
        X3.AfisareMasini("Masina");
        X3.AfisareMasini(200);



    }

}
