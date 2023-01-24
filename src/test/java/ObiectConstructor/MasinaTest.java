package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MasinaTest {



    @Test
    public void MetodaTestMasina(){


        List<String> CaracteristiciSkoda = Arrays.asList("Motor 2L diesel","culoare neagra","cutie manuala");
        Masina Skoda = new Masina("Skoda","Octavia",2020,CaracteristiciSkoda,29350.00);
        Skoda.VechimeMasina();
        Skoda.DiscountMasina(25.00);

       List<String> CaracteristiciPeugeot = Arrays.asList("Motor 1.6L diesel","culoare neagra","cutie automata");
       Masina Peugeot = new Masina("Peugeot","508",2014,CaracteristiciPeugeot,24450.00);
       Peugeot.VechimeMasina();
       Peugeot.PretMasina();

       List<String>CaracteristiciBMW = Arrays.asList("Motor 3L diesel","culoare alba","cutie automata");
       Masina BMW = new Masina("BMW","X3",2010,CaracteristiciBMW,20245.00);
       BMW.VechimeMasina();
       BMW.PretMasina();
       BMW.DiscountMasina(10.0);

    }
}
