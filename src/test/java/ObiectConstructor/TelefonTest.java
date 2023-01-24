package ObiectConstructor;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TelefonTest {


    @Test
    public void MetodaTest(){

        //Facem primul obiect de tipul telefon
        List<String>CaracteristiciSamsung = Arrays.asList("ecran:2px","ram:4gb","procesor:exinos");
        Telefon Samsung = new Telefon("Samsung","Galaxy S22",2021,"Android",CaracteristiciSamsung);
        Samsung.VechimeTelefon();
        Samsung.DiscountTelefon(20.0);

        List<String>CaracteristiciIphone = Arrays.asList("ecran:4px","ram:8gb","procesor:A16","spatiu de stocare : 128gb");
        Telefon Iphone = new Telefon("Iphone","Iphone7",2016,"IOS",CaracteristiciIphone);
        Iphone.VechimeTelefon();
        Iphone.PretTelefon();

        List<String>CaracteristiciHuawei = Arrays.asList("ecran:4px","ram:8gb","procesor:A16","spatiu de stocare : 128gb");
        Telefon Huawei = new Telefon("Huawei","p20",2010,"Android",CaracteristiciHuawei,2055.5);
        Huawei.VechimeTelefon();
        Huawei.PretTelefon();
        Huawei.DiscountTelefon(10.0);

    }


}
