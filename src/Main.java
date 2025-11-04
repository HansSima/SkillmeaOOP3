import java.util.Random;

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

        float cenaDomuNovaku = dumNovaku.vypocetCenyDomu(1, "Novakovi");
        float cenaDomuZajicu = dumZajicu.vypocetCenyDomu(3, "Zajicovi");

        System.out.println(cenaDomuZajicu + cenaDomuNovaku);

        /*Random nahGen = new Random();
        nahGen.nextInt(1, 7);*/

    }
}