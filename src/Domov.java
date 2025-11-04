
public class Domov {
    float rozloha;
    int pocetOken;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;



    public void vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(lukrativniOblast* (pocetOken*800 + rozloha*840));
    }

}
