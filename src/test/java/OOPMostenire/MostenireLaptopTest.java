package OOPMostenire;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireLaptopTest {


    @Test
    public void MetodaTest(){

        System.out.println("==Asus==");

        List<String> AccesoriiAsus = Arrays.asList("manual de utilizare","Stick cu drivere");
        Asus ROG = new Asus("Asus","Ryujin","Negru",17,"Gaming","Bose",AccesoriiAsus);
        ROG.InfoAsus();

        System.out.println("==Msi==");

        List<String> AccesoriiMsi = Arrays.asList("antena WIFI","suport laptop");
        Msi Hawx = new Msi("Msi","SeaHawx","Rosy",15,"Office",true,AccesoriiMsi);
        Hawx.InfoMsi();
    }
}
