public class Pes {
    private String rasa;
    private float hmotnost;
    private boolean jeSamec;
    private int pocetUlovenychKocek;

    Pes(String rasa, float hmotnost, boolean jeSamec, int pocetUlovenychKocek){
        this.rasa = rasa;
        this.hmotnost = hmotnost;
        this.jeSamec = jeSamec;
        this.pocetUlovenychKocek = pocetUlovenychKocek;
    }

    public void vydejZvuk(){
        System.out.println("Haf haf");
    }

}
