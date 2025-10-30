

public class Main {
    public static void main(String[] args) {

        Domov dumNovaku = new Domov();
        dumNovaku.pocetOken = 12;
        dumNovaku.pocetPoschodi = 3;
        dumNovaku.rozloha = 421.5f;

        Domov dumZajicu = new Domov();
        dumZajicu.pocetOken = 24;
        dumZajicu.pocetPoschodi = 2;
        dumZajicu.rozloha = 853.6f;

        dumNovaku.vypocetCenyDomu();
        dumZajicu.vypocetCenyDomu();


    }
}