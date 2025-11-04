
public class Domov extends Stavba {
    //Toto jsou vlastnosti (fields)
    private String material;
    private boolean jeAlarmZapnuty;

    //Toto je konstruktor
    Domov(float rozloha, int pocetOken, int pocetPoschodi){
        this.rozloha = rozloha;
        this.pocetOken = pocetOken;
        this.pocetPoschodi = pocetPoschodi;
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
