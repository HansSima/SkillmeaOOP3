
public class Domov {
    float rozloha;
    int pocetOken;
    String material;
    int pocetPoschodi;
    boolean jeAlarmZapnuty;

    public void vypocetCenyDomu(){
        System.out.println(pocetOken*800 + rozloha*840);
    }

}
