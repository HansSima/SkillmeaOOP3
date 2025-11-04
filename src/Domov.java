
public class Domov {
    //Toto jsou vlastnosti (fields)
    private float rozloha;
    private int pocetOken;
    private String material;
    private int pocetPoschodi;
    private boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float rozloha, int pocetOken, int pocetPoschodi){
        this.rozloha = rozloha;
        this.pocetOken = pocetOken;
        this.pocetPoschodi = pocetPoschodi;
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
