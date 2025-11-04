public class Stavba {
    protected float rozloha;
    protected int pocetPoschodi;
    protected int pocetOken;

    //Toto je metoda
    public float vypocetCenyDomu(int lukrativniOblast, String jmenoRodiny){
        System.out.println(jmenoRodiny);
        float vypocet = lukrativniOblast* (pocetOken*800 + rozloha*840);
        return vypocet;
    }
}
