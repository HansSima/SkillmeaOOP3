
public class Domov {
    //Toto jsou vlastnosti (fields)
    float rozloha;
    int pocetOken;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(){
        System.out.println("Toto se zavola pri vytvoreni noveho objektu");
    }

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(jmenoRodiny);
        float vypocet = lukrativniOblast* (pocetOken*800 + rozloha*840);
        return vypocet;
    }


}
