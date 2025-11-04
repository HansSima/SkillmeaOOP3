
public class Domov {
    float rozloha;
    int pocetOken;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;



    public float vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(jmenoRodiny);
        float vypocet = lukrativniOblast* (pocetOken*800 + rozloha*840);
        return vypocet;
    }


}
