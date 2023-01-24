package OOPMostenire;

import java.util.List;

public class Dacia extends Masina {


     public String Culoare;
     public List<String> DotariExterioare;
    public Dacia(String brand, String model, String transmisie, Integer pret, String Culoare, List<String> DotariExterioare) {
        //super = apeleaza constructorul din clasa parinte
        super(brand, model, transmisie, pret);
        this.Culoare = Culoare;
        this.DotariExterioare = DotariExterioare;
    }

    public void InfoDacia(){
        InfoMasina();
        System.out.println("Culoarea este "+Culoare);
        System.out.println("Dotarile exterioare sunt "+DotariExterioare);

    }

    public void CalculPretFinal(){

        Integer PretFinal;
        if(Culoare.contains("Metalizat")){
            PretFinal = getPret() + 500;

        }
        else {
            PretFinal = getPret() + 200;
        }
        //Calculam pretul pe baza dotarilor
        for (String Dotare: DotariExterioare){
            switch (Dotare){
                case "geamuri electrice":
                    PretFinal = PretFinal + 150;
                    break;
                case "Aer conditionat":
                    PretFinal = PretFinal + 450;
                    break;
            }

        }
        System.out.println("Pretul final al masinii este "+PretFinal);
    }

    //Suprascriu metoda din parinte

    public void ConducMasina(){
        System.out.println("Dacia de conduce cu volan pe stanga");
        super.ConducMasina();
    }


}
