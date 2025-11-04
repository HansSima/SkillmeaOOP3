
public class Domov {
    //Toto jsou vlastnosti (fields)
    private float rozloha;
    private int pocetOken;
    private String material;
    private int pocetPoschodi;
    private boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float roz, int pocOken, int pocPoschodi){
        rozloha = roz;
        pocetOken = pocOken;
        pocetPoschodi = pocPoschodi;
    }

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(jmenoRodiny);
        float vypocet = lukrativniOblast* (pocetOken*800 + rozloha*840);
        return vypocet;
    }

    //Getter pro ziskani dat v private fields
    public int getPocetOken(){
        return pocetOken;
    }

    //Setter pro prepis dat v private field
    public void setPocetOken(int novyPocetOken){
        pocetOken = novyPocetOken;
    }

}
