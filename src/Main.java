import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Vytvoreni novych objektu z tridy Domov
        Domov dumNovaku = new Domov(536f, 10, 3);
        Domov dumZajicu = new Domov(423f, 8, 2);
        Domov dumKraliku = new Domov(356f, 6, 4);

        //Volani metody vypocetCenyDomu
        float cenaDomuNovaku = dumNovaku.vypocetCenyDomu(1, "Novakovi");
        float cenaDomuZajicu = dumZajicu.vypocetCenyDomu(3, "Zajicovi");
        float cenaDomuKraliku = dumKraliku.vypocetCenyDomu(2, "Kralikovi");

        //Volani setter
        dumNovaku.setPocetOken(8);

        //Volani getter
        int pocetOkenNovaku = dumNovaku.getPocetOken();

        System.out.println(pocetOkenNovaku);
        System.out.println(cenaDomuZajicu + cenaDomuNovaku);







    }
}