public class Obchod extends Stavba {
    private int pocetPokladen;

    Obchod(float rozloha, int pocetPoschodi, int pocetPokladen){
        this.rozloha = rozloha;
        this.pocetPoschodi = pocetPoschodi;
        this.pocetPokladen = pocetPokladen;
    }

    public float vypocetCenyDomu(int lukrativniOblast, String nazevObchodu){
        System.out.println(nazevObchodu);
        float vypocet = lukrativniOblast* (pocetPokladen*800 + rozloha*840);
        return vypocet;
    }

}
