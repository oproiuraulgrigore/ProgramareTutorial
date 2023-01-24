package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MancareTest {

    @Test

    public void MetodaTest() {
        //Declaram un obiect de tipul x

        List<String> IngredienteSupaPui = Arrays.asList("apa","morcovi","pui","taietei");

        Mancare SupaPui = new Mancare("Supa de pui","Supa de casa",IngredienteSupaPui,300);
        SupaPui.InfoMancare();

        List<String> IncredienteSarmale= Arrays.asList("sare","orez","varza","carne");

        Mancare Sarmale = new Mancare(" Sarmale","Traditionale",IncredienteSarmale,850);
        Sarmale.InfoMancare();

    }

}
