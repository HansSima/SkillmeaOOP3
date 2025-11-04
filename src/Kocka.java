public class Kocka extends Zvire {
    private int pocetUlovenychRyb;

    Kocka(String rasa, float hmotnost, boolean jeSamec, int pocetUlovenychRyb){
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.jeSamec = jeSamec;
        this.pocetUlovenychRyb = pocetUlovenychRyb;
    }

    public void vydejZvuk(){
        System.out.println("Mnau mnau");
    }

}
